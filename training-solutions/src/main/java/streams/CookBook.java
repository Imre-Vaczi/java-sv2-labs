package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    private List<Cake> cakes = new ArrayList<>();

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public void addCake(Cake cake) {
        cakes.add(cake);
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        return cakes
                .stream()
                .filter((Cake cake) -> cake.getIngredients().contains(ingredient))
                .map((Cake cake) -> cake.getName())
                .collect(Collectors.toList());
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        return cakes
                .stream()
                .filter((Cake cake) -> cake.getIngredients().size() <= max)
                .map((Cake cake) -> cake.getName())
                .collect(Collectors.toList());
    }
}
