public class Main {
    public static void main(String args[]){
        Game game = new Game(100, 1);
        game.addPlayer(new Player("Bablu"));
        game.addPlayer(new Player("Dablu"));

        game.addSnake(new Snake(30, 3));
        game.addSnake(new Snake(70, 40));
        game.addSnake(new Snake(50, 2));
        game.addSnake(new Snake(96, 60));
        game.addSnake(new Snake(60, 47));

        game.addLadder(new Ladder(6, 66));
        game.addLadder(new Ladder(12, 28));
        game.addLadder(new Ladder(36, 90));
        game.addLadder(new Ladder(52, 81));

        game.startGame();
    }
   
}
