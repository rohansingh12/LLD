public class Ladder {
    private int startPosition;
    private int endPosition;
    
    Ladder(int start, int end){
        if(start>=end){
            throw new IllegalArgumentException("Ladder Start cannot be at this position");
        }
        this.startPosition=start;
        this.endPosition=end;
    }
    public int getStartPosition(){
        return startPosition;
    }

    public int getEndPosition(){
        return endPosition;
    }

}
