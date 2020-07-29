package structural.adaptor;

public class VlcPlayer implements AdvancedMediaplayer {


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.name : "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
