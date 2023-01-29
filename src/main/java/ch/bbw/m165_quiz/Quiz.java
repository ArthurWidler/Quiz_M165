package ch.bbw.m165_quiz;

import java.util.Scanner;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Quiz {

    private String answer1;

    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        MongoDatabase database = mongoClient.getDatabase("quizdb");
        MongoCollection<Document> collection = database.getCollection("questions");
        Scanner input = new Scanner(System.in);
        int score = 0;
        for (Document question : collection.find()) {
            System.out.println(question.get("question"));
            System.out.println("A) " + question.get("optionA"));
            System.out.println("B) " + question.get("optionB"));
            System.out.println("C) " + question.get("optionC"));
            System.out.println("D) " + question.get("optionD"));
            System.out.print("Enter your choice: ");
            String answer = input.nextLine();
            // counter hoch zählen und dann im if immer answer = answer count
            if (answer.equalsIgnoreCase((String) question.get("answer"))) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
        System.out.println("Quiz complete. Your score is: " + score);
        input.close();
        mongoClient.close();
    }

}
