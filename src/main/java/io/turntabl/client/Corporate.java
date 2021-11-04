package io.turntabl.client;

public class Corporate extends Client {
    private AccountManager accountManager;

    public Corporate(AccountManager accountManager, ServiceLevel serviceLevel) {
        super(serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getName() {
        return accountManager.getName();
    }

    @Override
    public String toString() {
        return "Corporate{" +
                "name='" + getName() + '\'' +
                ", ID='" + super.getID() + '\'' +
                ", serviceLevel=" + super.getServiceLevel() +
                '}';
    }
}
