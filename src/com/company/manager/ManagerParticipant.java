package com.company.manager;

import com.company.model.Participant;

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

    public static void modifyParticipant(Participant participant) throws IOException {
        File tmpFile = new File(file2.getAbsolutePath() + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file2));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(SEPARATOR);

            if(Integer.valueOf(values[0]) == participant.id){
                outputStream.write(participant.id + SEPARATOR + participant.nombre + SEPARATOR + participant.nacionalidad + SEPARATOR + participant.idteam + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }
        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file2);
    }

    public static Participant showParticipant(int id) throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(file2));

        Participant participant = null;
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(SEPARATOR);

            if(Integer.valueOf(values[0]) == id){
                participant = new Participant();
                participant.id = Integer.valueOf(values[0]);
                System.out.println(participant.nombre = values[1]);
                System.out.println(participant.nacionalidad = values[2]);
                System.out.println(participant.idteam = values[3]);
            }
        }

        inputStream.close();

        return participant;
    }
}
