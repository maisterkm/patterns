package bihavioralPatterns.strategy;

//abstract layer in between the high level module and low level module
public class OperationManager {

    //We have to use composition
    //because the behavior can be changed at run-time
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        this.strategy.execute(num1, num2);
    }
}
