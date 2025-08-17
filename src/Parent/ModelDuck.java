package Parent;
import ChangingBehaviors.FlyingBehavior;
import ChangingBehaviors.QuackingBehavior;


public abstract class ModelDuck {
  public  String duckName;
   FlyingBehavior fb;
   QuackingBehavior qb;

   public ModelDuck(String name) {
             duckName=name;
   }
   public void swim() {
      
      System.out.println(getName()+" Starts swimming in water\n");
   }

   public void setFlyAndQuack(FlyingBehavior A,QuackingBehavior B){
            fb=A;
            qb=B;
   }
   public void fly(){
        System.out.print(duckName+" :");
        fb.performFlying();

   }

   public void quack(){
        System.out.print(duckName+" :");
       qb.performQuacking();
   }

   public abstract String getName();
   public abstract void displayDuck();

  
}