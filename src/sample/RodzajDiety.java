package sample;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;

public enum RodzajDiety {
    Wszystko,
    Wege,
    IG;

    public static RodzajDiety fromString(String dieta) throws InvalidArgumentException {
        switch (dieta){
            case "Wszystko":
                return RodzajDiety.Wszystko;
            case "Wegetariańska":
                return RodzajDiety.Wege;
            case "Niski indeks glikemiczny":
                return RodzajDiety.IG;
        }
        throw new InvalidArgumentException(new String[] {dieta});
    }

    public static ArrayList<RodzajDiety> wszystkieDiety(){
        ArrayList<RodzajDiety> diety = new ArrayList<>();
        diety.add(Wszystko);
        diety.add(Wege);
        diety.add(IG);
        return diety;
    }
}
