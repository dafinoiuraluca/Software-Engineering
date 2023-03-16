package Lab5.Ex2;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    private RotatedImage rotatedImage;
    private boolean displayReal;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public ProxyImage(String fileName, boolean displayReal) {
        this.fileName = fileName;
        this.displayReal = displayReal;
    }

    @Override
    public void display() {
        if(displayReal) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
        else {
            if(rotatedImage == null) {
                rotatedImage = new RotatedImage(fileName);
            }
            rotatedImage.display();
        }
    }

}
