import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num = scanner.nextDouble();
        if(num = 0){
            System.out.println("Seu número é 0.");
        }
        if(num > 0){
            System.out.println("Seu número é positivo.");
        }
        if(num < 0){
            System.out.println("Seu número é negativo.");
        }
    }
}
