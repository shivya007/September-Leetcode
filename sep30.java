//1381. Design a Stack With Increment Operation

class CustomStack {
    int size;
    ArrayList<Integer> list;
    public CustomStack(int maxSize) {
        this.size = maxSize;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        if(list.size() < size)
        list.add(x);
    }
    
    public int pop() {
        if(list.size() == 0) return -1;
        int popel = list.get(list.size()-1);
        list.remove(list.size()-1);
        return popel;
    }
    
    public void increment(int k, int val) {
        if(list.size() < k){
            for(int i =0; i < list.size(); i++){
                list.set(i, list.get(i) + val);
            }
        }
        else{
            for(int i =0; i < k; i++){
                list.set(i, list.get(i) + val);
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */