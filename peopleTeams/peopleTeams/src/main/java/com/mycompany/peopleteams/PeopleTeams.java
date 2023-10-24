package com.mycompany.peopleteams;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author taciana albertina amorim de oliveira
 */

/**
 *
 * @author taciana albertina amorim de oliveira
 */

// Main class called PeopleTeams.
public class PeopleTeams {

    public static void main(String[] args) throws FileNotFoundException { 
        String userDir = System.getProperty("user.dir");
        csvProcess csvProcessor = new csvProcess();
        List<person> persons = csvProcessor.getList(userDir + "/src/main/java/com/mycompany/peopleteams/"  + "MOCK_DATA.csv");// Get a list of 'person' objects named 'persons' from a CSV file with the specified path.
        List<team> teams = new ArrayList<team>(); // Create a list named 'teams' to hold 'team' objects.
        
        while(!persons.isEmpty()) {
            teams.add(buildTeam(persons));
        }
        
        teams.forEach(team -> {
            System.out.println(team.getTeam()); // Add a team created by calling the 'buildTeam' function to the 'teams' list.
        });
        
        
    }
    
    // Method to create a team from a list of people.
    public static team buildTeam(List<person> people) {
        Random randomPerson = new Random(); // Create an instance radom
        List<person> newTeamComposition = new ArrayList<person>(); // Create a new list named 'newTeamComposition' to store the team composition.
        for (int i = 0; i < 5; i++) { // Loop that iterates five times to form a team with 5 people.
            int listSize = people.size(); // Get the current size of the 'people' list.
            int randomIndex = randomPerson.nextInt(listSize); // Generate a random index with the size of the 'people' list.
            newTeamComposition.add(people.get(randomIndex)); // Add the person at the random index to the team composition.
            people.remove(randomIndex); // Remove the person from the 'people' list to avoid duplicates.
        }
      
        
     //Return a new team created with the specified composition.
        return new team(newTeamComposition);
    }
}
