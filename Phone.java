public class Phone implements Camera, MusicPlayer {
    public void start() {
        Camera.super.start();
        MusicPlayer.super.start();
        System.out.println("Phone is ready for all features.");
    }

}
