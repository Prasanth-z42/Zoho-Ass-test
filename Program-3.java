/**
 * Given a two dimensional array of string like where the first string is "child", second string is "Father", find the number of grandchildren for a given name.
 *
 *  {"Paari","Karikalan"}
 *  {"Udhiran","Sendhan"}
 *  {"Sendhan","Arulmozhi"}
 *  {"Karikalan","Sendhan"}
 *
 *  Input  - Arulmozhi
 *  Output - 2
 *  (Udhiran and Karikalan)
 */
import java.util.*;
public class FatherAndChild {
    public static int findGrandChildren(String [][]arr, String str){
        int count = 0;
        String s = "";
        for(int i = 0; i<arr.length; i++) {
            if (arr[i][1].equals(str)) {
                s = arr[i][0];
                break;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(s.equals(arr[i][1]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][]arr = {
                {"Paari","Karikalan"},
	{"Karikalan","Sendhan"},                
                {"Sendhan","Arulmozhi"},
                {"Udhiran","Sendhan"}
        };
        System.out.println("Enter Father name");
        String str = sc.next();
        int child  = findGrandChildren(arr,str);
        System.out.println(child);
    }
}
