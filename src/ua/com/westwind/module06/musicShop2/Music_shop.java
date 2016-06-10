package ua.com.westwind.module06.musicShop2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Music_shop {
    public List<Music_instruments> prepareInstruments(Map<String, Integer> order) {
        Map instruments = new HashMap< String, Music_instruments>();
        Music_shop piano = new Music_instruments("Piano");
        instruments.put("1","2");
        return null;
    }
}

/*
Сигнатура метода:
public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.
Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
*/

/* return(prepareInstruments(Map,order)); */