import java.util.function.Function;

class NumberChecker {
    public static String checkNumber(int number) {
        Function<Integer, String> check = i -> {
            if (i > 0) return "Положительное число";
            else if (i < 0) return "Отрицательное число";
            else return "Ноль";
        };
        return check.apply(number);
    }
}