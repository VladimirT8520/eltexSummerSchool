public class Walk {
    public static void main(String[] args) {
        Thread thread = new Thread(new WalkRunnable());
        thread.start();
    }
}
