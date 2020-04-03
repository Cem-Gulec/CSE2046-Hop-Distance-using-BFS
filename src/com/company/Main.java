package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        File f = new File(args[0]);
        InputStream is = new FileInputStream(f);
        System.out.println(args[0]);

        if(args.length < 1)
            System.out.println("Error usage file");
        else
            System.out.println("file found");

    }
}
