package bullsandcows;

public class intAsArray {
    public static int[] intAsArray(int num){
        int[] intAsArray = new int[4];

        int fourthElement = num % 10;
        int thirdElement = num / 10 % 10;
        int secondElement = num / 100 % 10;
        int firstElement = num / 1000 % 10;

        intAsArray[0] = firstElement;
        intAsArray[1] = secondElement;
        intAsArray[2] = thirdElement;
        intAsArray[3] = fourthElement;

        return intAsArray;


    }
}
