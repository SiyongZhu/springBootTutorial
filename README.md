# springBootTutorial
My First Spring Boot Learning Project

Headers 
Content-Type: application/json

POST http://localhost:8080/topics
{
    "id": "java",
    "name": "Core Java",
    "description": "Java basics"
}

POST http://localhost:8080/topics/java/courses
{
    "id": "cmpt100",
    "name": "logic",
    "description": "basic java logic"
}

PUT http://localhost:8080/topics/java/courses/cmpt201
{
    "id": "cmpt201",
    "name": "framework1",
    "description": "Spring framework intro"
}
