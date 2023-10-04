package main.zad3;

import java.util.ArrayList;
import java.util.Arrays;

public class RussianGame extends AbsractGame{
    @Override
    ArrayList<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("а", "б", "в", "г", "д", "е", "ё", "ж",
                "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
                "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"));
    }
}
