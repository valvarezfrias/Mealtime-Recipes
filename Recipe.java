import java.util.ArrayList;
import java.io.*;

class Recipe{
  
  public ArrayList<String> ingredList, flair;
  public double cookTime;
  private String name, instructions;
  public int numIngred;
  
  
  public Recipe(){
    ingredList = new ArrayList<String>();
    flair = new ArrayList<String>();
    instructions = "";
  }
  
  public Recipe(ArrayList ingred, double cookT, ArrayList keywords, String instruct){
    ingredList = ingred;
    flair = keywords;
    cookTime = cookT;
    instructions = instruct;
    numIngred = ingredList.size();
  }

  public String toString(){
    return name;
  }

  public int compareTo(Recipe r2){
    int ret = 0;

    return ret;
  }
  
  public static ArrayList loadRecipeFile(){
    ArrayList recList = new ArrayList();
    Recipe thisRec;
    String ingredName, ingredQuant, ingredUnit, str;
    ingredName = "";
    try{
      File recFile = new File("Recipes.txt");
      BufferedReader in = new BufferedReader (new FileReader(recFile));
      char key = 0;
      
      
      while ((str = in.readLine()) != null){
        
        if(!(str.equals("")))
           key = str.charAt(0);
        if(key == '#'){ //new recipe
          thisRec = new Recipe();
          recList.add(thisRec);
          thisRec.name = str.substring(1, str.length());
          System.out.println("new recipe: " + thisRec.name);
          while( ((str = in.readLine()) != null) && str.charAt(0) != '*' ){
            thisRec.flair.add(str);
            //System.out.println("added " + str + " to " + thisRec.name);
          }//loop to add flair
          
          ingredName += str.substring(1, str.length());
          thisRec.ingredList.add(ingredName);
          
          System.out.println("added " + ingredName + " to " + thisRec.name);
          in.readLine();
          in.readLine();
          
          while( ((str = in.readLine()) != null) && str.charAt(0) != '$' ){
            ingredName = str.substring(1, str.length());
            thisRec.ingredList.add(ingredName);
            
            System.out.println("added " + ingredName + " to " + thisRec.name);
            in.readLine();
            in.readLine();
            /*
            ingredUnit = in.readLine();
            ingredQuant = in.readLine();
            thisRec.ingredList.add(ingredQuant + " " + ingredUnit + 
                                   " "  + ingredName);
            */
          }
          if (str.charAt(0) == '$'){
            thisRec.instructions.concat(str);
            while( ((str = in.readLine()) != null) && !(str.equals(null) )
                  && str.charAt(0) != '#' ){
              thisRec.instructions.concat(str);
            }
            
          }
        }
      }
    } catch (Exception e){
      e.printStackTrace();
    }
      
    return recList;
  }
  
  public static ArrayList simpleLoadRecipeFile(){
    ArrayList recList = new ArrayList();
    Recipe thisRec;
    thisRec = new Recipe();
    String ingredName, str;
    ingredName = "";
    try{
      File recFile = new File("SimpleRecipes.txt");
      BufferedReader in = new BufferedReader (new FileReader(recFile));
      
      while ((str = in.readLine()) != null){
        if(str.charAt(0) == '#'){ //new recipe
          thisRec = new Recipe();
          recList.add(thisRec);
          thisRec.name = str.substring(1, str.length());
          //System.out.println("new recipe: " + thisRec.name);
        }
        else{ //ingredient
          ingredName = str.substring(1, str.length());
          thisRec.ingredList.add(ingredName);
          //System.out.println("added " + ingredName + " to " + thisRec.name);
        }
      }
    } catch (Exception e){
      e.printStackTrace();
    }
      
    return recList;
  }

  
}