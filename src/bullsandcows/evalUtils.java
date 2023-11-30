package bullsandcows;

public class evalUtils {
    public static boolean exists(int[] secretArray, int valToCheck) {
        for (int num : secretArray) {
            if (num == valToCheck) {
                return true;
            }
        }
        return false;
    }
}

