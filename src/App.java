
public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.start();
    }

    private void start() {
        try {
            Homepage homepage =  new Homepage();
        } catch (Exception e) {
            System.err.println("Failed to start");
            e.printStackTrace();
        }
    }
}
