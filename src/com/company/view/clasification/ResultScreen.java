package com.company.view.clasification;

import java.util.Scanner;

public class ResultScreen {
    int opcion;
    public void show(){


        Scanner sc = new Scanner(System.in);

        System.out.println("MENU RESULTADOS:");
        System.out.println("1.Introducir Resultado");


        opcion=sc.nextInt();

        switch (opcion){
            case 1:
                new CreateResultScreen() .show();
                break;

        }

    }
}
