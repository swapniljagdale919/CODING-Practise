import java.util.*;

class Reverse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }

    // TODO: Implement this method
    static int reverseNum(int num) {

        // i = 10  ,, 0 =1
        // 876 -- 678

        // take given no in loop
        //extract last digit
        // make reverse number using that rev*10 + last digit
        //divide by 10 to original number
        int lastDigit = 1 , revNum=0;

        while(num > 0){
            lastDigit = num%10;
            revNum = revNum*10 + lastDigit;
            num/=10;
        }
        return revNum;
    }
}
