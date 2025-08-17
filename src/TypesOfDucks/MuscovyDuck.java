package TypesOfDucks;
 
import Parent.ModelDuck;

public class MuscovyDuck extends ModelDuck{
      
    public MuscovyDuck(String Name){
            super(Name);  
    }
    public  void displayDuck(){
            System.out.println("Muscovy Duck is displayed\n");
     }
     public String getName(){
        return duckName;
     }

}