package ua.com.alevel;

import ua.com.alevel.test.Message;
import ua.com.alevel.depends.Depends;

public class Goodbye {

    public static void main(String[] args) {
//        ua.com.alevel.test.New_Message m = new ua.com.alevel.test.New_Message();

        New_Message m = new Message();
        byte b = Byte.MAX_VALUE;
        byte b1 = Byte.MIN_VALUE;
        short s = Short.MAX_VALUE;
        int a = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        m.print(String.valueOf(b));
        m.print(String.valueOf(b1));
        m.print(String.valueOf(s));
        m.print(String.valueOf(a));
        m.print(String.valueOf(l));

        System.out.println();
        Depends d = new Depends();
        d.console("Hello World");
    }
}