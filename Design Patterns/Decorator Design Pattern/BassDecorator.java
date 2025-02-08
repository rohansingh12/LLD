public class BassDecorator extends SongDecorator{

    public BassDecorator(Song decoratedSong){
        super(decoratedSong);
    }

    @Override
    public String getDescription(){
        return decoratedSong.getDescription()+ " integrated Bass";
    }

    @Override
    public String play(){
        return decoratedSong.play()+ " with deep bass";
    }
}
