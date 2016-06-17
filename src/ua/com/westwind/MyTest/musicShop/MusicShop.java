package ua.com.westwind.MyTest.musicShop;

import java.util.*;

public class MusicShop {
    public static void main(String[] args) {
        String key;
        /*final List<Instruments> instrumentsList = new ArrayList<>();
        instrumentsList.add(new Instruments("guitar", 16));
        instrumentsList.add(new Instruments("piano", 2));
        instrumentsList.add(new Instruments("trumpet", 7));*/

        Map<String, Integer> instrumentsList = new HashMap<>();
        instrumentsList.put("guitar", 16);
        instrumentsList.put("piano", 2);
        instrumentsList.put("trumpet", 7);

        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 7);
        order.put("trumpet", 2);

        for (Map.Entry<String, Integer> inst : instrumentsList.entrySet()) {
            for (Map.Entry<String, Integer> ord : order.entrySet()) {

                if ("quitar".equals(ord.getKey())) {
                    int x = ord.getValue();}
                    if ("quitar".equals(inst.getKey())) {
                        int y = inst.getValue();
                    }

                    /*instrumentsList.put("guitar", inst-y);*/
                /*System.out.println("Ostatok " + inst);*/
                /*System.out.println(x);*/

            }
            inst.setValue(y-x);
        }


          /*  Map<String, Integer> order = new HashMap<>();
            order.put("guitar", 7);
            order.put("trumpet", 2);

            for (Map.Entry<String, Integer> ord : order.entrySet()) {
                *//*System.out.println("Zakaz " + ord);*//*
                if ("guitar".equals(ord.getKey())) {
                    key = "guitar";
                    int y = ord.getValue();
                    instrumentsList.put("guitar", inst-y)
                    *//*System.out.println(y);*//*
                }
            }
        final List<Instruments> prepareInstruments = new ArrayList<>();*/

    }
}
