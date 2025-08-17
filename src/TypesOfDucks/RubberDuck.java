package TypesOfDucks;
import Parent.ModelDuck;
public class RubberDuck extends ModelDuck{
      
    public RubberDuck(String Name){
            super(Name);  
    }
    public  void displayDuck(){
            System.out.println("Rubber Duck is displayed\n");
     }
     public String getName(){
        return duckName;
     }

}