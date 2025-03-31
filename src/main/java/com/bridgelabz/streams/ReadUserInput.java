package com.bridgelabz.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadUserInput {
    public static void main(String[] args){
        System.out.println("ready to give information");
        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            FileWriter fr=new FileWriter("output.txt",true);
        ){
            System.out.println("press control+d to terminate");
           int data;
            while((data=br.read())!=-1){
                //System.out.println((char)data);
                fr.write((char)data);

            }
            System.out.println("data succesfully send");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
