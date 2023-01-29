db = db.getSiblingDB('quizdb');

db.createCollection('questions');

db.questions.insertMany([
    {
        "question": "Wer ist der Rekormeister in der Schweiz?",
        "answer1": "FC Basel",
        "answer2": "Grasshopper Club",
        "answer3": "FC Zürich"
    },
    {
        "question": "Wer ist der Rekormeister in Deutschland?",
        "answer1": "Bayern München",
        "answer2": "Borussia Dortmund",
        "answer3": "1. FC Nürnberg"
    },
    {
        "question": "Wer ist der Rekormeister in Österreich?",
        "answer1": "SK Rapid Wien",
        "answer2": "FK Austria Wien",
        "answer3": "Red Bull Salzburg"
    },
    {
        "question": "Wer ist der Rekormeister in Belgien?",
        "answer1": "FC Brügge",
        "answer2": "Royale Union Saint-Gilloise",
        "answer3": "RSC Anderlecht"
    },
    {
        "question": "Wer ist der Rekormeister in der Niederlande??",
        "answer1": "PSV Eindhoven",
        "answer2": "Ajax Amsterdam",
        "answer3": "Feyenoord Rotterdam"
    },
    {
        "question": "Wer ist der Rekormeister in Frankreich?",
        "answer1": "AS Saint-Étienne",
        "answer2": "FC Paris Saint-Germain",
        "answer3": "Olympique Marseille"
    },
    {
        "question": "Wer ist der Rekormeister in England?",
        "answer1": "FC Arsenal",
        "answer2": "FC Liverpool",
        "answer3": "Manchester United"
    },
    {
        "question": "Wer ist der Rekormeister in Portugal?",
        "answer1": "FC Porto",
        "answer2": "Sporting Lissabon",
        "answer3": "Benfica Lissabon"
    },
    {
        "question": "Wer ist der Rekormeister in Italien?",
        "answer1": "Inter Mailand",
        "answer2": "Juventus Turin",
        "answer3": "AC Mailand"
    },
    {
        "question": "Wer ist der Rekormeister in Spanien?",
        "answer1": "Real Madrid",
        "answer2": "Atlético Madrid",
        "answer3": "FC Barcelona"
    }
])

db.createCollection('statistics');
