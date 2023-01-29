db = db.getSiblingDB('quizdb');

db.createCollection('questions');

db.questions.insertMany([
    {
        "question": "",
        "answer1": "",
        "answer2": "",
        "answer3": ""
    },
    {
        "question": "",
        "answer1": "",
        "answer2": "",
        "answer3": ""
    }
])

db.createCollection('statistics');
