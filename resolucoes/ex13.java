import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segundaa nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        String situacao;

        if (media>=7){
            situacao = "aprovado.";
        } else if (media < 0){
            System.out.println("Erro.");
        } else if(media >= 5){
            situacao = "em recuperação.";
        }
        else{
            situacao = "reprovado.";
        }
        System.out.println("O aluno está " + situacao);
    }
}