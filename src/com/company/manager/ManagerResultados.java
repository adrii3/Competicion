package com.company.manager;

import com.company.model.Results;

import java.io.*;

public class ManagerResultados {

    static final String SEPARATOR = ":";
    static final String SEPARATOR2 = "-";
    static final String FILENAME = "ResultsFile";
    static File file = new File(FILENAME);

    public static void createResults(com.company.model.Results results) throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));
        outputStream.write(results.idteam1 + SEPARATOR + results.goles1 + SEPARATOR2 + results.goles2 + SEPARATOR + results.idteam2 + "\n");
        outputStream.close();
    }
    public void SumarPuntos(Results results, com.company.model.Team team) throws IOException {
        File tmpFile = new File(file.getAbsolutePath() + "Points");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while ((line = inputStream.readLine()) != null) {
            String[] values = line.split(SEPARATOR);

            if (Integer.valueOf(values[0]) == results.idteam1){
                if(results.idteam1 == team.id){
                    if(Integer.valueOf(values[1]) > Integer.valueOf(values[2])){
                        team.contadorequipo=team.contadorequipo + 3;
                        outputStream.write(team.id + SEPARATOR + team.contadorequipo);
                    }else if(Integer.valueOf(values[1]) == Integer.valueOf(values[2])){
                        team.contadorequipo= team.contadorequipo + 1;
                        outputStream.write(team.id + SEPARATOR + team.contadorequipo);
                    }
                }else if(Integer.valueOf(values[3]) == team.id){
                    if(Integer.valueOf(values[2]) > Integer.valueOf(values[1])){
                        team.contadorequipo = team.contadorequipo + 3;
                        outputStream.write(team.id + SEPARATOR + team.contadorequipo);
                    }else if(Integer.valueOf(values[2]) == Integer.valueOf(values[1])){
                        team.contadorequipo= team.contadorequipo + 1;
                        outputStream.write(team.id + SEPARATOR + team.contadorequipo);
                    }
                }
            }else if(Integer.valueOf(values[3]) == results.idteam2){
                if(results.idteam2 == team.id){
                    if(Integer.valueOf(values[2]) > Integer.valueOf(values[1])){
                        team.contadorequipo++;
                        outputStream.write(team.id + SEPARATOR + team.contadorequipo);
                    }else if(Integer.valueOf(values[2]) == Integer.valueOf(values[1])){
                        team.contadorequipo= team.contadorequipo + 1;
                        outputStream.write(team.id + SEPARATOR + team.contadorequipo);
                    }
                }
            }
            outputStream.close();
            inputStream.close();
        }
    }
}
