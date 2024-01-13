package ua.com;

import ua.com.controller.Controller;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            new Controller().start();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}