import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static ArrayList<String> userIngredients;
  public static ArrayList<Recipe> recipeList;
  public static ArrayList<String> searchOptions;
  
  public static void main(String[] args) {
    userIngredients = new ArrayList<String>();
    searchOptions = new ArrayList<String>();
    
    System.out.println("Welcome to MEALTIME RECIPES");
    recipeList = Recipe.loadRecipeFile();
    userIngredients.add("mozzarella cheese");
    userIngredients.add("sharp cheddar cheese");
    menu();
  }

  private static void addIngredients(){
    //need another prompt for ingredients
    System.out.println("Please enter your ingredients seperated by a comma");
    Scanner input = new Scanner(System.in);
    String option = input.nextLine();
    String[] ingredients = option.split("[,]+");
    for(int i = 0; i < ingredients.length; i +=1){
      String ingred = ingredients[i];
      userIngredients.add(ingred);
    }
    //userIngredients.add(option); 
    /* for testing lmao hehe
    for(int i = 0; i < userIngredients.size(); i += 1){
      System.out.println("Ingredient #" + (i + 1) + ": " + userIngredients.get(i)); }
    */
    //input.close();
  }

  private static Boolean recipePossible(Recipe rec){
    
    for(String str: rec.ingredList){
      if(rec.toString().equals("CHEESE"))
        System.out.println(rec.ingredList);
      if (!(userIngredients.contains(str)))
        return false;
    }
    return true;
  }

  private static void searchRecipes(){
    Recipe thisRec;
    System.out.println("Recipes possible: ");
    for(int i = 0; i< recipeList.size();i++){
      thisRec = recipeList.get(i);
      if(recipePossible(thisRec))
        System.out.println(i + " : " + thisRec); 
    }
    /*
    Search.searchRecipes(userIngredients, recipeList);
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
    */
  }

  //FIX XTHISFAKFSD
  private static void changeSearch(){
    System.out.println("Enter the restriction you wish to add: ");
    Scanner input = new Scanner(System.in);
    String restriction = input.nextLine();//need search refinement option
  }

  //can remove one or more ingredients separated by commas (ingred1,ingred2,...ingredN)
  private static void removeIngredient(){

    //validates that there are ingredients to remove
    if(userIngredients.size() <= 0){ 
      System.out.println("No ingredients to remove!");
    } else{
      System.out.println("Enter food to be removed or enter \"ALL\" to clear list");
      Scanner input = new Scanner(System.in);
      String option = input.nextLine();
      if(option.equals("ALL")){ //is there a better word here?
        System.out.println("Clearing list...."); //should we confirm to clear the list or is that too much?
        userIngredients.removeAll(userIngredients);
      } else{
        //maybe confirm that the ingredient to be removed is in the list? might be too much idk
        String[] ingredients = option.split("[,]+");
        for(int i = 0; i < ingredients.length; i +=1){
          String ingred = ingredients[i];
          userIngredients.remove(ingred);
        }
      }
    }
  }

  private static void menu() { // displays a menu of the users options
    System.out.print("\nCurrent ingredients: ");
    System.out.println(userIngredients);
    System.out.print("Current Search Options: ");
    System.out.println(searchOptions);
    System.out.println("\nEnter 1 to add available ingredients.");
    System.out.println("Enter 2 to search for recipes with current ingredients.");
    System.out.println("Enter 3 to change search options.");
    System.out.println("Enter 4 to remove ingredient.");
    System.out.println("Please input a selction. (Q to quit): ");
    Scanner input = new Scanner(System.in);
    String option = input.nextLine();

    while ( !(option.equals("Q") || option.equals("q")) ) { // Q to quit the program
      //System.out.println("You entered: " + option);
      if(option.equals("1")){ //add ingredients
        addIngredients();
        
      } else if(option.equals("2")){ //search with current ingredients
        searchRecipes();

      }  else if(option.equals("3")){ //change search options
        changeSearch();
        //FIX THISDFN
        
      }  else if(option.equals("add pancake mix")){ //add pancake mix
        userIngredients.add("pancake mix");
      } else if(option.equals("4")){
        removeIngredient();
      } else{
        System.out.println(option + " is not a valid option. Please try again!");
      }

      /*
      System.out.print("Current ingredients: ");
      System.out.println(userIngredients);
      System.out.print("Current Search Options: ");
      System.out.println(searchOptions);
*/
      menu();
      /*
      input = new Scanner(System.in);
      System.out.println("made it here");
      option = input.nextLine();
      System.out.println("yuhasd;jfan;s");
      */
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