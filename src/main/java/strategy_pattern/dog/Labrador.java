package strategy_pattern.dog;
import strategy_pattern.BarkBehaviour.PlayfulBark;
import strategy_pattern.concreteEatBehaviour.NormalDiet;
public class Labrador extends Dog{
    public Labrador(){
        barkBehaviour = new PlayfulBark();
        eatBehaviour = new NormalDiet();
    }
    public void display(){
        System.out.println("I'm a playful Labrador");
    }
}
