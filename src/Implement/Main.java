package Implement;
import ChangingBehaviors.*;
import TypesOfDucks.*;
import TypesOfFlying.*;
import TypesOfQuacks.*;
import Parent.*;
import java.util.*;




public class Main {
    
    
    public static void main(String[] args){
         ArrayList<ModelDuck> Ducks = new ArrayList<>();

         ModelDuck temp= new MallardDuck("A");
         temp.setFlyAndQuack(new Gliding(),new Quack());
         System.out.print(temp.getName());
         temp.fly();
         temp.quack();
         temp.swim();

        

    }
}
