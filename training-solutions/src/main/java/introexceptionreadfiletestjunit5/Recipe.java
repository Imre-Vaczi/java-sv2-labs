package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path){
        for (String row : readFile(path)) {
            if ((row.split(" ").length > 1) & !(row.isEmpty())) {
                this.ingredients.add(row.split(" ")[2]);
            }
        }
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error occurred during reading source file.", ioe);
        }
    }

    public void printIngredients() {
        for (String s : getIngredients()){
            System.out.println(s);
        }
    }
}
