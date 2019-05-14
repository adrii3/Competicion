package com.company.view.participant;

import java.util.Scanner;

public class ModifyParticipantScreen {
    Scanner sc = new Scanner(System.in);

    public void show() {
        System.out.println("Introduzca el id del participante que desea modificar");


        int id = sc.nextInt();
        System.out.println(" id : " + id);

        System.out.println("Que quieres hacer");
        modify();
    }

    public void modify() {

        System.out.println("1. Modificar nombre");
        System.out.println("2. Modificar Equipo");
        System.out.println("3. Modificar Nacionalidad");

        int opcionModify = sc.nextInt();
        switch (opcionModify) {
            case 1:
                System.out.println("Introduzca el nombre correcto");
                String nombrecorrecto = sc.nextLine();
                System.out.println("El nombre es: "+nombrecorrecto);
                System.out.println("nombre actualizado");

                break;
            case 2:
                System.out.println("Introduzca el nuevo equipo");
                String equipocorrecto = sc.nextLine();
                System.out.println("El equipo es: "+equipocorrecto);
                System.out.println("Equipo actualizado");

                break;

            case 3:

                System.out.println("Introduzca la nacionalidd correcta");
                String nacionalidadcorrecta = sc.nextLine();
                System.out.println("El nombre es: "+nacionalidadcorrecta);
                System.out.println("Nacionalidad actualizada");
        }
    }
}

