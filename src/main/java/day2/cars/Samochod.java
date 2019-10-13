package day2.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Samochod {
    private String model;
    private String nrRejestracyjny;
    private int rokProdukcji;
    private long przebieg;
}
