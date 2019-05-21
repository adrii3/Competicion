//package com.company;
//
//
//import java.io.*;
//
//class Team {
//    int id;
//    String value;
//    String value2;
//}
//
//public class Main2 {
//
//    static final String SEPARATOR = ":";
//    static final String FILENAME = "myfile";
//
//    public static void main(String[] args) throws IOException {
//        File file = new File(FILENAME);
//
//        String fqual = tal("ohfds" ,324324, "dflksfdlk");
//        // borrar datos previos
//        file.delete();
//
//        Team team = new Team();
//
//        team.id = 11;
//        team.value = "abcd";
//        team.value2 = "6789";
//        create(team, file);
//
////        team.id = 22;
////        team.value = "lmno";
////        team.value2 = "4567";
////        create(team, file);
////
////        Team team = new Team();
////
////        team.id = 11;
////        team.value = "abcd";
////        team.value2 = "6789";
////        create(team, file);
////
//////        team.id = 22;
//////        team.value = "lmno";
//////        team.value2 = "4567";
//////        create(team, file);
//////
//////        team.id = 33;
//////        team.value = "hijk";
//////        team.value2 = "9012";
//////        create(team, file);
//////
//////        team.id = 44;
//////        team.value = "pqrs";
//////        team.value2 = "5432";
//////        create(team, file);
//////
//////        Team testData33 = read(33, file);
//////        if(testData33 != null){
//////            System.out.println(testData33.id +" " + testData33.value + " "+ testData33.value2);
//////        }
//////
//////        team.id = 22;
//////        team.value = "wxyz";
//////        update(team, file);
//////
//////        team.id = 33;
//////        delete(team, file);
//////
//////        testData33 = read(33, file);
//////        if(testData33 != null){
//////            System.out.println(testData33.id +" " + testData33.value + " "+ testData33.value2);
//////        } else {
//////            System.out.println("id: 33 not found");
//////        }
////    }
////
////    private static Team[] tal(String ohfds, int i, String dflksfdlk) {
////        return new Team[0];
////    }
////
////    static void create(Team team, File file) throws IOException {
////        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));
////        outputStream.write(team.id + SEPARATOR + team.value + SEPARATOR + team.value2 + "\n");
////        outputStream.close();
////    }
////
////    static Team read(int id, File file) throws IOException {
////        BufferedReader inputStream = new BufferedReader(new FileReader(file));
////
////        Team team = null;
////        String line;
////        while((line = inputStream.readLine()) != null){
////            String[] values = line.split(SEPARATOR);
////
////            if(Integer.valueOf(values[0]) == id){
////                team = new Team();
////                team.id = Integer.valueOf(values[0]);
////                team.value = values[1];
////                team.value2 = values[2];
////            }
////        }
////
////        inputStream.close();
////
////        return team;
////    }
////
////    static void update(Team team, File file) throws IOException {
////        File tmpFile = new File(file.getAbsolutePath() + "tmp");
////
////        BufferedReader inputStream = new BufferedReader(new FileReader(file));
////        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));
////
////        String line;
////        while((line = inputStream.readLine()) != null){
////            String[] values = line.split(SEPARATOR);
////
////            if(Integer.valueOf(values[0]) == team.id){
////                outputStream.write(team.id + SEPARATOR + team.value + SEPARATOR + team.value2 + "\n");
////            } else {
////                outputStream.write(line + "\n");
////            }
////        }
////
////        outputStream.close();
////        inputStream.close();
////
////        tmpFile.renameTo(file);
////    }
////
////    static void delete(Team team, File file) throws IOException {
////        File tmpFile = new File(file.getAbsolutePath() + "tmp");
////
////        BufferedReader inputStream = new BufferedReader(new FileReader(file));
////        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));
////
////        String line;
////        while((line = inputStream.readLine()) != null){
////            String[] values = line.split(SEPARATOR);
////
////            if(Integer.valueOf(values[0]) != team.id){
////                outputStream.write(line + "\n");
////            }
////        }
//    }
//
//    private static Team[] tal(String ohfds, int i, String dflksfdlk) {
//        return new Team[0];
//    }
//
//    static void create(Team team, File file) throws IOException {
//        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));
//        outputStream.write(team.id + SEPARATOR + team.value + SEPARATOR + team.value2 + "\n");
//        outputStream.close();
//    }
//
//    static Team read(int id, File file) throws IOException {
//        BufferedReader inputStream = new BufferedReader(new FileReader(file));
//
//        Team team = null;
//        String line;
//        while((line = inputStream.readLine()) != null){
//            String[] values = line.split(SEPARATOR);
//
//            if(Integer.valueOf(values[0]) == id){
//                team = new Team();
//                team.id = Integer.valueOf(values[0]);
//                team.value = values[1];
//                team.value2 = values[2];
//            }
//        }
//
//        inputStream.close();
//
//        return team;
//    }
//
//    static void update(Team team, File file) throws IOException {
//        File tmpFile = new File(file.getAbsolutePath() + "tmp");
//
//        BufferedReader inputStream = new BufferedReader(new FileReader(file));
//        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));
//
//        String line;
//        while((line = inputStream.readLine()) != null){
//            String[] values = line.split(SEPARATOR);
//
//            if(Integer.valueOf(values[0]) == team.id){
//                outputStream.write(team.id + SEPARATOR + team.value + SEPARATOR + team.value2 + "\n");
//            } else {
//                outputStream.write(line + "\n");
//            }
//        }
//
//        outputStream.close();
//        inputStream.close();
//
//        tmpFile.renameTo(file);
//    }
//
//    static void delete(Team team, File file) throws IOException {
//        File tmpFile = new File(file.getAbsolutePath() + "tmp");
//
//        BufferedReader inputStream = new BufferedReader(new FileReader(file));
//        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));
//
//        String line;
//        while((line = inputStream.readLine()) != null){
//            String[] values = line.split(SEPARATOR);
//
//            if(Integer.valueOf(values[0]) != team.id){
//                outputStream.write(line + "\n");
//            }
//        }
//
//        outputStream.close();
//        inputStream.close();
//
//        tmpFile.renameTo(file);
//    }
//}
