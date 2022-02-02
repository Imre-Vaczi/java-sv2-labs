package catalog;

import java.util.ArrayList;
import java.util.List;
import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> contributors = new ArrayList<>();

    public PrintedFeatures(String title, int numberOfPages, List<String> contributors) {
        if (isLengthInvalid(numberOfPages) | isBlank(title) | isEmpty(contributors)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.contributors = contributors;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return contributors;
    }

    private boolean isLengthInvalid(int length) {
        return length <= 0;
    }

}
