package com.company.view.team;

import com.company.manager.ManagerEquipos;
import com.company.model.Team;

import java.io.IOException;
import java.util.Scanner;

public class ShowTeamScreen {

    public void show() throws IOException {
        Team team = new Team();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el id del equipo que desea ver: ");

        team.id = sc.nextInt();

        ManagerEquipos.showTeam(team.id);

    }
}
