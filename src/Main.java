import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args)
    {
        ArrayDeque<HeavyBox> boxes= new ArrayDeque<HeavyBox>();
        boxes.offerLast(new HeavyBox(1));
        boxes.offerFirst(new HeavyBox(10));
        boxes.offerFirst(new HeavyBox(20));
        System.out.println(boxes.size());
        for (HeavyBox box: boxes)
        {
            System.out.println(box.getWeight());
            boxes.pollFirst();
        }
        System.out.println(boxes.size());
    }
}
