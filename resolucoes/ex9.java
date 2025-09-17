import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a velocidade do carro em km/h? ");
        int velocidade = scanner.nextInt();
        if (velocidade > 80) {
            System.out.println("Multado! ");
        } else if (velocidade < 0) {
            System.out.println("Velocidade inválida.");
        } else {
            System.out.println("Dentro do limite de velocidade.");
        }
}
}