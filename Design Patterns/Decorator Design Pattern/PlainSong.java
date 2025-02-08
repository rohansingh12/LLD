public class PlainSong implements Song{

    @Override
    public String getDescription(){
        return "In plain song";
    }

    public String play(){
        return "Playback: playing the song";
    }
}
