//641. Design Circular Deque

class MyCircularDeque {
    int[] Array;
    int K;
    int currentSize;
    int front;
    int rear;
    public MyCircularDeque(int k) {
        K = k;
        Array = new int[K];
        currentSize =0;
        front = 0;
        rear = K-1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        front = (front - 1 + K) % K;
        Array[front] = value;
        currentSize++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        rear = (rear + 1) % K;
        Array[rear] = value;
        currentSize++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        front = (front + 1)% K;
        currentSize--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        rear = (rear - 1 + K)% K;
        currentSize--;
        return true;
    }
    
    public int getFront() {
        if(!isEmpty()) return Array[front];
        return -1;
    }
    
    public int getRear() {
        if(!isEmpty()) return Array[rear];
        return -1;
    }
    
    public boolean isEmpty() {
        return currentSize == 0;
    }
    
    public boolean isFull() {
        return currentSize == K;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */