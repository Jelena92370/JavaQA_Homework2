import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<String> strings = List.of("Hello ", "from ", "Paris, ", "the ", "most ", "beautiful ", "city ");
            String unitedString = ArrayListWorkUtil.uniteToOneString(strings);
            System.out.println("All strings united : " + unitedString);

        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2, 55, 5, 3, 5);
        int max = ArrayListWorkUtil.getMax(numbers);

        System.out.println("Максимальное значение из списка = " + max);

        List<String> strings2 = List.of("Hello ", "from ", "Paris, ", "the ", "most ", "beautiful ", "city ");
        int maxLength = ArrayListWorkUtil.getMaxLength(strings2);

        System.out.println("Максимальная длина строки = " + maxLength);

        List<String> strings3 = List.of("Hello ", "from ", "Paris, ", "the ", "most ", "beautiful ", "city ");
        int givenLength = 5;
        List<String> foundStrings = ArrayListWorkUtil.findGivenLength(strings3, givenLength);
        System.out.println("There are strings with given length " + givenLength + ": " + foundStrings);


        List<Integer> numbers2 = List.of(3, 1, 4, 1, 5, 9, 2, 55, 5, 3, 5, 33);
        List<Integer> oddNumbers = ArrayListWorkUtil.getOddNumbers(numbers2);

        System.out.println("Нечетные числа из списка = " + oddNumbers);

        List<String> strings4 = List.of("Hello ", "Hello ", "from ", "Paris, ", "Paris, ", "the ", "most ", "beautiful ", "city ", "city ");
        List<String> uniqueStrings = ArrayListWorkUtil.printOnlyUnique(strings4);

        System.out.println("Только уникальные строки из списка = " + uniqueStrings);

        }



    }