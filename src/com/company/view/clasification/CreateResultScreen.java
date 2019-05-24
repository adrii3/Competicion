package com.company.view.clasification;

import com.company.manager.ManagerResultados;
import com.company.model.Results;

import java.io.IOException;
import java.util.Scanner;


public class CreateResultScreen {
    public void show() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Results results = new Results();
        ManagerResultados managerResultados = new ManagerResultados();

        System.out.println("Introduce el ID del equipo local:");
        results.idteam1= scanner.nextInt();
        System.out.println("Introduce el ID del equipo visitante:");
        results.idteam2= scanner.nextInt();

        System.out.println("Introduce los goles del local:");
        results.goles1= scanner.nextInt();
        System.out.println("Introduce los goles del visitante");
        results.goles2=scanner.nextInt();

        System.out.println("Resultado: " + "Local:" + results.idteam1 + " " + results.goles1 + "-" + results.goles2 + "Visitante" + results.idteam1);

        ManagerResultados.createResults(results);
    }
}
