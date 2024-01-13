package ua.com;

import ua.com.controller.Controller;
import ua.com.factory.JdbcFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JdbcFactory.getInstance().initDB(Main.class);
        Controller controller = new Controller();
        controller.start();
    }
}
