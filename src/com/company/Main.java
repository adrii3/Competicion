package com.company;

import com.company.view.clasification.ClasificationScreen;
import com.company.view.participant.ParticipantScreen;
import com.company.view.clasification.ResultScreen;
import com.company.view.team.TeamsScreen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("TORNEO: ");
        System.out.println("1.Equipos");
        System.out.println("2.Participantes");
        System.out.println("3.Resultados");
        System.out.println("4.Clasificacion");
        System.out.println("Elige una opcion:");

        int opcion = sc.nextInt();

        switch (opcion){
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

        }
    }
}
