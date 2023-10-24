package com.mycompany.peopleteams;

import java.util.List;

/**
 *
 * @author taciana albertina amorim de oliveira
 */


public class team {

    private List<person> people;
    private String teamName;
    
    public team(List<person> people) {
        try {
            this.people = people;
            this.teamName = nameGenerator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private String nameGenerator () {
        String teamName = new String();
        
        for (person people1 : this.people) {
            teamName = teamName.concat(String.valueOf(people1.getName().charAt(0)));
        }
        
        
        return teamName;
    }
    
   public String getTeam() {
    String teamProperties = 
        "\nTeam Name: " + this.teamName + "\n" +
        "Members:\n";

    for (person people1 : this.people) {
        teamProperties = teamProperties.concat("\n" + people1.getPerson()  + "\n"); // Creates a formatted string containing the team name and team members.
    }

    teamProperties = teamProperties.concat("\n"); // Correction: Adds a blank line after the team members list.

    return teamProperties; // Returns the team properties as a string.
}
    
}
