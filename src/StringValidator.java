import java.util.function.Predicate;

class StringValidator {
    private static final Predicate<String> notNull = s -> s != null;
    private static final Predicate<String> notEmpty = s -> s != null && s.length() > 0;

    public static boolean isNotNullAndNotEmpty(String str) {
        return notNull.and(notEmpty).test(str);
    }

    public static boolean startsWithJOrNAndEndsWithA(String str) {
        return (str != null) && (str.startsWith("J") || str.startsWith("N")) && str.endsWith("A");
    }
}