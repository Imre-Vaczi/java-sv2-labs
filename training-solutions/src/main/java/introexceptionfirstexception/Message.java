package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {

    public void printCodeMessage(List<String> something) {
        for (String s : something) {
            int number = Integer.parseInt(s);
            char character = (char) number;
            System.out.print(character);
        }
    }

    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        //List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1 |-->O<--| 1", "110", "101", "116", "46");
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");

        Message message = new Message();

        //message.printCodeMessage(codedMessage);
        message.printCodeMessage(anotherCodedMessage);
    }
}
