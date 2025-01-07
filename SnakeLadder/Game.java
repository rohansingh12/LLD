import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private Queue<Player> playerTurn;
    private List<Player> players;
    private Board board;
    private Dice dice;
    
    Game(int boardSize, int dices){
        this.dice = new Dice(dices);
        this.board=  new Board(boardSize);
        this.players= new ArrayList<>();
        this.playerTurn= new LinkedList<>();
    }

    public void addSnake(Snake snake){
        board.addSnake(snake);
    }

    public void addLadder(Ladder ladder){
        board.addLadder(ladder);
    }

    public void addPlayer(Player player){
        players.add(player);
        playerTurn.offer(player);
    }

    public void startGame(){
        System.out.println("Game started");
        while (true) {
            Player currentPlayer= playerTurn.poll();
            System.out.println(currentPlayer.getName()+"'s turn");
            int diceRoll= dice.getRoll();
            System.out.println(currentPlayer.getName()+" rolled a "+diceRoll);
            int position=currentPlayer.getPosition()+diceRoll;
            position=board.getPosition(position);
            System.out.println(currentPlayer.getName()+" moved to "+position);
            if(position==board.getSize()){
                System.out.println(currentPlayer.getName()+" won the game !");
                break;
            }
            else if(position>=board.getSize()){
                System.out.println(currentPlayer.getName() + "'s move is invalid");
                playerTurn.offer(currentPlayer);
                continue;
            }
            

            currentPlayer.setPosition(position);
            
            playerTurn.offer(currentPlayer);
        }
    }

}
