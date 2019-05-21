package com.company.view.participant;

import com.company.manager.ManagerParticipant;
import com.company.model.Participant;

import java.io.IOException;
import java.util.Scanner;

public class DeleteParticipantScreen {

    public void show() throws IOException {
        Participant participant = new Participant();
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige al participante que quieres eliminar (ID)");

         participant.id = sc.nextInt();

        ManagerParticipant.deleteParticipant(participant.id);

    }
}
