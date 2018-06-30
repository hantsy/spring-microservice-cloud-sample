package com.example.demo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private String title;
    private String body;

    @Builder.Default
    private Type type = Type.MESSAGE;

    static enum Type {
        WARNING, ERROR, MESSAGE;
    }
}
