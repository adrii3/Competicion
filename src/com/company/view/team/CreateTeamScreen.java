package com.company.view.team;

import com.company.manager.ManagerEquipos;
import com.company.model.Team;

import java.io.IOException;
import java.util.Scanner;

public class CreateTeamScreen {

    public void show() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();

        System.out.println("Inscribir equipo");

        System.out.println("ID: ");
        team.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nombre: ");
        team.nombre = scanner.nextLine();

        System.out.println("Ciudad: ");
        team.ciudad = scanner.nextLine();

        ManagerEquipos.createTeam(team);
    }
}
