package TypesOfDucks;
 
import Parent.ModelDuck;

public class RedHeadDuck extends ModelDuck{
      
    public RedHeadDuck(String Name){
            super(Name);  
    }
    public  void displayDuck(){
            System.out.println("Red Head Duck is displayed\n");
     }
     public String getName(){
        return duckName;
     }

}