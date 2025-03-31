package com.bridgelabz.streams;

import java.io.*;

public class FilterStreams {
    public static void main(String[] args){
        try(BufferedReader fr=new BufferedReader(new FileReader("input.txt"));
            BufferedWriter fw=new BufferedWriter(new FileWriter("output.txt"))
        ){
            int data;
            while((data= fr.read())!=-1){
                fw.write(Character.toLowerCase(data));
            }
            System.out.println("data copied");
        } catch (IOException e) {
            System.out.println("exception found");
        }
    }
}
