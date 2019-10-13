package day1.plytaCD;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplikacja {
    private static final Biblioteka BIBLIOTEKA = new Biblioteka();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner odczyt = new Scanner(System.in);
        Scanner odczytDouble = new Scanner(System.in);

        String tmp;
        do {
            System.out.println(" 1 - jezeli chcesz zapisac biblioteke");
            System.out.println(" 2 - jezeli chcesz odczytac dane z biblioteki");
            System.out.println(" 3 - jezeli chcesz wyswietlic dane z biblioteki");
            System.out.println(" 4 - jezeli chcesz dodac plyte do biblioteki");
            System.out.println(" 5 - jezeli chcesz usunac plyte do biblioteki");
            System.out.println(" 6 - jezeli chcesz wyszukac plyte");
            System.out.println(" 0 - jezeli chcesz zakonczyc program");
            tmp = odczyt.nextLine();


            switch (tmp) {
                case "1":
                    BIBLIOTEKA.save();


                    break;

                case "2":

                    BIBLIOTEKA.read();


                    break;

                case "3":

                    System.out.println(BIBLIOTEKA);


                    break;


                case "4":
                    System.out.println("Podaj nazwe plyty");
                    String title = odczyt.nextLine();
                    System.out.println("Podaj rok wydania");
                    String year = odczyt.nextLine();
                    List<Utwor> lista = new ArrayList<>();
                    PlytaCD plytaCD = new PlytaCD(title, year, lista);
                    BIBLIOTEKA.addCD(plytaCD);
                    do {
                        System.out.println("Podaj nazwe utworu");
                        String nazwaUtworu = odczyt.nextLine();

                        System.out.println("Podaj wykonawce utworu");
                        String autorUtworu = odczyt.nextLine();

                        System.out.println("Podaj dlugosc utworu");
                        double dlugoscUtworu = odczytDouble.nextDouble();

                        lista.add(new Utwor(nazwaUtworu, autorUtworu, dlugoscUtworu));
                        System.out.println("czy dodac kolejny utwor t/n");
                        String wybor = odczyt.nextLine();
                        if ("n".equals(wybor)) {
                            break;
                        }
                    }
                    while (true);


                    break;


                case "5":


                    break;


                case "6":

                    System.out.println("Podaj nazwe pltyt ktora chcesz wyszukac");
                    String nazwaPlyty = odczyt.nextLine();
                    PlytaCD result = BIBLIOTEKA.searchByTitle(nazwaPlyty);
                    if (result != null) {
                        System.out.println(result);
                    } else {
                        System.out.println("nie znaleziono plyty o podanej nazwie");
                    }

                    break;

            }


            if ("0".equals(tmp)) {
                break;
            }
        }
        while (true);


    }
}

