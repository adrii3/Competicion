package com.company.view;

import java.util.Scanner;

public class TeamsScreen {
    int opcion;
    public void show(){
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU EQUIPOS:");
        System.out.println("1.Inscribir equipo");
        System.out.println("2.Modificar equipo");
        System.out.println("3.Borrar equipo");
        System.out.println("4.Mostrar equipos");
        System.out.println("Elige opcion:");

        opcion=sc.nextInt();

        switch (opcion){
            case 1:
                new CreateTeamScreen().show();
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
