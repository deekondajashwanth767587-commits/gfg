class myQueue {
    int[] arr;
    int capacity;
    int front;
    int rear;
    int size;
    
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr = new int[n];
        capacity =n;
        front =0;
        rear=-1;
        size=0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==capacity;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull())return;
        rear= (rear+1)%capacity;
        arr[rear]=x;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty())return;
        front=(front+1)%capacity;
        size--;
        if(size==0){
            front=0;
            rear=-1;
        }
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty())return -1;
        return arr[rear];
    }
}
