package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }
    public String concatNameHungarianStyle() {
        String result;
        if (title != null) {
            result = title.getTitleDetail();
            result += " ";
            result += familyName;
        } else {
            result = familyName;
        }
        result += " ";
        if (middleName != null ) {
            result += middleName;
            result += " ";
        }
        result += givenName;
        return result;
    }
    public String concatNameWesternStyle(){
        String result;
        if (title != null) {
            result = title.getTitleDetail();
            result = result.concat(" ");
            result = result.concat(givenName);
        } else {
            result = givenName;
        }
        result = result.concat(" ");
        if (middleName != null) {
            result = result.concat(middleName);
            result = result.concat(" ");
        }
        result = result.concat(familyName);
        return result;
    }
}