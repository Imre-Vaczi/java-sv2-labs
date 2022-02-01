package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> contributors = new ArrayList<>();

    public PrintedFeatures(String title, int numberOfPages, List<String> contributors) {
        if (isLengthInvalid(numberOfPages) | isTitleInvalid(title) | isListInvalid(contributors)) {
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

    private boolean isTitleInvalid(String title) {
        return ("" == title) | (title == null);
    }

    private boolean isLengthInvalid(int length) {
        return length <= 0;
    }

    private boolean isListInvalid(List<String> input) {
        return (input == null);
    }
}
