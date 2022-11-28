//Assignment 07
//Chingwing Yeung
//10/18/2022

package myBulgarianSolitairePackage;

import java.util.ArrayList;
import java.util.Collections; 

public class BulgarianSolitaire {
    //invoke methods
    public static void main(String[] args) {
    	BulgarianSolitaire game1 = new BulgarianSolitaire();
        ArrayList<Integer> game1thelist = game1.initializingPiles();
        
        for (int i = 0; i < game1thelist.size(); i++) {
        	System.out.print(game1thelist.get(i) + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        
        formingPiles(game1thelist);
    }
    
    
    
	int numberOfCards = 45; //what class knows
    int startNumberOfPiles;   // what class knows
    

    /**Construct BulgarianSolitaire with startNumberOfPiles 1  */
    BulgarianSolitaire() {
        startNumberOfPiles = 4;
    }
    

    /** Construct BulgarianSolitaire with a specified startNumberOfPiles */
    BulgarianSolitaire(int newStartNumberOfPiles) {
        startNumberOfPiles = newStartNumberOfPiles;
    }
    
    
    /**what class do: initializing the 4 piles(startNumberOfPiles) at first*/
    public ArrayList<Integer> initializingPiles() {
      //create an array called a round to store piles of cards
      ArrayList<Integer> round = new ArrayList<Integer>(startNumberOfPiles);
      

      //make a for loop to populate a random number until  numberOfcard is zero
      int remainingCards = numberOfCards;
      for (int i = 0; i < startNumberOfPiles - 1; i++) {
          int x = (int)(Math.random() * remainingCards);
          round.add(x);
          remainingCards -= x;
      }
      round.add(remainingCards);

      Collections.sort(round);  // Sort round
      return round;
    }
    
  
    public static void formingPiles(ArrayList<Integer> round) {
    	ArrayList<ArrayList<Integer>> piles = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> goal = new ArrayList<Integer>();
    	for (int i = 1; i < 10; i++) {
    		goal.add(i);
    	}

    	
 
        
        for (int i = 0; i < 76; i++) {	
    	/**first loop*/
    	int count = 0;
    	for (int j = 0; j < round.size(); j++) {
    		if (round.get(j) == 0)
    			continue;
    		round.set(j, round.get(j)-1);
    		count++;
    	}
    	round.add(count);
    	Collections.sort(round);
    	

        
        for (int j = 0; j < round.size(); j++) {
        	if (round.get(j) == 0)
    			continue;
        	System.out.print(round.get(j) + " ");
        }
        System.out.println();
    	/**first loop*/
        }
        
        
    }
        
    	
        
    	
    

            
       




}