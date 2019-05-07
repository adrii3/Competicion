package com.company;

public class Main {

    public static void main(String[] args){

        File file = new File("myfile");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedWriter bufferedReader = new BufferedReader(new FileReader(file));

        String line = bufferedReader.readLine();

    }
}
