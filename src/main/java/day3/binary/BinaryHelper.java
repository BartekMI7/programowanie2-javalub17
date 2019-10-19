package day3.binary;
/**
 * Rozważmy wszystkie ciągi binarne o pewnej długości,
 * które składają się tylko z zer i jedynek,
 * a w których żadne dwie jedynki nie stoją obok siebie.
 * <p>
 * To znaczy, że na przykład ciąg 110 nie jest takim ciągiem długości
 * 3 i nie będziemy go uwzględniać, natomiast ciąg 0101
 * jest takim ciągiem długości 4.
 *
 * @param start
 * @param end
 * @return
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryHelper {



    public List<String> converToBinary(int start, int end){
        List<Long> longList = new ArrayList<>();
        for (int i=start; i<=end;i++){
            longList.add((long)i);
            //lub
        }

        List<String> resultList = longList.stream()
                                        .map(a->Long.toBinaryString(a))
                                        .filter(b->!b.contains("11"))
                                        .collect(Collectors.toList());

        return resultList;
    }

    public List<String> concatZeros(List<String>  list, int n){
        list = list.stream()
                .filter(a -> a.length() <= n)
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
        return list;
    }





}
