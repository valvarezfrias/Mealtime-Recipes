import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    menu();
  }

  private static String ingredInput(String input) {
    String result = "";
    return result;
  }

  private static void menu() { // displays a menu of the users options
    System.out.println("WELCOME TO MEALTIME RECIPES");
    System.out.println("Please input a selction. (Q to quit): ");
    Scanner input = new Scanner(System.in);
    //String option = "";

    while (input.nextLine() != "Q") { // Q to quit the program

    }

    //DONT MIND ME
    if (input.nextLine() == "Q"){
      System.out.println("Goodbye for now!");
      System.exit(0);
    }

  }

  private static void usage() { // shows proper usage of the program

  }

  public static void searchRecipes(String userIngredients) {

  }

  public static void searchRecipes(String userIngredients, Object extra) {

  }

}