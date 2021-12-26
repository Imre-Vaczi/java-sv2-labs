package exceptionmulticatch.converter;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String inputData) {
        if (inputData == null) {
            throw new NullPointerException("Can not be null");
        }

        boolean[] result = new boolean[inputData.length()];

        for (int i = 0; i < inputData.length(); i++) {
            if (String.valueOf(inputData.charAt(i)).equals("1")) {
                result[i] = true;
            } else if (String.valueOf(inputData.charAt(i)).equals("0")){
                result[i] = false;
            } else {
                throw new IllegalArgumentException("Invalid character");
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] inputData) {
        if (inputData == null) {
            throw new NullPointerException("Can not be null");
        }
        if (inputData.length == 0) {
            throw new IllegalArgumentException("Empty array not allowed");
        }
        StringBuilder sb = new StringBuilder();
        for (Boolean value : inputData) {
            if (value) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
