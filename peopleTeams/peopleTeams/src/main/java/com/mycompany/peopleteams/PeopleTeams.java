package com.mycompany.peopleteams;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleTeams {

    public static void main(String[] args) throws FileNotFoundException {
        String userDir = System.getProperty("user.dir");
        csvProcess csvProcessor = new csvProcess();
        List<person> persons = csvProcessor.getList(userDir + "/src/main/java/com/mycompany/peopleteams/"  + "MOCK_DATA.csv");
        List<team> teams = new ArrayList<team>();
        
        while(!persons.isEmpty()) {
            teams.add(buildTeam(persons));
        }
        
        teams.forEach(team -> {
            System.out.println(team.getTeam());
        });
        
        
    }
    
    public static team buildTeam(List<person> people) {
        Random randomPerson = new Random();
        List<person> newTeamComposition = new ArrayList<person>();
        for (int i = 0; i < 5; i++) {
            int listSize = people.size();
            int randomIndex = randomPerson.nextInt(listSize);
            newTeamComposition.add(people.get(randomIndex));
            people.remove(randomIndex);
        }
        
        return new team(newTeamComposition);
    }
}
