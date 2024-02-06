import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args)
    {
        ArrayDeque<HeavyBox> boxes= new ArrayDeque<HeavyBox>();
        boxes.offer(new HeavyBox(1));
        boxes.offer(new HeavyBox(10));
        boxes.offer(new HeavyBox(20));
        System.out.println(boxes.size());
        for (HeavyBox box: boxes)
        {
            System.out.println(box.getWeight());
            boxes.poll();
        }
        System.out.println(boxes.size());
    }
}
