package com.company.view.team;

import com.company.model.Team;

import java.util.Scanner;

public class ShowTeamScreen {

    public void show(){
        Team team = new Team();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el id del equipo que desea ver: ");
        team.id = sc.nextInt();
        //buscar equipo en el fichero

        //Mostrar datos del equipo

    }
}
