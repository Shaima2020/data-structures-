import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {

        ArrayQueue<Character> queue=new ArrayQueue<>(5);
        System.out.println("input queue elements");
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            queue.enqueue(in.next().charAt(0));
            System.out.println(" first = "+queue.first());
            System.out.println(" size ="+queue.size());
        }
        System.out.println("all elements are ");
        while (!queue.isEmpty())
            System.out.print(queue.dequeue()+"\t");
    }
}
