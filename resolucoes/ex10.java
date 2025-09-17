import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        double n2 = scanner.nextInt();
        System.out.println("Digite outro número:");
        double n3 = scanner.nextInt();

        double maior = n1;
        if (n2 > n1){
            maior = n2;
            if (n3 > n2){
                maior = n3;
            }
        }else if (n3 > n1){
            maior = n3;
        }

        System.out.println("O maior número é " + maior);
    }
}