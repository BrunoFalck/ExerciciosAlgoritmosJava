import java.sql.SQLOutput;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota:");
        double nota = scanner.nextDouble();
        System.out.println("Digite a porcentagem de frequência do aluno: ");
        double frequencia = scanner.nextDouble();

        if(nota >= 7 && frequencia >= 75){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
