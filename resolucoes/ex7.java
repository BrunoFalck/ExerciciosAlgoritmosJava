import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você deve votar.");
        } else if (idade >= 16) {
            System.out.println("Você pode votar.");
        }else {
            System.out.println("Você não pode votar.");
        }
    }
}