//729. My Calendar I
class MyCalendar {
    Set<int[]> set;
    public MyCalendar() {
        set = new TreeSet<>((x, y)-> Integer.compare(x[0], x[1]));
    }
    
    public boolean book(int start, int end) {
        for(int[] pair: set){
            int s = pair[0];
            int e = pair[1];
            if(start < e && s < end) return false;
        }
        set.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */