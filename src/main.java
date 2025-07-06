class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Лямбда выражение для интерфейса Printable");
        testPrintable();

        System.out.println("\nЗадание 2: Проверка пустой строки");
        testStringValidation();

        System.out.println("\nЗадание 3: Проверка строки");
        testStringStartEnd();

        System.out.println("\nЗадание 4: Лямбда выражение для HeavyBox");
        testHeavyBox();

        System.out.println("\nЗадание 5: Лямбда для Function");
        testNumberChecker();

        System.out.println("\n=== Задание 6: Лямбда для Supplier");
        testRandomNumberSupplier();
    }
    @FunctionalInterface
    private interface Printable {
        void print();
    }

    private static void testPrintable() {
        Printable printable = () -> System.out.println("Вывод с помощью лямбда выражения");
        printable.print();
    }

    private static void testStringValidation() {
        String test1 = "Java";
        String test2 = "'  '";
        String test3 = null;

        System.out.println(test1 + " " + StringValidator.isNotNullAndNotEmpty(test1));
        System.out.println(test2 + " " + StringValidator.isNotNullAndNotEmpty(test2));
        System.out.println(test3 + " " + StringValidator.isNotNullAndNotEmpty(test3));
    }

    private static void testStringStartEnd() {
        System.out.println("Java: " + StringValidator.startsWithJOrNAndEndsWithA("Java"));
        System.out.println("NapA: " + StringValidator.startsWithJOrNAndEndsWithA("NapA"));
        System.out.println("japanA: " + StringValidator.startsWithJOrNAndEndsWithA("japanA"));
        System.out.println("Jamaica: " + StringValidator.startsWithJOrNAndEndsWithA("Jamaica"));
    }

    private static void testHeavyBox() {
        HeavyBox box = new HeavyBox(10);
        HeavyBoxProcessor processor = new HeavyBoxProcessor();
        processor.process(box);
    }

    private static void testNumberChecker() {
        System.out.println("5: " + NumberChecker.checkNumber(5));
        System.out.println("-3: " + NumberChecker.checkNumber(-3));
        System.out.println("0: " + NumberChecker.checkNumber(0));
    }

    private static void testRandomNumberSupplier() {
        System.out.println("Случайное число: " + RandomNumberSupplier.getRandom());
        System.out.println("Случайное число: " + RandomNumberSupplier.getRandom());
        System.out.println("Случайное число: " + RandomNumberSupplier.getRandom());
    }
}