package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount (List<Salesperson> sales) {
        Salesperson sPerson = null;
        for (Salesperson salesRep : sales) {
            if (sPerson == null || salesRep.getAmount() > sPerson.getAmount()) {
                sPerson = salesRep;
            }
        }
        return sPerson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson tempPerson = null;
        Integer tempDiff = Integer.MIN_VALUE;
        for (Salesperson salesRep : sales) {
            boolean diff = (salesRep.getAmount() - salesRep.getTarget()) > tempDiff;
            if (tempPerson == null || diff) {
                tempPerson = salesRep;
                tempDiff = (int) (salesRep.getAmount() - salesRep.getTarget());
            }
        }
        return tempPerson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson tempPerson = null;
        Integer tempDiff = Integer.MIN_VALUE;
        for (Salesperson salesRep : sales) {
            boolean diff = (salesRep.getTarget() - salesRep.getAmount()) > tempDiff;
            if (tempPerson == null || diff) {
                tempPerson = salesRep;
                tempDiff = (int) (salesRep.getTarget() - salesRep.getAmount());
            }
        }
        return tempPerson;
    }
}
