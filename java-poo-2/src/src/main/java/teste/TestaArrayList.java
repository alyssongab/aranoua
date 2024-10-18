package teste;

import java.util.ArrayList;

public class TestaArrayList {

    public static void main(String[] args) {

        ArrayList<String> palavras = new ArrayList<String>();

        palavras.add("Amazonas");
        palavras.add("Manaus");
        palavras.add("IFAM");
        palavras.add("Aranouá");
        palavras.add("Samsung");

//        System.out.println(palavras.get(0));
//        System.out.println(palavras.get(1));
//        System.out.println(palavras.get(2));
//        System.out.println(palavras.get(3));
//        System.out.println(palavras.get(4));

        for(String palavra:palavras){
            System.out.println(palavra);
        }




    }
}
