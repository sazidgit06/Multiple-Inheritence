public interface MusicPlayer extends Device {
    default void start(){
        System.out.println("Music player is ready to play songs.");
    }
}
