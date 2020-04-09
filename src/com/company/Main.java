package com.company;
import java.util.*;
import java.io.*;

public class Main {

    ArrayList<String> file_elements = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        Main main = new Main();

        //calling argument
        File f = new File(args[0]);
        InputStream is = new FileInputStream(f);
        System.out.println(args[0]);

        if(args.length < 1)
            System.out.println("Error usage file\n");
        else
            System.out.println("file found\n");

        main.read_file();

        //Graph g = new Graph(4);

    }

    public void read_file(){

        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("test2.txt"));
            String line = reader.readLine();
            while(line != null){
                //skipping lines containing explanation
                if(!line.contains("#")){
                    //splitting lines by spaces
                    String[] split = line.split("\\s+");
                    //storing each of them in an arraylist
                    for(String s : split)
                        file_elements.add(s);
                }
                line = reader.readLine();
            }
            reader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        for(String s: file_elements)
            System.out.println(s);

    }
}
