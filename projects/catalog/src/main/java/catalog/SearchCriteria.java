package catalog;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class SearchCriteria {

    private String contributor;
    private String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (isBlank(contributor) | isBlank(title)) {
            throw new IllegalArgumentException("nono");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByTitle(String title) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("nono");
        }
        return new SearchCriteria(null, title);
    }
    public static SearchCriteria createByContributor(String contributor) {
        if (isBlank(contributor)) {
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
        //return getTitle() != null;
        return !isBlank(getTitle());
    }

    public boolean hasContributor() {
        return !isBlank(getContributor());
    }
}
