public class Snake {
    private int startPosition;
    private int endPosition;

    Snake(int start, int end){
        if(end>=start){
            throw new IllegalArgumentException("Snake end cannot be at this position.");
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
