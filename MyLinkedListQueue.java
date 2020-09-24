import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public static ArrayList arrayList = new ArrayList();


    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            arrayList.add(key);
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
        temp.next = this.head;

        arrayList.add(key);

    }
    public Node dequeue() {
        arrayList.remove(0);
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        this.tail.next = this.head;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

    public void displayQueue(){
        ArrayList arrayList = MyLinkedListQueue.arrayList;

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
