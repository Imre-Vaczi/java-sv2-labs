package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter{

    @Override
    public String writeBill(List<String> billItems) {
        return formatLines(billItems);
    }

    private String formatLines(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String line : billItems) {
            String[] l = line.split(";");
            int sum = Integer.parseInt(l[1]) * Integer.parseInt(l[2]);
            if (billItems.indexOf(line) < billItems.size()-1){
                sb.append(l[0]).append(", ").append(l[2]).append(" * ").append(l[1]).append(" = ").append(sum).append(" Ft\n");
            } else {
                sb.append(l[0]).append(", ").append(l[2]).append(" * ").append(l[1]).append(" = ").append(sum).append(" Ft");
            }
        }
        return sb.toString();
    }
}
