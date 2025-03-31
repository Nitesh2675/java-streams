package com.bridgelabz.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args){
        try(FileInputStream fi=new FileInputStream("input.txt");
        FileOutputStream fo=new FileOutputStream("output")){
            int data;
            while((data=fi.read())!=-1){
                fo.write(Character.toLowerCase(data));
            }
            System.out.println("data copied");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
