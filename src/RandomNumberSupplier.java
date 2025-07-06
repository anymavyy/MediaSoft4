import java.util.function.Supplier;

class RandomNumberSupplier {
    private static final Supplier<Integer> random = () -> (int)(Math.random() * 11);

    public static int getRandom() {
        return random.get();
    }
}