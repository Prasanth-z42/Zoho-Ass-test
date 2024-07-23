/**
 * Write a program to sort the elements in odd positions in descending order and elements in ascending order
 *
 * Input  - 13,2,4,15,12,10,5
 * Output - 13,2,12,10,5,15,4
 * Input  - 1,2,3,4,5,6,7,8,9
 * Output - 9,2,7,4,5,6,3,8,1
*/
import java.util.*;
class Main{
    public static int[] sort(int []even, int e){
        for(int i = 0; i<e; i++){
            for(int j = i+1; j<e; j++){
                if(even[i] > even[j]){
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }
        return even;
    }
    public static int[] desSort(int []odd, int o){
        for(int i = 0; i<o; i++){
            for(int j = i+1; j<o; j++){
                if(odd[i] < odd[j]){
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }
        return odd;
    }
    public static int[] sortTheElements(int []arr){
        int []odd = new int[100];
        int []even = new int[100];
        int o = 0, e = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }
        odd = desSort(odd,o);
        even = sort(even,e);
        int []merge = new int[e+o];
        int k = 0, i = o-1, j = e-1;
        while(i>=0 && j>=0){
            merge[k++] = even[j--];
        
            merge[k++] = odd[i--];            
        }
        while(i>=0)
            merge[k++] = odd[i--];
        while(j>=0)
            merge[k++] = even[j--];
        return merge;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements");
        for(int i = 0; i<size; i++)
            arr[i] = sc.nextInt();
        arr = sortTheElements(arr);
        for(int i : arr)
            System.out.print(i + " ");
    }
}