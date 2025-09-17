import java.util.Scanner;

public class ex12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n3 = scanner.nextInt();
        int[] numeros = {n1, n2, n3};
        int temporario;

        for(int i = 0; i < numeros.length; i++){
            for(int j = i+1; j < numeros.length; j++){
                if(numeros[j] < numeros[i]){
                temporario = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temporario;
                }
            }
        }

        for(int i = 0; i <= numeros.length; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}