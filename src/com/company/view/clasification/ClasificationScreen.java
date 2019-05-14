package com.company.view.clasification;

import java.util.Scanner;

public class ClasificationScreen {

    public void show(){
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU CLASIFICACION:");
        System.out.println("1.Por equipos");
        System.out.println("2.Por participantes");

        System.out.println("Elige opcion:");

        opcion=sc.nextInt();

        switch (opcion){
            case 1:
                new TeamClasificationScreen().show();
                break;
            case 2:
                new ParticipantClasificationScreen().show();aaaa
                break;
        }
    }
}
