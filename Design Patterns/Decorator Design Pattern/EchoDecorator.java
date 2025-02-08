public class EchoDecorator extends SongDecorator {
    public EchoDecorator(Song decoratedSong){
        super(decoratedSong);
    }

    @Override
    public String getDescription(){
        return decoratedSong.getDescription()+" added Echo Effect";
    }

    @Override 
    public String play(){
        return decoratedSong.play()+" with echo effect";
    }
}
