import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LaptopFactory {


    // I created the static lists with various values for the laptop object
    static ArrayList<String> marks = new ArrayList<>(Arrays.asList("Asus", "Dell", "Sony", "Apple", "Hp", "Lenovo",
            "Toshiba", "Acer", "Apple", "Microsoft", "MSI", "Fujitsu", "Huawei", "LG", "Intel", "Allview", "Razer",
            "Samsung", "Panasonic", "Weigo", "Yashi", "Prestigio", "Tesla", "Surface", "Vastking", "Jumper"));
    static ArrayList<String> processors = new ArrayList<>(Arrays.asList("Intel Core i3", "Intel Core i5", "Intel Core i7",
            "Intel Core i9", "Intel Pentium", " Intel Xeon", " Intel Celeron", "Intel Core m3",
            "AMD Athlon", "AMD A4-Series", "AMD A9-Series", "AMD Ryzen 3", "AMD Ryzen 5", "AMD Ryzen 7", "AMD Ryzen 9"));

    static ArrayList<String> storageType = new ArrayList<>(Arrays.asList("HDD", "HDD + SSD", "Optane", "SSD", "SSHD", "eMMC"));
    static ArrayList<Integer> rams = new ArrayList<>(Arrays.asList(8, 12, 16, 24, 64));
    static ArrayList<String> chipsetVideos = new ArrayList<>(Arrays.asList("AMD Radeon", "AMD Radeon R Series",
            "AMD Radeon Vega", "Intel Arc", "Intel HD", "Intel Iris", "Intel Iris Xe", "Intel UHD", "nVidia",
            "nVidia GeForce GTX", "nVidia GeForce MX", "nVidia GeForce RTX", "nVidia Quadro"));
    static ArrayList<Double> diagonals = new ArrayList<>(Arrays.asList(11.0, 12.9, 13.0, 13.9, 14.0, 14.9, 15.0, 15.6, 16.0, 17.3));

    static ArrayList<String> displayFormat = new ArrayList<>(Arrays.asList("Full HD", "WUXGA", "WQHD", "Ultra HD/4K", "HD+"));

    static ArrayList<Double> prices = new ArrayList<>(Arrays.asList(1999.99, 2599.99, 3249.99, 4500.00, 4299.99, 1999.99,
            2879.99, 3589.99, 5499.99, 16299.99, 3863.99, 6899.99, 6199.99, 4788.99, 8999.99, 10999.99, 4399.99));

    private static final Random rnd = new Random();
    private static int choice = rnd.nextInt(10);


    // in the method below that returns a laptop, I gave values through a static Random object to be able to generate
    // laptops with different values
    public static Laptop generateLaptop() {
        return new Laptop(marks.get(rnd.nextInt(marks.size())),
                rams.get(rnd.nextInt(rams.size())),
                chipsetVideos.get(rnd.nextInt(chipsetVideos.size())),
                processors.get(rnd.nextInt(processors.size())),
                storageType.get(rnd.nextInt(storageType.size())),
                diagonals.get(rnd.nextInt(diagonals.size())),
                displayFormat.get(rnd.nextInt(displayFormat.size())),
                choice < 3,
                prices.get(rnd.nextInt(prices.size())));
    }
}
