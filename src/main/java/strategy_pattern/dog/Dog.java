package strategy_pattern.dog;
import strategy_pattern.behaviour.BarkBehaviour;
import strategy_pattern.behaviour.EatBehaviour;
public abstract class Dog {
EatBehaviour eatBehaviour;
BarkBehaviour barkBehaviour;

public Dog(){}

public void doBark(){
    barkBehaviour.bark();
}
public void doEat(){
    eatBehaviour.eat();
}
}
