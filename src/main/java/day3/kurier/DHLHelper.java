package day3.kurier;

import java.util.List;
import java.util.Optional;

//generyk!!!!!!

public class DHLHelper<T extends DHLTypes>{
    public void add(List<T> list, T toADD){
        boolean exist = list.stream().filter(a->a.compareType(toADD))
                .findAny().isPresent();
        if (!exist){
            list.add(toADD);
        }
    }

    public void remove(List<T> list , T toRemove) {
        Optional<T> exist = list.stream()
                .filter(a -> a.compareType(toRemove)).findAny();
        if (!exist.isPresent()) {
            throw new IllegalArgumentException();
        } else {
            list.remove(exist.get());
        }
    }


}
