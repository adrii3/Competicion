package com.company.view.team;

import com.company.manager.ManagerEquipos;
import com.company.model.Team;

import java.io.IOException;
import java.util.Scanner;

public class DeleteTeamScreen {

    Team team = new Team();
    Scanner sc = new Scanner(System.in);

    public void show() throws IOException {
        System.out.println("Introduzca el id del equipo que desea borrar: ");
        team.id = sc.nextInt();

        ManagerEquipos.deleteTeam(team.id);

        System.out.println("Equipo borrado");
    }
}
