import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static ArrayList userIngredients;
  public static ArrayList searchOptions;
  
  public static void main(String[] args) {
    userIngredients = new ArrayList<String>();
    searchOptions = new ArrayList<String>();
    
    System.out.println("Welcome to MEALTIME RECIPES");
    Recipe.loadRecipeFile();
    menu();
  }


  private static void menu() { // displays a menu of the users options
    System.out.print("Current ingredients: ");
    System.out.println(userIngredients);
    System.out.print("Current Search Options: ");
    System.out.println(searchOptions);
    System.out.println("Enter 1 to add available ingredients."); //removal option needed?
    System.out.println("Enter 2 to search for recipes with current ingredients.");
    System.out.println("Enter 3 to change search options.");
    System.out.println("Please input a selction. (Q to quit): ");
    Scanner input = new Scanner(System.in);
    String option = input.nextLine();

    while ( !(option.equals("Q") || option.equals("q")) ) { // Q to quit the program
      //System.out.println("You entered: " + option);
      if(option.equals("1")){ //add ingredients
        //need another prompt for ingredients
        //userIngredients.add
      } else if(option.equals("2")){ //search with current ingredients
        //Search mtrSearch = new Search();
        if(userIngredients.contains("pancake mix")){
          System.out.println("Recipes possible: ");//example data
          System.out.println("1 : Pancakes"); 
          System.out.println("Type the number of the recipe you want to display: "); 
          
        }
        else{
          System.out.println("No recipes possible with current ingredients");
          System.out.println("Possible recipies with additional ingredients:");
          System.out.println("1 : Pancakes        Needed: pancake mix");
          
          System.out.println("Type the number of the recipe you want to display: "); 
          
          
          }
      }  else if(option.equals("3")){ //change search options
        
          System.out.println("Enter the restriction you wish to add: ");
      
      }  else if(option.equals("add pancake mix")){ //add pancake mix
        userIngredients.add("pancake mix");
      } 
      
      System.out.print("Current ingredients: ");
      System.out.println(userIngredients);
      System.out.print("Current Search Options: ");
      System.out.println(searchOptions);
        
      input = new Scanner(System.in);
      option = input.nextLine();
      
    }

    //confirms that the user wants to quit, verifies input
    System.out.println("Are you sure you want to quit? (Y or N)");
    input = new Scanner(System.in);
    option = input.nextLine();
    while(true){
      if (option.equals("Y") || option.equals("y")){
        System.out.println("Goodbye for now!");
        System.exit(0);
        break;
      } else if (option.equals("N") || option.equals("n")){
        menu();
      } else{
        System.out.println("Please enter a valid option.\nAre you sure you want to quit? (Y or N)");
        input = new Scanner(System.in);
        option = input.nextLine();
      }
      
    }

  }

  private static void usage() { // shows proper usage of the program
    System.out.println("Correct usage: ");
  }
  
  private static String ingredInput(String input) {
    String result = "";
    return result;
  }

  

}