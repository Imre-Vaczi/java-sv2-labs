package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (contributor == null | title == null) {
            throw new IllegalArgumentException("nono");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("nono");
        }
        return new SearchCriteria(null, title);
    }
    public static SearchCriteria createByContributor(String contributor) {
        if (contributor == null) {
            throw new IllegalArgumentException("nono");
        }
        return new SearchCriteria(contributor, null);
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasTitle() {
        return getTitle() != null;
    }

    public boolean hasContributor() {
        return getContributor() != null;
    }
}
