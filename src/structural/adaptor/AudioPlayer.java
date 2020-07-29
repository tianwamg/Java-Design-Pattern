package structural.adaptor;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //mp3内置播放
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 file.name : "+fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("invalid media."+audioType+"format not supported");
        }

    }
}
