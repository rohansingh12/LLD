public class MusicSystem {
    public static void main(String args[]){
        Song song = new PlainSong();
        System.out.println(song.getDescription());
        System.out.println(song.play());

        Song newSong = new BassDecorator(new PlainSong());
        System.out.println(newSong.getDescription());
        System.out.println(newSong.play());
        Song echoSong = new EchoDecorator(new PlainSong());
        System.out.println(echoSong.getDescription());
        System.out.println(echoSong.play());

        Song complexSong = new EchoDecorator(new BassDecorator(new PlainSong()));
        System.out.println(complexSong.getDescription());
        System.out.println(complexSong.play());
    }
    
}
