import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        int preco = scanner.nextInt();
        if (preco > 100) {
            System.out.println("O produto está caro.");
        } else if (preco < 0) {
            System.out.println("Preço inválido.");
        } else {
            System.out.println("O produto está barato.");
        }
    }
}