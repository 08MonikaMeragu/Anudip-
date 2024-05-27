/*write a program in Java to create a Map Interface where we can store the cricketer 
name in it along with his scores and search for the batsman name and display his score.*/
import java.util.HashMap;

import java.util.Map;
public class Mapinterfacetest {

	public static void main(String[] args) {
		

		
		        // Create a Map to store cricketer names and their scores
		        Map<String, Integer> cricketerScores = new HashMap<>();

		        // Adding cricketer names and their scores to the map
		        cricketerScores.put("Virat Kohli", 100);
		        cricketerScores.put("Rohit Sharma", 75);
		        cricketerScores.put("Steve Smith", 90);
		        cricketerScores.put("Kane Williamson", 85);
		        cricketerScores.put("Joe Root", 120);

		        // Search for a batsman's name and display his score
		        String batsmanName = "Virat Kohli";
		        if (cricketerScores.containsKey(batsmanName)) {
		            int score = cricketerScores.get(batsmanName);
		            System.out.println(batsmanName + "'s score is: " + score);
		        } else {
		            System.out.println("Batsman not found in the records.");
		        }
		    }


	}

/* OUTPUT
Virat Kohli's score is: 100*/