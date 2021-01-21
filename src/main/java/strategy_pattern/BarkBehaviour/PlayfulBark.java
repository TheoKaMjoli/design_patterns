package strategy_pattern.BarkBehaviour;

import strategy_pattern.behaviour.BarkBehaviour;

public class PlayfulBark implements BarkBehaviour {
    @Override
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
