import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        if(idade >= 16){
            System.out.println("Você já pode votar");
        }
        if(idade >= 18){
            System.out.println("Você já pode tirar carteira de motorista.");
        }
    }
}
