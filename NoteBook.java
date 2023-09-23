import java.util.*;

public class NoteBook {

    public String Brand;
    public String Color;
    public int RAM;
    public int HDDvolume;
    public int Diagonal;
    public int Price;

    public NoteBook(String Brand, String Color, int RAM, int HDDvolume, int Diagonal, int Price) {
        this.Brand = Brand;
        this.Color = Color;
        this.RAM = RAM;
        this.HDDvolume = HDDvolume;
        this.Diagonal = Diagonal;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Brand : " + Brand + "\t" + "Color : " + Color + "\t" + "RAM : " + RAM + "\t" + "HDDvolume : " + HDDvolume + "\t" +
                "Diagonal : " + Diagonal + "\t" + "Price : " + Price + "\n";
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
