package introexceptionreadfiletestjunit4;

/*import org.junit.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;*/

class RecipeTest {
    Recipe recipe = new Recipe();
/*
    @Test
    public void testWithNoIssues(){
        recipe.addIngredients(Paths.get("src/test/resources/recipe_A.txt"));
        assertEquals("liszt", recipe.getIngredients().get(0).toString());
    }

    @Test
    public void testWithIssues(){
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("src/test/resources/recipe_B.txt")));
        assertEquals("Beolvasási hiba.", exception.getMessage());
    }*/
}