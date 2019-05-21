package com.company.view.participant;

import com.company.manager.ManagerEquipos;
import com.company.manager.ManagerParticipant;
import com.company.model.Participant;
import com.company.model.Team;

import java.io.IOException;
import java.util.Scanner;

public class CreateParticipantScreen {

    public void show() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Participant participant = new Participant();

        System.out.println("Inscribir participante: ");

        System.out.println("ID: ");
        participant.id = scanner.nextInt();

        System.out.println("Nombre: ");
        participant.nombre = scanner.nextLine();

        System.out.println("Nacionalidad");
        participant.nacionalidad = scanner.nextLine();

        System.out.println("Equipo: ");
        participant.idteam = scanner.nextLine();

        ManagerParticipant.createParticipant(participant);

    }
}
