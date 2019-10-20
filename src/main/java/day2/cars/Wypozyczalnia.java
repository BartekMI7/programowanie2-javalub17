package day2.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wypozyczalnia {
    private final List<Samochod> samochody = new ArrayList<>();
    private final List<Klient> klienci = new ArrayList<>();
    private final List<Wypozyczenie> wypozyczenia = new ArrayList<>();
    private final List<Rezerwacja> rezerwacje = new ArrayList<>();
    public void dodajKlienta(Klient klient) {
        Optional<Klient> foundKlient = klienci.stream().filter(a -> a.getNumerDowodu().equals(klient.getNumerDowodu()))
                .findAny();
        if (!foundKlient.isPresent()) {
            klienci.add(klient);
        }
    }
    public void dodajSamochod(Samochod samochod) {
        Optional<Samochod> foundSamochod = samochody.stream().filter(a -> a.getNrRejestracyjny()
                .equals(samochod.getNrRejestracyjny()))
                .findAny();
        if (!foundSamochod.isPresent()) {
            samochody.add(samochod);
        }
    }

    public void dodajRezerwacje(Rezerwacja rezerwacja) {
        Optional<Rezerwacja> foundRezerwacje = rezerwacje.stream()
                .filter(a -> a.getSamochod().equals(rezerwacja.getSamochod()))
                .filter(a ->
                        (a.getDataOd().getTime() > rezerwacja.getDataOd().getTime() &&
                                a.getDataDo().getTime() < rezerwacja.getDataDo().getTime()
                        ) || (a.getDataOd().getTime() <= rezerwacja.getDataOd().getTime() &&
                                a.getDataDo().getTime() >= rezerwacja.getDataOd().getTime()
                        ) || (a.getDataOd().getTime() <= rezerwacja.getDataDo().getTime() &&
                                a.getDataDo().getTime() >= rezerwacja.getDataDo().getTime()
                        )
                ).findAny();
        if (!foundRezerwacje.isPresent()) {
            rezerwacje.add(rezerwacja);
        } else {
            throw new IllegalStateException();
        }
    }
}
