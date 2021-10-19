package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate){
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund(){return this.fund;}

    public double getYield(int days){return this.fund * this.interestRate / 100 / 365 * days;}

    public double close(int days){
        return this.active == false ? 0 : getYield(days) + getFund() - (getFund() * this.cost / 100 / 365 * days );
    }
}
