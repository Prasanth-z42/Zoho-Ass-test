import java.util.*;
public class Program2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number (4 digit)");
        n = sc.nextInt();

        if (n < 0 || n > 9999)
            System.out.println("Wrong Number...");
        else {
            int one = n % 10; //last digit  or one digit
            int tt = n / 10;
            int ten = tt % 10;  //second last digit or ten digit
            int hun = n / 100; //first digit or a hundred digit
            int hh = hun % 10;  //hundred digit
            int tou = n / 1000; //a thousand digit
            String one_s[] = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String ten_s[] = {" ", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String hun_s = " Hundred ";
            String tousand = "thousand";

            if (n < 20)
                System.out.println(one_s[n]);
            else if (n < 100)
                System.out.println(ten_s[ten] + " " + one_s[one]);
            else if (n > 100 && n < 1000)
                System.out.println(one_s[hun] + hun_s + ten_s[ten] + " " + one_s[one]);
            else if (n == 1000 || n == 2000 || n == 3000 || n == 4000 || n == 5000 || n == 6000 || n == 7000 || n == 8000 || n == 9000)
                System.out.println(one_s[tou] + " " + tousand);
            else if (ten == 0 && hun % 10 == 0)
                System.out.println(one_s[tou] + " " + tousand + " and " + one_s[one]);
            else if(hun % 10 == 0 && n>1000)
                System.out.println(one_s[tou] + " "+tousand +" "+ ten_s[ten] + " "+one_s[one]);
            else
                System.out.println(one_s[tou] + " " + tousand + " " + one_s[hh] + hun_s + ten_s[ten] + " " + one_s[one]);
        }
    }
}