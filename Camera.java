public interface Camera extends Device {
    default void start(){
        System.out.println("Camera is ready to capture photos.");
    }
}
