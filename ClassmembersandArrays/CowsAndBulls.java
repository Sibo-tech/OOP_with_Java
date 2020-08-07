package ClassmembersandArrays;

import java.util.HashSet;
import java.util.Set;

public class CowsAndBulls{

    //Constants
    public final static int NUM_DIGITS = 4;
    public final static int MAX_VALUE = 9876;
    public final static int MIN_VALUE = 1234;
    public final static int MAX_GUESSES = 10;
    //


    // instances
    private NumberPicker randomNumber;
    private int answer;
    private int guessesCopy;
    private int bullStored;
    private int cowStored;
    //

    public CowsAndBulls(int seed){
        randomNumber = new NumberPicker(seed, MIN_VALUE, MAX_VALUE);
        answer = randomNumber.nextInt();
        int k=(answer*10)+ randomNumber.nextInt();
        int l=(k*10)+ randomNumber.nextInt();
        int m=(l*10)+ randomNumber.nextInt();
        answer=m;
        guessesRemaining();

    }
    public static int[] toArray(int number) {
        int[]digits = Integer.toString(number).chars().map(c -> c-'0').toArray();
        return digits;
    }
    public static int countMatches(int numberA, int numberB) {
        String str1 = Integer.toString(numberA),
                str2 = Integer.toString(numberB);
        int result = 0;
        if (str1.length() == 0 || str2.length() == 0) {
            return result;
        }
        if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == str1.charAt(i))
                    result++;
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    public static int countIntersect(int numA, int numB) {
        String stringA = Integer.toString(numA);
        int lengthAB = stringA.length();
        int count = 0;

        int[] arrayOutA = toArray(numA);
        int[] arrayOutB = toArray(numB);

        for (int i = 0; i < lengthAB; i++) {
            for (int j = 0; j < lengthAB; j++) {
                if (arrayOutA[i] == arrayOutB[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public int guessesRemaining(){
        return guessesCopy;
    }

    public Result guess(int guessNumber){
        bullStored = countMatches(answer, guessNumber);
        cowStored = countIntersect(answer, guessNumber);
        guessesCopy--;
        return new Result(cowStored, bullStored);
    }

    public int giveUp(){
        return answer;
    }

    public boolean gameOver(){
        if (guessesCopy == 0 || bullStored == 4)
            return true;
        else
            return false;
    }
}
