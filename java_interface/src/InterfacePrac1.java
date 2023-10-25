interface Playable{
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3 재생");
    }

    @Override
    public void pause() {
        System.out.println("MP3 일시중지");
    }

    @Override
    public void stop() {
        System.out.println("MP3 정지");
    }
}

class DVDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("DVD 재생");
    }

    @Override
    public void pause() {
        System.out.println("DVD 일시중지");
    }

    @Override
    public void stop() {
        System.out.println("DVD 정지");
    }
}

public class InterfacePrac1 {
    public static void main(String[] args) {
        MP3Player mp = new MP3Player();
        DVDPlayer dv = new DVDPlayer();

        mp.play();
        mp.pause();
        mp.stop();

        dv.play();
        dv.pause();
        dv.stop();
    }
}
