package collectionsequalshash.corporation;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("A", "000-111"));
        System.out.println(companies.contains(new Company("A", "000-111")));
        companies.add(new Company("B", "000-112"));
        System.out.println(companies.contains(new Company("B", "000-112")));
        companies.add(new Company("C", "000-113"));
        System.out.println(companies.contains(new Company("C", "000-113")));
        companies.add(new Company("D", "000-114"));
        System.out.println(companies.contains(new Company("D", "000-114")));


    }
}
