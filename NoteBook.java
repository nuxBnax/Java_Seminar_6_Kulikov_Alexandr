import java.util.*;

public class NoteBook {

    private static String Brand;
    private String Color;
    private int RAM;
    private int HDDvolume;
    private int Diagonal;
    private int Price;


    private List<String> Store;

    public NoteBook(String Brand, String Color, int RAM, int HDDvolume, int Diagonal, int Price) {
        this.Brand = Brand;
        this.Color = Color;
        this.RAM = RAM;
        this.HDDvolume = HDDvolume;
        this.Diagonal = Diagonal;
        this.Price = Price;
    }


    static String allBrands() {
        return "Brand : " + Brand;
    }

//    public Map<Integer, String> numBrands() {
//        int i = 1;
//        while(!set.isEmpty) {
//            hMapBrand.put(i, Brand);
//            i++;
//
//        }
//        return hMapBrand;
//    }

    public Map<Integer, String> hMapBrand = new HashMap<>();

    public Set<NoteBook> set = new HashSet<>();
    public Set<NoteBook> clientSet = new HashSet<>();


//    public client(String Brand, String Color, int RAM, int HDDvolume, int Diagonal, int Price) {
//
//        NoteBook client = new NoteBook(Brand, Color, RAM, HDDvolume, Diagonal, Price);
//
//        Scanner cs = new Scanner(System.in);
//
//        System.out.println("Введите цифру отвечающую за Бренд:");
//        int brandNum = cs.nextLine();
//
//        System.out.println("Введите цифру отвечающую за Цвет:");
//        int colorNum = cs.nextLine();
//
//        System.out.println("Введите цифру отвечающую за Объем оперативной памяти:");
//        int hddNum = cs.nextInt();
//
//        System.out.println("Введите цифру отвечающую за Диагональ экрана:");
//        int diagonalNum = cs.nextInt();
//
//        System.out.println("Введите цифру отвечающую за Цену:");
//        int priceNum = cs.nextInt();
//
//        clientSet.add(client);
//        cs.close();
//    }


    @Override
    public String toString() {
        return "Brand : " + Brand + "Color : " + Color + "RAM : " + RAM + "HDDvolume : " + HDDvolume +
                "Diagonal : " + Diagonal + "Price : " + Price + "\n";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteBook)) {
            return false;
        }
        NoteBook note = (NoteBook) obj;
        return Brand.equals(note.Brand) &&
                Color.equals(note.Color) &&
                RAM >= note.RAM &&
                HDDvolume >= note.HDDvolume &&
                Diagonal >= note.Diagonal &&
                Price >= note.Price;
    }
}
