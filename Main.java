package Lab2;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(8);
        Box box3 = new Box(3, 11, 7);
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(2);

        queue2.push(box1);
        queue2.push(box2);
        queue2.push(box3);
        queue2.pop();
        queue2.checkFull();
        queue1.push(box1);
        queue1.push(box2);
        queue1.pop();
        queue1.checkFull();
    }
}
