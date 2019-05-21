package com.company.view.team;

import com.company.manager.ManagerEquipos;
import com.company.model.Team;

import java.io.IOException;
import java.util.Scanner;

public class ModifyTeamScreen {

    public void show() throws IOException {
        Team team = new Team();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el id del equipo");
        team.id = sc.nextInt();

        sc.nextLine();

        System.out.println("Modificar nombre: ");
        team.nombre=sc.nextLine();

        System.out.println("Modificar ciudad: ");
        team.ciudad=sc.nextLine();

        ManagerEquipos.modifyTeam(team);
    }
}
