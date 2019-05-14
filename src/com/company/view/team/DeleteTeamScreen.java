package com.company.view.team;

import com.company.model.Team;

import java.util.Scanner;

public class DeleteTeamScreen {

    Team team = new Team();
    Scanner sc = new Scanner(System.in);

    public void show(){
        System.out.println("Introduzca el id del equipo que desea borrar");
        int id = sc.nextInt();
    }
}
