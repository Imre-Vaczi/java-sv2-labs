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
    public int getInterestRate(){return this.interestRate;}

    public double getYield(int days){return this.fund * this.interestRate * days / 100 / 365 ;}

    public double close(int days){
        double stat = getYield(days) + getFund() - ( (getYield(days) + getFund()) * this.cost / 100.0 / 365.0 * days );
        double finalStat = this.active == false ? 0 : stat;
        this.active = false;
        return finalStat;

    }
}
