package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
    void generatingCases() {
        List<FamilyMember> peopleWithinFamily = new ArrayList<>();
        peopleWithinFamily.add(new FamilyMember("www aaa", 34));
        peopleWithinFamily.add(new FamilyMember("www bbb", 35));
        peopleWithinFamily.add(new FamilyMember("www ccc", 10));
        peopleWithinFamily.add(new FamilyMember("zzz aaa", 30));
        peopleWithinFamily.add(new FamilyMember("zzz fff", 20));

        family = new Family(peopleWithinFamily);
    }

    @Test
    void testGetListOfFamilyMembers() {
        assertEquals(5, family.getListOfFamilyMembers().size());
    }

    @Test
    void testAddFamilyMember() {
        family.addFamilyMember(new FamilyMember("xxx fff", 60));
        assertEquals(6, family.getListOfFamilyMembers().size());
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        List<Integer> listWithAgesWithName = family.getAgesOfFamilyMembersWithNameGiven("aaa");
        assertEquals(2, listWithAgesWithName.size());
        assertEquals(34, listWithAgesWithName.get(0));
        assertEquals(30, listWithAgesWithName.get(1));
    }

}