package strategy_pattern.concreteEatBehaviour;

import strategy_pattern.behaviour.EatBehaviour;

public class NormalDiet implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("This is a normal diet");
    }
}
