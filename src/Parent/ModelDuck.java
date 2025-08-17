
import ChangingBehaviors.FlyingBehavior;
import  ChangingBehaviors.QuackingBehavior;


public abstract class ModelDuck {
   String duckName;
   FlyingBehavior fb;
   QuackingBehavior qb;
   public ModelDuck() {
   }
   public void swim() {
      
      System.out.println(getName()+"Starts swimming in water");
   }

   public void setFlyAndQuack(FlyingBehavior A,QuackingBehavior B){
            fb=A;
            qb=B;
   }
   public void fly(){
        fb.performFlying();

   }

   public void quack(){
       qb.performQuacking();
   }

   public abstract String getName();
   public abstract void displayDuck();

   public static void main(String[] var0) {
      System.out.println("Model Duck");
   }
}