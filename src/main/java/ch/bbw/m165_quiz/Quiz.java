package ch.bbw.m165_quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Quiz {


    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        List<Integer> indexList = Arrays.asList(2,1,1,3,2);

        MongoDatabase database = mongoClient.getDatabase("quizdb");
        MongoCollection<Document> questions = database.getCollection("questions");
        MongoCollection<Document> statistics = database.getCollection("statistics");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        long startTime = System.nanoTime();
        int score = 0;
        int index = 0;
        long time;
        for (Document question : questions.find()) {
            System.out.println(question.get("question"));
            System.out.println("1) " + question.get("answer1"));
            System.out.println("2) " + question.get("answer2"));
            System.out.println("3) " + question.get("answer3"));
            System.out.print("Enter your choice (1, 2 or 3): ");
            Integer answer = input.nextInt();
            if (answer == indexList.get(index)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
        time = System.nanoTime() - startTime;

        Document object = new Document("name", username)
                .append("score", score)
                .append("time", time);

        statistics.insertOne(object);
        System.out.println("Quiz complete. Your score is: " + score);

        System.out.println("Alle bisherigen Versuche:");
        for (Document statistic : statistics.find()){
            System.out.print(statistic.get("name"));
            System.out.print(statistic.get("score"));
            System.out.print(statistic.get("time"));
        }

        input.close();
        mongoClient.close();
    }
}