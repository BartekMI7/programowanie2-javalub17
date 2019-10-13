package day2.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor

public class Rezerwacja {
    private Klient klient;
    private Samochod samochod;
    private Date dataOd;
    private Date dataDo;
}
