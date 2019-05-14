package com.company.view.participant;

import java.util.Scanner;

public class DeleteParticipantScreen {

    public void show(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige al participante que quieres eliminar");

        int id = sc.nextInt();
        System.out.println(" id : " + id);

        //eliminar partcipante id, . y flan

    }
}
