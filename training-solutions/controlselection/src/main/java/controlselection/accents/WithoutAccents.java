package controlselection.accents;

public class WithoutAccents {
    public char returnEnglishChar(char character){
        String seq = "áaéeóoőoűuőoúuőoíiüu";
        char res;
        if (seq.contains(Character.toString(character))){
            res = seq.charAt(seq.indexOf(Character.toString(character))+1);
        }else{
            res = character;
        }return res;
    }
}
