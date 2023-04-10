package com.example.webfluxexample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFluxExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxExampleApplication.class, args);
//        MongoClient mongoClient = new MongoClient("localhost:27017",27017);
//        System.out.println("Connect Ok!");
//        MongoDatabase db = mongoClient.getDatabase("employee");
//        MongoClient client = MongoClients.create("mongodb://127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&appName=mongosh+1.8.0");
//        MongoDatabase db = client.getDatabase("employee");
    }

}
