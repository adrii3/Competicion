package com.company.view.participant;

import com.company.manager.ManagerEquipos;
import com.company.model.Team;

import java.util.Scanner;

public class CreateParticipantScreen {

    public void show(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inscribir participante");

        System.out.println("Nombre: ");
        Team team = new Team();
        team.nombre = scanner.nextLine();
//        team.ciudad =

        ManagerEquipos.createTeam(team);
    }
}
