public class MyCircularQueue {
    private int []  array;
    private int start;
    private int end;
    private int maxNum;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array=new int[k+1];          // Waste one nt variable for judging the full or empty
        maxNum=k+1;
        start=0;
        end=0;                       // The index of the last variable is end - 1
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        array[end]=value;
        end=(end+1)%maxNum;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        start=(start+1)%maxNum;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return array[start];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return array[(end-1+maxNum)%maxNum];    // Be careful when the index of end is 0, we should transform -1 to maxNum-1
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (start==end){
            return true;
        }
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if ((end+1)%maxNum==start){
            return true;
        }
        return false;
    }
}
/**
 * Java has a defined queue!
 */
/*
public class Main {
    public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element.
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element.
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }
}

 */