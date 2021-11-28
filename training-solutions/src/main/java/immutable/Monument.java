package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final String logID;
    private final LocalDate logDate;

    public Monument(String name, String address, String logID, LocalDate logDate) {
        if (isEmpty(name) || isEmpty(address) || isEmpty(logID)) {
            throw new IllegalArgumentException("Invalid input: name, address, logID");
        }
        this.name = name;
        this.address = address;
        this.logID = logID;
        this.logDate = logDate;
    }

    private boolean isEmpty(String inputString) {
        return "".equals(inputString) || inputString==null;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getLogID() {
        return logID;
    }

    public LocalDate getLogDate() {
        return logDate;
    }
}
