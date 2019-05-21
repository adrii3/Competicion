package com.company.view.participant;

import com.company.manager.ManagerParticipant;
import com.company.model.Participant;

import java.util.Scanner;

public class ModifyParticipantScreen {
    Scanner sc = new Scanner(System.in);
    Participant participant = new Participant();
    public void show() {
        System.out.println("Introduzca el id del participante que desea modificar");
         participant.id = sc.nextInt();

        System.out.println("1. Introduzca nuevo nombre");
        String newname=sc.nextLine();

        System.out.println("2. Modificar Equipo");
        String newteam=sc.nextLine();

        System.out.println("3. Modificar Nacionalidad");
        String newnacionality=sc.nextLine();

        ManagerParticipant.modifyParticipant();
    }
}

