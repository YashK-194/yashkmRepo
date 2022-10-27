import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number n: ");
        int n = in.nextInt();

        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
