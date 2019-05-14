package com.company.view.participant;

import java.util.Scanner;

public class ModifyParticipantScreen {
    Scanner sc = new Scanner(System.in);

    public void show() {
        System.out.println("Introduzca el id del participante que desea modificar");
        int id = sc.nextInt();

        System.out.println("1. Introduzca nuevo nombre");
        String newname=sc.nextLine();

        System.out.println("2. Modificar Equipo");
        String newteam=sc.nextLine();

        System.out.println("3. Modificar Nacionalidad");
        String newnacionality=sc.nextLine();

        //modificar el fichero con los nuevos datos
    }
}

