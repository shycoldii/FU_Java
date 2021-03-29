package com.example.demo.exception;

public class NotPutting extends RuntimeException{
    public NotPutting(Long id){
        super("Could not put entity. Put columns for " + id);
    }
}
