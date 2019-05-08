package com.company.view;

import java.util.Scanner;

public class ParticipantScreen {
    int opcion;
    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU PARTICIPANTES:");
        System.out.println("1.Inscribir participante");
        System.out.println("2.Modificar participante");
        System.out.println("3.Borrar participante");
        System.out.println("4.Mostrar participantes");
        System.out.println("Elige opcion:");

        opcion=sc.nextInt();

        switch (opcion){
            case 1:

                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;

        }
    }
}
