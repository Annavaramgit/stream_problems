package non_stream;

import lombok.extern.slf4j.Slf4j;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

@Slf4j
public class OnesPutFirstInArray {


    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 1};
/*
        int temp;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==0 && arr[j]==1){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
      Arrays.stream(arr).forEach(System.out::print);
*/

        //Arrays.stream(arr).boxed().sorted((i1,i2)->i2-i1).forEach(System.out::print);
    }
}
