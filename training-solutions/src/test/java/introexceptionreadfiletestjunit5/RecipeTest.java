package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    void testOkCase(){
        recipe.addIngredients(Paths.get("src/test/resources/recipe_A.txt"));
        assertEquals("liszt", recipe.getIngredients().get(0).toString());
    }

    @Test
    void testFileIssueCase(){
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> recipe.addIngredients(Paths.get("src/test/resources/recipe_unknown.txt")));
        assertEquals("Error occurred during reading source file.", ise.getMessage());
    }

}