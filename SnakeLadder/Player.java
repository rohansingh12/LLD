public class Player {
    private String name;
    private int position;

    Player(String name){
        this.name=name;
        this.position=0;
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return this.name;
    }

    public void setPosition(int location){
        this.position=location;
    }

}
