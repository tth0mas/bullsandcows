package bullsandcows;
import java.util.Scanner;

public class enterAndCheck {
    public static void enterVal(int secretCode){
        int k = 1;
        while(true)  {
            int[] secretCodeAsArray = intAsArray.intAsArray(secretCode);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Turn " + k + ". Answer: ");
            int firstGuess = scanner.nextInt();
            int[] firstGuessAsArray = intAsArray.intAsArray(firstGuess);

            String result = evalArrays.evalAnswer(firstGuessAsArray, secretCodeAsArray);
            if (!result.isEmpty()) {
                System.out.println(result);
                System.out.println();
            }

            k++;
            if (result.isEmpty()) {
                System.out.println("Congrats, you guessed correctly.");
                break;
            }
        }


/*        System.out.println("Secret Code As Array");
        for (int i = 0; i < secretCodeAsArray.length; i++) {
            System.out.println(secretCodeAsArray[i]);
        }

        System.out.println("Guessed code as array");
        for (int i = 0; i < firstGuessAsArray.length; i++) {
            System.out.println(firstGuessAsArray[i]);
        }*/
    }

}
