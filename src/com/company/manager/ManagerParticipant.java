package com.company.manager;

import com.company.model.Participant;
import com.company.model.Team;

import java.io.*;

public class ManagerParticipant {
    static final String SEPARATOR = ":";
    static final String FILENAME = "participantFile";
    static File file2 = new File(FILENAME);

    public static void createParticipant(Participant participant) throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file2, true));
        outputStream.write(participant.id + SEPARATOR + participant.nombre + SEPARATOR + participant.nacionalidad + SEPARATOR + participant.idteam + "\n");
        outputStream.close();
    }

    public static void deleteParticipant(int id) throws IOException {
        File tmpFile = new File(file2.getAbsolutePath() + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file2));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while ((line = inputStream.readLine()) != null) {
            String[] values = line.split(SEPARATOR);

            if (Integer.valueOf(values[0]) != id) {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file2);

    }

    public static void modifyParticipant(Team team) throws IOException {
        File tmpFile = new File(file2.getAbsolutePath() + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file2));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(SEPARATOR);

            if(Integer.valueOf(values[0]) == team.id){
                outputStream.write(team.id + SEPARATOR + team.nombre + SEPARATOR + team.ciudad + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file2);
    }

    public static Team showParticipant(int id) throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(file2));

        Team team = null;
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(SEPARATOR);

            if(Integer.valueOf(values[0]) == id){
                team = new Team();
                team.id = Integer.valueOf(values[0]);
                System.out.println(team.nombre = values[1]);
                System.out.println(team.ciudad = values[2]);
            }
        }

        inputStream.close();

        return team;
    }
}
