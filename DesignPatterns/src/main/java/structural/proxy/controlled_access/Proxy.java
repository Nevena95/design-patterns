package structural.proxy.controlled_access;

public class Proxy implements BankAccount {
    private final BankAccount bankAccount = new ConctreteBankAccount();

    @Override
    public double getState() {
        checkAccess();

        return bankAccount.getState();
    }

    @Override
    public void changeState(double state) {
        checkAccess();

        bankAccount.changeState(state);
    }

    private void checkAccess() {
        System.out.println("Verifying access...");
    }
}
