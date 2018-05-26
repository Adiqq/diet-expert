package sample;

import com.sun.javaws.exceptions.InvalidArgumentException;

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
}
