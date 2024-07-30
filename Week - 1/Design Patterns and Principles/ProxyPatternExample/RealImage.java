package ProxyPatternExample;

public class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image: " + imageName);
        // Simulate time-consuming image loading process
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageName);
    }
}