package com.company.view.clasification;

import com.company.manager.ManagerClasification;
import com.company.manager.ManagerResultados;
import com.company.model.Results;
import com.company.model.Team;

import java.io.IOException;

public class TeamClasificationScreen {

    public void show() throws IOException {
        ManagerClasification managerClasification = new ManagerClasification();
        ManagerResultados managerResultados = new ManagerResultados();
        Results results = new Results();
        Team team = new Team();

        managerResultados.SumarPuntos(results, team);
        //managerClasification.OrderByTeams();
    }
}
