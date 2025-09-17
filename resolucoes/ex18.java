import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário:");
        double salario = scanner.nextDouble();
        if(salario <= 2000){
            salario = salario * 1.1;
        }else if(salario <= 5000){
            salario = salario * 1.07;
        }else if(salario > 5000){
            salario = salario * 1.05;
        }
        System.out.println("Seu novo salário é R$" + salario);
    }
}
