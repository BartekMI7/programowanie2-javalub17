package day2.tel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Osoba extends Wpis {
    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny nrTelefonu;

    public Osoba() {
    }

    @Override
    public String opis() {
        return "dane kontaktowe osoby nie bedacej firmą";
    }
}
