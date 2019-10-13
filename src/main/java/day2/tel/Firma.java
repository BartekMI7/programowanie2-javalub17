package day2.tel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor

@ToString
public class Firma extends Wpis {
    private String nazwaFirmy;
    private String adres;
    private NrTelefoniczny nrTelefonu;

    public Firma() {
    }

    @Override
    public String opis() {
        return "dane kontaktowe firmy";
    }

}
