package ClassmembersandArrays;
import java.util.*;
public final class NumberUtils {
    private NumberUtils() {}
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

    public static int countIntersect(int numberA, int numberB) {
        String s1 = Integer.toString(numberA),
                s2 = Integer.toString(numberB);

        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for(char c : s1.toCharArray()) {
            set1.add(c);
        }
        for(char c : s2.toCharArray()) {
            set2.add(c);
        }
        set1.retainAll(set2);

        return set1.size();
    }
}
class Test {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(NumberUtils.toArray(5678)));
        System.out.println(NumberUtils.countMatches(39628,97324));
        System.out.println(NumberUtils.countIntersect(39628,97324));

    }
}

