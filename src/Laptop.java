public class Laptop {

    private static int conterId = 0;
    private int id;
    private String mark;
    private int ram;
    private String chipsetVideo;
    private String processor;
    private String storageType;
    private double diagonal;
    private String displayFormat;
    private boolean touchscreen;
    private double price;

    public Laptop(String mark, int ram, String chipsetVideo, String processor, String storageType, double diagonal, String displayFormat,
                  boolean touchscreen, double price) {
        this.mark = mark;
        this.ram = ram;
        this.chipsetVideo = chipsetVideo;
        this.processor = processor;
        this.storageType = storageType;
        this.diagonal = diagonal;
        this.displayFormat = displayFormat;
        this.touchscreen = touchscreen;
        this.price = price;
        id = conterId++;
    }

    public String getMark() {
        return mark;
    }

    public int getRam() {
        return ram;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", ram=" + ram +
                ", chipsetVideo='" + chipsetVideo + '\'' +
                ", processor='" + processor + '\'' +
                ", storageType='" + storageType + '\'' +
                ", diagonal=" + diagonal +
                ", displayFormat='" + displayFormat + '\'' +
                ", touchscreen=" + touchscreen +
                ", price=" + price +
                '}';
    }
}
