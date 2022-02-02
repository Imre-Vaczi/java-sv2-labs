package catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {

    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public List<CatalogItem> getAudioLibraryItems() {
        return catalogItems.stream()
                .filter(c -> c.getFeatures().stream()
                        .anyMatch(f -> f instanceof AudioFeatures))
                .collect(Collectors.toList());

    }

    public List<CatalogItem> getPrintedLibraryItems() {
        return catalogItems.stream()
                .filter(c -> c.getFeatures().stream()
                        .anyMatch(f -> f instanceof PrintedFeatures))
                .collect(Collectors.toList());
    }

    public int getAllPageNumber() {
        return catalogItems.stream()
                .mapToInt(c -> c.numberOfPagesAtOneItem())
                .sum();
    }

    public int getFullLength() {
        return catalogItems.stream()
                .mapToInt(c -> c.fullLengthAtOneItem())
                .sum();
    }

    public void deleteItemByRegistrationNumber(String regNumber) {
        catalogItems.removeIf(c -> c.getRegistrationNumber().equals(regNumber));
    }

    public double averagePageNumberOver(int threshold) {
        List<Integer> subResults = getSubResultsAvgPageNum(threshold);
        int sum = subResults.get(0);
        int count = subResults.get(1);
        return calculateAveragePageNum(sum, count);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        if (searchCriteria.hasContributor() & searchCriteria.hasTitle()) {
            return findByBoth(searchCriteria);
        } else if (searchCriteria.hasContributor()) {
            return findByContributor(searchCriteria);
        } else {
            return findByTitle(searchCriteria);
        }
    }

    private List<CatalogItem> findByBoth(SearchCriteria searchCriteria) {
        return catalogItems.stream()
                .filter(c -> c.getFeatures().stream()
                        .anyMatch(f -> f.getContributors()
                                .contains(searchCriteria.getContributor()) && f.getTitle().contains(searchCriteria.getTitle())))
                .toList();
    }

    private List<CatalogItem> findByTitle(SearchCriteria searchCriteria) {
        return catalogItems.stream()
                .filter(c -> c.getFeatures().stream()
                        .anyMatch(f -> f.getTitle().contains(searchCriteria.getTitle())))
                .toList();
    }

    private List<CatalogItem> findByContributor(SearchCriteria searchCriteria) {
        return catalogItems.stream()
                .filter(c -> c.getFeatures().stream()
                        .anyMatch(f -> f.getContributors()
                                .contains(searchCriteria.getContributor())))
                .toList();
    }

    private List<Integer> getSubResultsAvgPageNum(int threshold) {
        if (threshold <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        List<Integer> subResults = new ArrayList<>();
        List<CatalogItem> relevantItems = catalogItems.stream().filter(c -> c.getFeatures().stream()
                        .anyMatch(f -> f instanceof PrintedFeatures))
                .filter(f -> f.numberOfPagesAtOneItem() > threshold)
                .collect(Collectors.toList());
        subResults.add(relevantItems.stream().mapToInt(i -> i.numberOfPagesAtOneItem()).sum());
        subResults.add(relevantItems.size());
        return subResults;
    }

    private double calculateAveragePageNum(int sum, int count) {
        if (count == 0) {
            throw new IllegalArgumentException("No page");
        } else {
            return sum / (count * 1.0);
        }
    }
}
