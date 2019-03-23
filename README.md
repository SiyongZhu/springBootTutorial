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


To package the web app
cd path/to/SpringBootTutorial
mvn clean install
java -jar target/SpringBoot-0.0.1-SNAPSHOT.jar

**Create Mongo DB In Docker Container** 
```
docker pull mongo 4.0.4
```
  1 _Create a volume container_ 
```
docker run -d --volume /data/db --name vc_mongo_shared alpine echo Data container
docker run -d --volumes-from vc_mongo_shared -p 27017-27019:27017-27019 --name my_mongodb mongo:4.0.4
```
  2 _Shell into container_
```docker exec -it my_mongodb bash ```

  - Inside container shell

```root@container_id:/# mongo```  <- log into mongo db
