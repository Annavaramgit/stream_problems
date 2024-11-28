package streams.practice.series1;

public class FrequentNumbersPrintInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            count++;
            i = i+count;
        }

    }
}
