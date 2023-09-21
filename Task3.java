import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        intro();
        menu();
//        System.out.println(set);
//        System.out.println(cat2.equals(cat3));


//
//        Scanner cs = new Scanner(System.in);
//        System.out.println("Введите число");
//
//        int number = cs.nextInt();

    }
    public static Set<NoteBook> set = new HashSet<>();
    private static void intro() {
        NoteBook note1 = new NoteBook("Asus","Black", 4, 120, 15, 10000);
        NoteBook note2 = new NoteBook("Asus","Black", 8, 120, 17, 12000);
        NoteBook note3 = new NoteBook("Asus","White", 16, 120, 15, 20000);
        NoteBook note4 = new NoteBook("Acer","Black", 4, 120, 15, 9000);
        NoteBook note5 = new NoteBook("Acer","White", 8, 240, 17, 18000);
        NoteBook note6 = new NoteBook("HP","Black", 8, 320, 19, 25000);
        NoteBook note7 = new NoteBook("HP","Black", 4, 120, 15, 17000);
        NoteBook note8 = new NoteBook("MacBook","White", 16, 500, 15, 85000);
        NoteBook note9 = new NoteBook("MacBook","Black", 16, 1000, 17, 95000);
        NoteBook note10 = new NoteBook("MacBook","Silver", 16, 2000, 19, 130000);
        // System.out.println(cat1);
        // System.out.println(cat2);

        set.add(note1);
        set.add(note2);
        set.add(note3);
        set.add(note4);
        set.add(note5);
        set.add(note6);
        set.add(note7);
        set.add(note8);
        set.add(note9);
        set.add(note10);

        System.out.println(set);
    }


    static void menu() {

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
//            case 2:
//                client();
//                break;
            case 3:
                NoteBook.allBrands();
                break;

            default:
                System.out.println("Ошибка! Введите цифру среди предложенных в меню!");
                break;
        }

        cs.close();

    }


}
