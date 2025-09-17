import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();
        if (numero1 == numero2){
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }
    }
}