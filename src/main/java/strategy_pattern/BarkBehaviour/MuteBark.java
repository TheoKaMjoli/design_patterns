package strategy_pattern.BarkBehaviour;
import strategy_pattern.behaviour.BarkBehaviour;
public class MuteBark implements BarkBehaviour {

    @Override
    public void bark() {
        System.out.println("This is a mute bark!!");
    }
}
