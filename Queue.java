package Lab2;
import java.util.ArrayList;

public class Queue {
    private int maxSize;
    private ArrayList<Box> boxes;
    private boolean Parameters;

    Queue() {
        boxes = new ArrayList<Box>();
        Parameters = false;
    }
    Queue(int maxSize) {
        boxes = new ArrayList<>();
        Parameters = true;
        this.maxSize = maxSize;
    }
    public void push(Box value) {
        if(Parameters)
        {
            if(boxes.size() < maxSize)
            {
                boxes.add(value);
            }
            else
            {
                System.out.println("Out of Space!");
            }
        }
        else
        {
            boxes.add(value);
        }
    }
    public Box pop() {
        Box temporaryBox;
        if(boxes != null)
        {
            temporaryBox = boxes.get(0);
            boxes.remove(0);
            return temporaryBox;
        }
        return null;
    }
    public void checkFull()
    {
        if(Parameters)
        {
            System.out.println("Current size:"+ boxes.size());
            System.out.println("Max Size:" + maxSize);
        }
        else
        {
            System.out.println("It is never full!");
        }
    }
}
