import java.util.ArrayList;
import java.util.List;

public class ArrayListWorkUtil {

    //Задание 1
    public static String uniteToOneString(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    //Задание 2
        public static int getMax(List<Integer> numbers) {
            int max = numbers.get(0);
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

    //Задание 3
    public static int getMaxLength(List<String> strings2) {
        int maxLength = strings2.get(0).length();
        for (String str : strings2) {
            int newLength = str.length();
            if (newLength > maxLength) {
                maxLength = newLength;
            }
        }
        return maxLength;
    }

        //Задание 4

        public static List<String> findGivenLength(List<String> strings3, int givenLength) {
            List<String> result = new ArrayList<>();

            for (String str : strings3) {
                if (str.length() == givenLength) {
                    result.add(str);
                }
            }


            return result;

        }
        //Задание 5
        public static List<Integer> getOddNumbers(List<Integer> numbers2) {
            List<Integer> odd = new ArrayList<>();
            for (int num : numbers2) {
                if (num %2 != 0) {
                    odd.add(num);
                }
            }
            return odd;
    }

    // Задание 6
    public static List<String> printOnlyUnique(List<String> strings4) {
        List<String> unique = new ArrayList<>();

        for (String str : strings4) {
            if (!unique.contains(str)) {
                unique.add(str);
            }
        }


        return unique;

}
}