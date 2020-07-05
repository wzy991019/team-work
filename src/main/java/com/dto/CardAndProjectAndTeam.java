package com.dto;

import com.model.Cards;
import com.model.Project;
import com.model.Team;

/**
 * 卡片、套餐、项目
 */
public class CardAndProjectAndTeam extends Cards {
    private Project project;
    private Team team;

    public CardAndProjectAndTeam() {

    }

    public CardAndProjectAndTeam(Project project, Team team) {
        this.project = project;
        this.team = team;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CardAndProjectAndTeam{");
        sb.append(super.toString());
        sb.append(project);
        sb.append(team);
        sb.append("}");
        return sb.toString();
    }
}
