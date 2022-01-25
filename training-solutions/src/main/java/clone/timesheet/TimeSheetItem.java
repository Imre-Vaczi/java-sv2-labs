package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem otherOne) {
        this.employee = otherOne.employee;
        this.project = otherOne.project;
        this.from = otherOne.from;
        this.to = otherOne.to;
    }

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee) {
        TimeSheetItem newOne = new TimeSheetItem(timeSheetItem);
        newOne.setEmployee(newEmployee);
        return newOne;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
