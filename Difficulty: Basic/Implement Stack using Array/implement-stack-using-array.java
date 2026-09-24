class myStack {
    int[] arr ;
    int front;
    int top;
    int capacity;
    int size;
    
    public myStack(int n) {
        // Define Data Structures
        arr  = new int[n];
        capacity=n;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return (size==0);
    }

    public boolean isFull() {
        // check if the stack is full
        return (size==capacity);
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull())return;
        
        arr[size]=x;
        size++;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty())return;
        size--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty())return -1;
        return arr[size-1];
    }
}