package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {

        Integer tempOcMax = 0;

        if (Integer.parseInt(String.valueOf(map.charAt(0))) == 0) {
            tempOcMax++;
        }

        for (int i = 0; i < map.length(); i++) {

            Integer innerTempOcMax = 0;
            for (int j = i +1; j < map.length(); j++) {
                if (Integer.parseInt(String.valueOf(map.charAt(j))) == 0) {
                    innerTempOcMax++;
                } else {
                    break;
                }
            }
            if (innerTempOcMax > tempOcMax) {
                tempOcMax = innerTempOcMax;
            }
        }
        return tempOcMax;
    }
}