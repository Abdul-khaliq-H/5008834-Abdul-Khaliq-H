package ProxyPatternExample;
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded and displayed when display() is called
        image1.display();  // This will load and display the image
        image1.display();  // This will display the cached image

        // Image will be loaded and displayed when display() is called
        image2.display();  // This will load and display the image
        image2.display();  // This will display the cached image
    }
}

// Output:
// Loading image: image1.jpg
// Displaying image: image1.jpg
// Displaying image: image1.jpg
// Loading image: image2.jpg
// Displaying image: image2.jpg
// Displaying image: image2.jpg
