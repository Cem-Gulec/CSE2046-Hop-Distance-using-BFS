package com.company;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    public static ArrayList<String> file_elements = new ArrayList<>();
    public static ArrayList<Laptop> laptop_array = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        Main main = new Main();
        int num_computers;

        //calling argument
        File f = new File(args[0]);
        InputStream is = new FileInputStream(f);
        System.out.println(args[0]);

        if(args.length < 1)
            System.out.println("Error usage file\n");
        else
            System.out.println("file found\n");

        //reading text file
        main.read_file();

        num_computers = Integer.parseInt(file_elements.get(0));

        //creating laptop objects and storing them into an arraylist
        for(int i = 1; i < file_elements.size(); i+=3){
            laptop_array.add(new Laptop(Double.parseDouble(file_elements.get(i)),
                    Double.parseDouble(file_elements.get(i+1)),
                    Double.parseDouble(file_elements.get(i+2))));
        }

        for(Laptop l: laptop_array)
            System.out.println(l.getPos_x() + "  " + l.getPos_y() + "  " + l.getRange());

        System.out.println(main.calculate_distance(laptop_array.get(1).getPos_x(), laptop_array.get(1).getPos_y(),
                laptop_array.get(2).getPos_x(), laptop_array.get(2).getPos_y()));
    }

    public double calculate_distance(double x_1, double y_1, double x_2, double y_2){
        return Math.sqrt( Math.pow(Math.abs(x_2-x_1), 2) + Math.pow(Math.abs(y_2-y_1), 2) );
    }

    public void read_file(){

        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("test5.txt"));
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
    }
}
