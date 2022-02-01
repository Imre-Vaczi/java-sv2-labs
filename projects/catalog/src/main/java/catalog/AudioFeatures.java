package catalog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AudioFeatures implements Feature{

    private String title;
    private int length;
    private List<String> performers = new ArrayList<>();
    private List<String> composer = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (isLengthInvalid(length) | isTitleInvalid(title) | isListInvalid(performers) | isListInvalid(composer)) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        if (isLengthInvalid(length) | isTitleInvalid(title) | isListInvalid(performers)) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        return Stream.of(getComposer(), getPerformers())
                .flatMap(Collection::stream)
                .toList();
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    public List<String> getComposer() {
        return composer;
    }

    public int getLength() {
        return length;
    }

    public List<String> getPerformers() {
        return performers;
    }

    private boolean isTitleInvalid(String title) {
        return (title.equals("")) | (title == null);
    }

    private boolean isLengthInvalid(int length) {
        return length <= 0;
    }

    private boolean isListInvalid(List<String> input) {
        return (input.size() == 0) | (input == null);
    }
}
