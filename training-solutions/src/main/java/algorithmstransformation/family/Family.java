package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<FamilyMember> listOfFamilyMembers = new ArrayList<>();

    public Family(List<FamilyMember> listOfFamilyMembers) {
        this.listOfFamilyMembers = listOfFamilyMembers;
    }

    public List<FamilyMember> getListOfFamilyMembers() {
        return listOfFamilyMembers;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        this.listOfFamilyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String nameInput) {
        List<Integer> listOfAgeWithGivenName = new ArrayList<>();
        for (FamilyMember member : listOfFamilyMembers) {
            if (member.getName().contains(nameInput)) {
                listOfAgeWithGivenName.add(member.getAge());
            }
        }
        return listOfAgeWithGivenName;
    }
}
