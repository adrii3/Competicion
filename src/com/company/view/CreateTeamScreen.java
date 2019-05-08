package com.company.view;

import com.company.manager.ManagerEquipos;
import com.company.model.Team;

import java.util.Scanner;

public class CreateTeamScreen {

    public void pedirDatosEquipo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("INSCRIBIR EQUIPO");

        System.out.println("Nombre: ");
        Team team = new Team();
        team.nombre = scanner.nextLine();
//        team.ciudad =

        ManagerEquipos.createTeam(team);
    }
}
