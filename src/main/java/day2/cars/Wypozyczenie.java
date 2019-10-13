package day2.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor

public class Wypozyczenie {
    private Klient klient;
    private Samochod samochod;
    private Date dataOd;
    private Date dataDo;
}
