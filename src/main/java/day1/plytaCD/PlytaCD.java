package day1.plytaCD;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter


public class PlytaCD {
    private String title;
    private String year;
    private List<Utwor> utwory = new ArrayList<>();

    // wyszukiwanie na streamie
    public Utwor search(String query) {
        //dwie czesci wyarazaniea lamdba: argument i cos co musi zajsc / pod literka "a" pojedynczy utwor
        return utwory.stream().filter(a -> a.getTitle().equals(query))
                .findAny().orElse(null);
    }

    // wyszukiwanie standardowe w petli
    public Utwor search2(String query) {
        for (Utwor utwor : utwory) {
            if (utwor.getTitle().equals(query)) {
                return utwor;
            }
        }
        return null;
    }

    public String toString() {
        List<String> listaUtworow = utwory.stream().map(a -> a.toString()).collect(Collectors.toList());
        //String tmp = "";

        //for (String value : listaUtworow){
        //  tmp+=value+"\n";
        //}
        //listaUtworow.forEach(a->tmp+= ""+"\n") - nie da rady w ten sposob
        String result = listaUtworow.stream()
                .reduce("", (tmp, a) -> tmp += "\n" + a);


        return title + " " + year + " " + result;
    }
}
