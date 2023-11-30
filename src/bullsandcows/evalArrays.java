package bullsandcows;

public class evalArrays {
    public static String evalAnswer(int[] guessArray, int[] secretCodeArray) {
        int numberOfBulls = 0;
        int numberOfCows = 0;
        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i] == secretCodeArray[i]) {
                numberOfBulls++;
            }
        }

        for (int num : guessArray) {
            if (evalUtils.exists(secretCodeArray, num)) {
                numberOfCows++;
            }
        }
        numberOfCows = numberOfCows - numberOfBulls;

        if (numberOfBulls < 4) {
            if (numberOfBulls == 0 && numberOfCows == 0) {
                return "None. ";
            }
            return "Grade: " + numberOfBulls + " bull(s) and " + numberOfCows + " cow(s).";
        } else {
            return "";
        }
    }
}

