package com.company.view.participant;

import com.company.manager.ManagerParticipant;
import com.company.model.Participant;

import java.io.IOException;
import java.util.Scanner;

public class ShowParticipantScreen {

    public void show() throws IOException {
        Scanner sc=new Scanner(System.in);
        Participant participant = new Participant();

        System.out.println("Que participante quieres ver");
        participant.id = sc.nextInt();

        ManagerParticipant.showParticipant(participant.id);
    }
}
