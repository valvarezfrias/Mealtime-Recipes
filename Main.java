import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static ArrayList userIngredients;
  
  public static void main(String[] args) {
    userIngredients = new ArrayList<String>();
    
    System.out.println("Welcome to MEALTIME RECIPES");
    menu();
  }

  private static String ingredInput(String input) {
    String result = "";
    return result;
  }

  private static void menu() { // displays a menu of the users options
    System.out.print("Current ingredients: ");
    System.out.println(userIngredients);
    System.out.println("Enter 1 to add available ingredients.");
    System.out.println("Enter 2 to search for recipes with current ingredients.");
    System.out.println("Enter 3 to change search options.");
    System.out.println("Please input a selction. (Q to quit): ");
    Scanner input = new Scanner(System.in);
    String option = input.nextLine();

    while ( !(option.equals("Q")) ) { // Q to quit the program
      System.out.println("You entered: " + option);
      if(option.equals("1")){ //add ingredients
        //need another prompt for ingredients
        //userIngredients.add
      } else if(option.equals("2")){ //search with current ingredients
        //
      }  else if(option.equals("3")){ //change search options
        
      } 
        
      input = new Scanner(System.in);
      option = input.nextLine();
      
    }

    //confirms that the user wants to quit, verifies input
    System.out.println("Are you sure you want to quit? (Y or N)");
    input = new Scanner(System.in);
    option = input.nextLine();
    while(true){
      if (option.equals("Y")){
        System.out.println("Goodbye for now!");
        System.exit(0);
        break;
      } else if (option.equals("N")){
        menu();
      } else{
        System.out.println("Please enter a valid option.\nAre you sure you want to quit? (Y or N)");
        input = new Scanner(System.in);
        option = input.nextLine();
      }
      
    }

  }

  private static void usage() { // shows proper usage of the program

  }

  /*
  
  // method to create an array of recipes for searching and sorting
  public static void recipeArray() {
    Recipe[] recipes;
    In in = new In("Recipes.txt");
    while (!in.isEmpty()) {
      for (int i = 0; i < numberOfRecipes; i++) {
        //do the file format to seperate into each part thing
        recipes[i] = new Recipe();
      }
    }
      
  }
  */

}