package strategy_pattern.concreteEatBehaviour;
import strategy_pattern.behaviour.EatBehaviour;
public class ProteinDiet implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("This is a protein diet!");
    }
}
