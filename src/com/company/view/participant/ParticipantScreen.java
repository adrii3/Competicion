package com.company.view.participant;

import com.company.view.team.ModifyTeamScreen;

import java.io.IOException;
import java.util.Scanner;

public class ParticipantScreen {
    int opcion;
    public void show() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU PARTICIPANTES:");
        System.out.println("1.Inscribir participante");
        System.out.println("2.Modificar participante");
        System.out.println("3.Borrar participante");
        System.out.println("4.Mostrar participantes");
        System.out.println("5.Volver ");
        System.out.println("Elige opcion:");

        opcion=sc.nextInt();

        switch (opcion){
            case 1:
                new CreateParticipantScreen().show();

                break;
            case 2:
                new ModifyParticipantScreen().show();

                break;
            case 3:
                new DeleteParticipantScreen().show();
                break;
            case 4:
                new ShowParticipantScreen().show();
                break;
            case 5:
                return;

        }
    }
}
