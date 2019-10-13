package day2.tel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor


public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private String nrKierunkowy;
    private String nrTelefonu;


    @Override
    public int compareTo(NrTelefoniczny nrTelefoniczny) { // szybkie porownanie obkiektów
        //return this.nrKierunkowy.compareTo(nrTelefoniczny.nrKierunkowy);
        return this.nrKierunkowy.compareTo(nrTelefoniczny.nrTelefonu);
    }


}
