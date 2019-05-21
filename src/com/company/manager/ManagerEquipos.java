package com.company.manager;

import com.company.model.Team;

import java.io.*;

public class ManagerEquipos {

    static final String SEPARATOR = ":";
    static final String FILENAME = "myfile";
    static File file = new File(FILENAME);

    public static void createTeam(Team team) throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));
        outputStream.write(team.id + SEPARATOR + team.nombre + SEPARATOR + team.ciudad + "\n");
        outputStream.close();
    }

    public static void deleteTeam(int id) throws IOException {
        File tmpFile = new File(file.getAbsolutePath() + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
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

        tmpFile.renameTo(file);

    }
}
