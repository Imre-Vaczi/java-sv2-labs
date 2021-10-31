package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");
    private final String titleDetail;

    Title(String titleDetail) {
        this.titleDetail = titleDetail;
    }

    public String getTitleDetail() {
        return titleDetail;
    }
}
