package com.company;

import java.util.Scanner;

public class TeamsScreen {
    int opcion;
    void show(){
        Scanner sc = new Scanner(System.in);
        opcion=sc.nextInt();
        System.out.println("MENU EQUIPOS");

        if(opcion == 1){
            System.out.println("MENU EQUIPOS");
            System.out.println("1.Inscribir equipos");
        }
    }


    void inscribirEquipo(){
        // pedir daots y guardar en fichero
    }
}
