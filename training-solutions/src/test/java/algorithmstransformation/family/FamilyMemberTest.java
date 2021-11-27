package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void testInit() {
        FamilyMember familyMember = new FamilyMember("Öcsi", 17);
        assertEquals("Öcsi", familyMember.getName());
        assertEquals(17, familyMember.getAge());
    }

}