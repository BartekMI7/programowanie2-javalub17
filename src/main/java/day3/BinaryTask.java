package day3;

/*
Wejście

Pierwsza linia wejścia zawiera liczbę całkowitą D (1 ≤ D ≤ 500), która określa liczbę zestawów danych.
Druga linia składa się z dwóch dodatnich liczb całkowitych N oraz K (0 < N < 44, 0 < K < 1000000000),
 oznacających odpowiednio długość rozpatrywanych ciągów binarnych oraz miejsce w porządku leksykograﬁcznym poszukiwanego ciągu.
Wyjście

Dla każdego zestawu danych program powinien wypisywać w osobnej linii odnaleziony ciąg albo liczbę −1,
jeśli liczba K jest większa niż liczba opisanych ciągów.
Przykład

Wejście:

3
31
32
3599

Wyjście:

000
001
-1
 */

import java.util.List;
import java.util.stream.Collectors;

public class BinaryTask {
    public void resulTask(int d, int n, int k) {
        BinaryHelper binaryHelper = new BinaryHelper();
        //for (int i = 0; i < d; i++) {
            List<String> list = binaryHelper.converToBinary(0, d);
            list = list.stream()
                    .filter(a -> a.length() >= n)
                    .map(v->{
                        int nrOfZeros = n-v.length();
                        if (nrOfZeros>0){
                            for (int i=0; i<nrOfZeros;i++){
                                v="0"+v;
                            }
                        }
                        return v;
                    })
                    .collect(Collectors.toList());
            if (list.size() >= k) {

                System.out.println(list.get(k));
            }
            else {
                System.out.println("-1");
            }

        //}
    }
}