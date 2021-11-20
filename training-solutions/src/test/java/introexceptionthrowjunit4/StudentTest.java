package introexceptionthrowjunit4;

/*import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedExpeception;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;*/

class StudentTest {
    /*@Test
    public void testStudentWithProperAttr(){
        Student student = new Student();
        student.addNote(4);
        assertEquals(4, student.getScores().get(0).intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStudentWithIssueA(){
        new Student().addNote(10);
    }

    @Rule
    public ExpectedException exception ExpectedExceptions.none();

    @Test
    public void testStudentWithIssueB(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(10);
    }

    @Test
    public void testStudentWithIssueC(){
        IllegalArgumentException exception = assertThrow(IllegalArgumentException.class,
                () -> new Student().addNote(10));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }*/
}