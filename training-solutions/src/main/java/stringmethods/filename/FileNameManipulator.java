package stringmethods.filename;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FileNameManipulator {
    public char findLastCharacter(String str){
        char[] script = str.toCharArray();
        return script[script.length-1];
    }
    public String findFileExtension(String fileExtension){
        return fileExtension.substring(fileExtension.indexOf(".")+1);
    }
    public boolean identifyFilesByExtension(String ext, String fileName){
        return fileName.contains(ext);
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return searchedFileName.equalsIgnoreCase(actualFileName);
    }
    public String changeExtensionToLowerCase(String fileName){
        String firstPart = fileName.substring(0, fileName.indexOf("."));
        int dotIndex = fileName.indexOf(".");
        String end = fileName.substring(dotIndex).toLowerCase();
        return firstPart + end;
    }
    public String replaceStringPart(String fileName, String present, String target){
        return fileName.replace(target,present);
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("alma"));
        System.out.println(fileNameManipulator.findFileExtension("script.txt"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("exe", "script.exe"));
        System.out.println(fileNameManipulator.compareFilesByName("pic.png", "pic.PNG"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("Lyrics.DOC"));
        System.out.println(fileNameManipulator.replaceStringPart("tune.wam", "wam", "mp4"));
    }
}

