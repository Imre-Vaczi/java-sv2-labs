package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        List<String> rawRecipe = readFile(path);
        for (String row : rawRecipe) {
            if (!(row.isEmpty()) & (row.split(" ").length > 1)){
                ingredients.add(row.split(" ")[2]);
            }
        }
    }

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Beolvasási hiba.", ioe);
        }
    }

    public void printIngredients() {
        for (String element : this.ingredients){
            System.out.println(element);
        }
    }
}
