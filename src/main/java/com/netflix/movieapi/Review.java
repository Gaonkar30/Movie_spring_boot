package com.netflix.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private ObjectId id;
    private String body;

    // Constructor with all arguments
    public Review(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }

    // Constructor with only body
    public Review(String reviewBody) {
        this.body = reviewBody;
    }

    // No-argument constructor
    public Review() {
    }

    // Getters and setters
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
