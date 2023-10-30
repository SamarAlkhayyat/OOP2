package pkg;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter 2 integers: ");
        int x, y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        System.out.println("What operation do you want to perform?\nFor + enter: 1\nFor - enter: 2\nFor * enter: 3\nFor / enter: 4");
        int o;
        o = input.nextInt();
        switch(o){
            case 1:
                System.out.println("x+y="+(x+y));
                break;
            case 2:
                System.out.println("x-y="+(x-y));
                break;
            case 3:
                System.out.println("x*y="+(x*y));
                break;
            case 4:
                System.out.println("x/y="+(x/y));
                break;
        }
    }
}
