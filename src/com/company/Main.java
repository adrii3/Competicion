package com.company;

import com.company.view.clasification.ClasificationScreen;
import com.company.view.participant.ParticipantScreen;
import com.company.view.clasification.ResultScreen;
import com.company.view.team.TeamsScreen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a;
        while(true) {
            System.out.println("TORNEO: ");
            System.out.println("1.Equipos");
            System.out.println("2.Participantes");
            System.out.println("3.Resultados");
            System.out.println("4.Clasificacion");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion:");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    TeamsScreen TeamsScreen = new TeamsScreen();
                    TeamsScreen.show();
                    break;
                case 2:
                    ParticipantScreen ParticipantScreen = new ParticipantScreen();
                    ParticipantScreen.show();
                    break;
                case 3:
                    ResultScreen ResultScreen = new ResultScreen();
                    ResultScreen.show();

                    break;
                case 4:
                    ClasificationScreen ClasificationScreen = new ClasificationScreen();
                    ClasificationScreen.show();
                    break;
                case 5:
                    return;

            }
        }
    }

    class TestData {
        int id;
        String value;
        String value2;
    }


    static final String SEPARATOR = ":";
    static final String FILENAME = "myfile";

    static void create(TestData testData, File file) throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));

        outputStream.write(testData.id + SEPARATOR + testData.value + SEPARATOR + testData.value2 + "\n");

        outputStream.close();
    }

}
