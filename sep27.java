//731. My Calendar II

class MyCalendarTwo {
    static class pair{
        int first;
        int second;
        public pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    ArrayList<pair> doubleRegionOverlapped;
    ArrayList<pair> OverallBooking;     
    public MyCalendarTwo() {
        doubleRegionOverlapped = new ArrayList<>();
        OverallBooking = new ArrayList<>();
    }
     private boolean checkOverlap(int start1, int end1, int start2, int end2) {
        return Math.max(start1, start2) < Math.min(end1, end2);
    }
    private pair findRegion(int start1, int end1, int start2, int end2){
        return new pair(Math.max(start1, start2) , Math.min(end1, end2));
    }
    
    public boolean book(int start, int end) {
        // check if incoming pair will create triple booking
        for(pair currentpair: doubleRegionOverlapped){
            if(checkOverlap(currentpair.first, currentpair.second, start, end)){
                return false; // triple booking is occuring
            }
        }
        // check if double booking is occuring
        for(pair currentpair: OverallBooking){
            if(checkOverlap(currentpair.first, currentpair.second, start, end)){
                doubleRegionOverlapped.add(findRegion(currentpair.first, currentpair.second, start, end));
            }
        }
        OverallBooking.add(new pair(start, end));
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */