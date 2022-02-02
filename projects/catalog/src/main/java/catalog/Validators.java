package catalog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Validators {

    public static boolean isBlank(String text) {
        if ("".equals(text) | text == null) {
            return true;
        } else {
            return Arrays.stream(text.split("")).toList().stream().allMatch(c -> c.equals(" "));
        }
    }

    public static boolean isEmpty(List<Object> data) {
        return (data == null || data.size() == 0);
    }
}
