import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1;
        int a;
        do {
            a = sc.nextInt();
            if (a > i){
                i = a;
            }
        } while (a != 0);
        System.out.println(i);
    }
}