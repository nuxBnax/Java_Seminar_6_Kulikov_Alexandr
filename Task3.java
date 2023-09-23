import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        intro();
        menu();
    }

    public static Set<NoteBook> set = new HashSet<>();

    public static Set<String> setBrand = new HashSet<>();
    public static Set<String> setColor = new HashSet<>();
    public static Set<Integer> setRAM = new HashSet<Integer>();
    public static Set<Integer> setHDDvolume = new HashSet<Integer>();
    public static Set<Integer> setDiagonal = new HashSet<Integer>();
    public static Set<Integer> setPrice = new HashSet<Integer>();

    public static TreeMap<Integer, String> mapBrand = new TreeMap<>();
    public static TreeMap<Integer, String> mapColor = new TreeMap<>();
    public static TreeMap<Integer, Integer> mapRAM = new TreeMap<>();
    public static TreeMap<Integer, Integer> mapHDDvolume = new TreeMap<>();
    public static TreeMap<Integer, Integer> mapDiagonal = new TreeMap<>();
    public static TreeMap<Integer, Integer> mapPrice = new TreeMap<>();

    private static void intro() {

        set.add(new NoteBook("Asus","Black", 4, 120, 15, 10000));
        set.add(new NoteBook("Asus","Black", 8, 120, 17, 12000));
        set.add(new NoteBook("Asus","White", 16, 120, 15, 20000));
        set.add(new NoteBook("Asus","White", 16, 240, 15, 80000));
        set.add(new NoteBook("Asus","White", 8, 480, 15, 120000));
        set.add(new NoteBook("Asus","Black", 8, 120, 15, 10000));
        set.add(new NoteBook("Asus","Black", 2, 240, 17, 12000));
        set.add(new NoteBook("Asus","White", 2, 120, 15, 20000));
        set.add(new NoteBook("Asus","White", 16, 240, 19, 80000));
        set.add(new NoteBook("Asus","White", 4, 480, 15, 120000));
        set.add(new NoteBook("Asus","Silver", 4, 120, 17, 10000));
        set.add(new NoteBook("Asus","Silver", 2, 240, 17, 12000));
        set.add(new NoteBook("Asus","Silver", 2, 120, 15, 20000));
        set.add(new NoteBook("Asus","Silver", 16, 480, 17, 80000));
        set.add(new NoteBook("Asus","Silver", 8, 480, 15, 120000));

        set.add(new NoteBook("HP","Black", 8, 240, 19, 20000));
        set.add(new NoteBook("HP","White", 4, 120, 15, 12000));
        set.add(new NoteBook("HP","Silver", 6, 240, 19, 20000));
        set.add(new NoteBook("HP","Silver", 2, 120, 15, 12000));
        set.add(new NoteBook("HP","White", 16, 480, 15, 120000));
        set.add(new NoteBook("HP","Silver", 2, 480, 19, 120000));
        set.add(new NoteBook("HP","Black", 8, 480, 17, 80000));
        set.add(new NoteBook("HP","Black", 4, 320, 15, 20000));
        set.add(new NoteBook("HP","Silver", 16, 480, 19, 120000));
        set.add(new NoteBook("HP","White", 16, 240, 17, 130000));
        set.add(new NoteBook("HP","Silver", 6, 480, 19, 37000));
        set.add(new NoteBook("HP","White", 4, 320, 15, 16000));
        set.add(new NoteBook("HP","Silver", 16, 480, 19, 120000));
        set.add(new NoteBook("HP","Black", 6, 320, 19, 20000));
        set.add(new NoteBook("HP","White", 2, 120, 15, 16000));
        set.add(new NoteBook("HP","Silver", 16, 120, 17, 120000));
        set.add(new NoteBook("HP","Black", 6, 480, 17, 20000));
        set.add(new NoteBook("HP","Black", 4, 320, 15, 16000));

        set.add(new NoteBook("Acer","Silver", 4, 250, 19, 16000));
        set.add(new NoteBook("Acer","White", 16, 480, 17, 80000));
        set.add(new NoteBook("Acer","Black", 16, 480, 15, 80000));
        set.add(new NoteBook("Acer","Silver", 4, 240, 19, 16000));
        set.add(new NoteBook("Acer","White", 2, 480, 17, 80000));
        set.add(new NoteBook("Acer","Silver", 16, 120, 17, 10000));
        set.add(new NoteBook("Acer","White", 8, 340, 19, 16000));
        set.add(new NoteBook("Acer","Black", 16, 320, 17, 80000));
        set.add(new NoteBook("Acer","Silver", 16, 320, 15, 20000));
        set.add(new NoteBook("Acer","Black", 4, 120, 15, 10000));
        set.add(new NoteBook("Acer","White", 8, 240, 17, 18000));
        set.add(new NoteBook("Acer","Silver", 16, 120, 17, 10000));
        set.add(new NoteBook("Acer","White", 8, 340, 19, 16000));
        set.add(new NoteBook("Acer","Black", 16, 480, 15, 90000));
        set.add(new NoteBook("Acer","White", 4, 240, 19, 16000));

    }
    public static void allBrands() {
        for (NoteBook item: set) {
            setBrand.add(item.Brand);
        }
        int i = 1;
        for (String item : setBrand) {
            mapBrand.put(i, item); // заполнение коллекции mapBrand
            i++;
        }
        for (Map.Entry entry: mapBrand.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }
    public static void allColors() {
        for (NoteBook item: set) {
            setColor.add(item.Color);
        }
        int i = 1;
        for (String item : setColor) {
            mapColor.put(i, item); // заполнение коллекции mapColor
            i++;
        }
        for (Map.Entry entry: mapColor.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }
    public static void allRAM() {
        for (NoteBook item: set) {
            setRAM.add(item.RAM);
        }
        int i = 1;
        for (int item : setRAM) {
            mapRAM.put(i, item); // заполнение коллекции mapRAM
            i++;
        }
        for (Map.Entry entry: mapRAM.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }
    public static void allHDDvolume() {
        for (NoteBook item: set) {
            setHDDvolume.add(item.HDDvolume);
        }
        int i = 1;
        for (int item : setHDDvolume) {
            mapHDDvolume.put(i, item); // заполнение коллекции mapHDDvolume
            i++;
        }
        for (Map.Entry entry: mapHDDvolume.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }
    public static void allDiagonal() {
        for (NoteBook item: set) {
            setDiagonal.add(item.Diagonal);
        }
        int i = 1;
        for (int item : setDiagonal) {
            mapDiagonal.put(i, item); // заполнение коллекции mapDiagonal
            i++;
        }
        for (Map.Entry entry: mapDiagonal.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }
    public static void allPrices() {
        for (NoteBook item: set) {
            setPrice.add(item.Price);
        }
        int i = 1;
        for (int item : setPrice) {
            mapPrice.put(i, item); // заполнение коллекции mapPrice
            i++;
        }
        for (Map.Entry entry: mapPrice.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }
    public static void menu() {

        Scanner cs = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш магазин техники\n" +
                "Выберите цифру с командой: \n" +
                "1 - Просмотреть весь список Ноутбуков\n" +
                "2 - Выбрать Ноутбук\n" +
                "3 - Выход из меню");

        int num = cs.nextInt();

        switch (num) {
            case 1:
                System.out.println(set);
                break;
            case 2:
                compare();
                break;
            case 3:
                break;

            default:
                System.out.println("Ошибка! Введите цифру среди предложенных в меню!");
                break;
        }
        cs.close();

    }
    public static void compare() {
        NoteBook client = client();
        for (NoteBook item : set) {
            if(item.equals(client)) {
                System.out.println(item);
            }
        }
    }

    public static NoteBook client() {

        String Brand;
        String Color;
        int RAM;
        int HDDvolume;
        int Diagonal;
        int Price;

        Scanner cs = new Scanner(System.in);

        System.out.println("Введите цифру отвечающую за Бренд:");
        Task3.allBrands();
        int brandNum = cs.nextInt();
        Brand = mapBrand.get(brandNum);

        System.out.println("Введите цифру отвечающую за Цвет:");
        Task3.allColors();
        int colorNum = cs.nextInt();
        Color = mapColor.get(colorNum);

        System.out.println("Введите цифру отвечающую за Объем оперативной памяти:");
        Task3.allRAM();
        int ramNum = cs.nextInt();
        RAM = mapRAM.get(ramNum);

        System.out.println("Введите цифру отвечающую за Объем жесткого диска:");
        Task3.allHDDvolume();
        int hddNum = cs.nextInt();
        HDDvolume = mapHDDvolume.get(hddNum);

        System.out.println("Введите цифру отвечающую за Диагональ экрана:");
        Task3.allDiagonal();
        int diagonalNum = cs.nextInt();
        Diagonal = mapDiagonal.get(diagonalNum);

        System.out.println("Введите цифру отвечающую за Цену:");
        Task3.allPrices();
        int priceNum = cs.nextInt();
        Price = mapPrice.get(priceNum);
        cs.close();

        NoteBook client = new NoteBook(Brand, Color, RAM, HDDvolume, Diagonal, Price);

        return client;
    }

}
