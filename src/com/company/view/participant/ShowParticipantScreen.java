package com.company.view.participant;

import java.util.Scanner;

public class ShowParticipantScreen {

    public void show(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Que participantes quieres ver");
        int id = sc.nextInt();
        System.out.println(" id : " + id);

        //mostrar datos participante id

    }
}
