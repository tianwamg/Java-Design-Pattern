package structural.adaptor;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaplayer advancedMediaplayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaplayer = new VlcPlayer();
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaplayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaplayer.playVlc(fileName);
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaplayer.playMp4(fileName);
        }
    }
}
