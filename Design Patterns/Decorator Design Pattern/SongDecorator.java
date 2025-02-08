public abstract class SongDecorator implements Song {
    public Song decoratedSong;

    SongDecorator(Song song){
        this.decoratedSong=song;
    }

    @Override
    public String getDescription(){
        return decoratedSong.getDescription();
    }

    @Override
    public String play(){
        return decoratedSong.play();
    }
}
