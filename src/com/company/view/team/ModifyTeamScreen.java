package com.company.view.team;

import com.company.model.Team;

import java.util.Scanner;

public class ModifyTeamScreen {

    public void show(){
        Team team = new Team();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el id del equipo");
        team.id = sc.nextInt();
        // buscar equipo en el fichero

        System.out.println("Modificar nombre: ");
        // modificar nombre
        System.out.println("Modificar ciudad: ");
        // modificar ciudad

        //poner modificacion en el fichero
    }
}
