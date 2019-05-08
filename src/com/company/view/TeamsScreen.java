package com.company.view;

import java.util.Scanner;

public class TeamsScreen {
    int opcion;
    public void show(){
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU EQUIPOS:");
        System.out.println("1.Inscribir equipo");
        System.out.println("2.Modificar equipo");
        System.out.println("3.Borrar equipo");
        System.out.println("4.Mostrar equipos");
        System.out.println("Elige opcion:");

        opcion=sc.nextInt();

        switch (opcion){
            case 1:
                CreateTeamScreen CreateTeamScreen = new CreateTeamScreen();
                CreateTeamScreen.pedirDatosEquipo();
                break;
            case 2:
                ModifyTeamScreen ModifyTeamScreen = new ModifyTeamScreen();
                ModifyTeamScreen.modificarEquipo();
                break;
            case 3:
                //crear clase borrar equipo
                //llamar al metodo borrar equipo
                break;
            case 4:
                //crear clase mostrar equipos
                //llamar metodos mostrar equipos
                break;

        }

    }
}
