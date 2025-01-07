import java.util.List;
import java.util.ArrayList;


public class Board {
    private int boardSize;
    List<Snake> snakes;
    List<Ladder> ladders;

    Board(int size){
        this.boardSize=size;
        this.snakes= new ArrayList<>();
        this.ladders= new ArrayList<>();
    }
    public void addSnake(Snake snake){
        snakes.add(snake);
    }

    public void addLadder(Ladder ladder){
        ladders.add(ladder);
    }
    
    public int getPosition(int position){
        for(Snake snake : snakes){
            if(snake.getStartPosition()==position){
                System.out.println("Player got bit by snake");
                return snake.getEndPosition();
            }
        }
        for(Ladder ladder : ladders){
            if(ladder.getStartPosition()==position){
                System.out.println("Player got a ladder climb");
                return ladder.getEndPosition();
            }
        }
        return position;
    }

    public int getSize(){
        return boardSize;
    }
}
