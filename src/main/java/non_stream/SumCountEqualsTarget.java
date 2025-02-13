package non_stream;

import java.util.stream.IntStream;

public class SumCountEqualsTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int targer=6;
/*
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targer){
                    System.out.print(i+","+j);
                }

            }
            System.out.println(" ");
        }*/
/*
        IntStream.range(0,arr.length)
                .forEach(i->IntStream.range(i+1,arr.length).
                        filter(j->arr[i]+arr[j]==6)
                        .forEach(j->System.out.println(i+","+j)));

 */

        for(int i=0;i<5;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
