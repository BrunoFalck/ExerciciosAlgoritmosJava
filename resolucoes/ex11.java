import java.util.Scanner;
public class ex11
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        double n2 = scanner.nextInt();
        System.out.println("Digite outro número:");
        double n3 = scanner.nextInt();

        double menor = n1;
        if (n2 < n1){
            menor = n2;
            if (n3 < n2){
                menor = n3;
            }
        }else if (n3 < n1){
            menor = n3;
        }

        System.out.println("O menor número é " + menor);
	}
}