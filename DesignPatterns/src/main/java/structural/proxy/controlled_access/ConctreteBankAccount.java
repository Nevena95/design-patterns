package structural.proxy.controlled_access;

public class ConctreteBankAccount implements BankAccount {

    private double state = 0d;

    @Override
    public double getState() {
        return state;
    }

    @Override
    public void changeState(double state) {
        this.state += state;
    }
}
