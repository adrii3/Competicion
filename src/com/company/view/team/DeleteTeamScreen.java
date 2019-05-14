package com.company.view.team;

import com.company.model.Team;

import java.util.Scanner;

public class DeleteTeamScreen {

    Team team = new Team();
    Scanner sc = new Scanner(System.in);

    public void show(){
        System.out.println("Introduzca el id del equipo que desea borrar: ");
        team.id = sc.nextInt();
        // buscar id del equipo en el fichero

        //borrar equipo del fichero
        System.out.println("Equipo borrado");
    }
}
