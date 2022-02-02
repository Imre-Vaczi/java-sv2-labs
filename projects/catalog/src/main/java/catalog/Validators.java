package catalog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Validators {

    public static boolean isBlank(String text) {
        if (text == null || "".equals(text)) {
            return true;
        } else {
            return Arrays.stream(text.split("")).toList().stream().allMatch(c -> c.equals(" "));
        }
    }

    public static boolean isEmpty(List data) {
        return (data == null || data.size() == 0);
    }
}
