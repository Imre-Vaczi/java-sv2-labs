package enumtype.university;

public enum University {
    NJE("Neumann János Egyetem"), SZTE("Szegedi Tudományegyetem");

    private final String title;

    University(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
