package com.company;

import com.company.view.TeamsScreen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("TORNEO: ");
        System.out.println("1.Equipos");
        System.out.println("2.Participantes");
        System.out.println("3.Resultados");
        System.out.println("4.Clasificacion");
        System.out.println("Elige una opcion:");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                new TeamsScreen().show();
                break;
            case 2:
                // particpantes....
                break;
            case 3:

                break;
            case 4:

                break;

        }
    }
}
