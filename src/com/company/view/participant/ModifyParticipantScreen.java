package com.company.view.participant;

import com.company.manager.ManagerParticipant;
import com.company.model.Participant;

import java.io.IOException;
import java.util.Scanner;

public class ModifyParticipantScreen {
    Scanner sc = new Scanner(System.in);
    Participant participant = new Participant();
    public void show() throws IOException {
        System.out.println("Introduzca el id del participante que desea modificar");
        participant.id = sc.nextInt();

        sc.nextLine();

        System.out.println("1. Introduzca nuevo nombre");
        participant.nombre = sc.nextLine();

        System.out.println("2. Modificar nacionalidad");
        participant.nacionalidad = sc.nextLine();

        System.out.println("3. Modificar equipo");
        participant.idteam = sc.nextLine();

        ManagerParticipant.modifyParticipant(participant);
    }
}

