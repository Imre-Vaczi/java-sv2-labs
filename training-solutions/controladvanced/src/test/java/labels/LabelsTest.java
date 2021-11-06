package labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void testMethod(){
        Labels labels = new Labels();
        assertEquals(2, labels.getTableOfNumbers(2)[0][0]);
    }

}