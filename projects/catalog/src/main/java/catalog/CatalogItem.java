package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogItem implements Feature{

    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature ... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = new ArrayList<>(Arrays.asList(features));
    }

    public int numberOfPagesAtOneItem() {
        /*int numOfPagesSum = 0;
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                numOfPagesSum += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return numOfPagesSum;*/
        return features.stream()
                .filter(f -> f instanceof PrintedFeatures)
                .mapToInt(f -> ((PrintedFeatures) f).getNumberOfPages())
                .sum();
    }

    public int fullLengthAtOneItem() {
        return features.stream()
                .filter(f -> f instanceof AudioFeatures)
                .mapToInt(f -> ((AudioFeatures) f).getLength())
                .sum();
    }

    @Override
    public List<String> getContributors() {
        return features.stream()
                .map(f -> f.getContributors())
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
    }

    public boolean hasAudioFeature() {
        return features.stream()
                .anyMatch(f -> f instanceof AudioFeatures);
    }

    public boolean hasPrintedFeature() {
        return features.stream().anyMatch(f -> f instanceof PrintedFeatures);
    }

    @Override
    public String getTitle() {
        return null;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public List<String> getTitles() {
        return features.stream()
                .map(f -> f.getTitle())
                .toList();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }
}
