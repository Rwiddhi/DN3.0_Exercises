public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("Wait Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName + " Here ");
    }
}
