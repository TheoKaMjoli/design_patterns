package strategy_pattern.dog;

import strategy_pattern.behaviour.BarkBehaviour;
import strategy_pattern.concreteEatBehaviour.ProteinDiet;

public class StrategyTest {
    public static void main(String[] args) {
        Dog lab = new Labrador();
        lab.doEat(); // This is a normal diet
    }
}
