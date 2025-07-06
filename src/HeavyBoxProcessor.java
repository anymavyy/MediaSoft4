import java.util.function.Consumer;

class HeavyBoxProcessor {
    private final Consumer<HeavyBox> printWeight = box -> System.out.println("Отгрузили ящик с весом " + box.weight);
    private final Consumer<HeavyBox> sendMessage = box -> System.out.println("Отправляем ящик с весом " + box.weight);

    public void process(HeavyBox box) {
        printWeight.andThen(sendMessage).accept(box);
    }
}