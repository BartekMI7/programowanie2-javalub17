package day2.tel;

import java.util.TreeMap;

public class KsiazkaTelefoniczna {
    public static void main(String[] args) {
        TreeMap<NrTelefoniczny, Wpis> ksiazka = new TreeMap<>();
        Osoba osoba1 = new Osoba("Jan", "Kowalski", "ul. Kowalska 5", new NrTelefoniczny("081", "5264678"));
        Osoba osoba2 = new Osoba("Andrzej", "Nowak", "ul. Dluga 7", new NrTelefoniczny("042", "7568699"));
        Osoba osoba3 = new Osoba("Ryszard", "Daba", "ul. Krotka 7", new NrTelefoniczny("081", "4428596"));
        ksiazka.put(osoba1.getNrTelefonu(), osoba1);
        ksiazka.put(osoba2.getNrTelefonu(), osoba2);
        ksiazka.put(osoba3.getNrTelefonu(), osoba3);


        Firma firma1 = new Firma("SDA", "al. Racławickie 9", new NrTelefoniczny("012", "7726558"));
        Firma firma2 = new Firma("McDonald's", "ul. Rynek 12", new NrTelefoniczny("022", "6545612"));
        Firma firma3 = new Firma("Orlen", "ul. Szeroka 88", new NrTelefoniczny("044", "3216497"));

        ksiazka.put(firma1.getNrTelefonu(), firma1);
        ksiazka.put(firma2.getNrTelefonu(), firma2);
        ksiazka.put(firma3.getNrTelefonu(), firma3);


        ksiazka.entrySet().forEach(a -> {
            System.out.println(a.getKey());
            System.out.println(a.getValue());

        });
    }
}
