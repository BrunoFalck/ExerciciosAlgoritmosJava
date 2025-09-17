import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida do primeiro lado:");
        int l1 = scanner.nextInt();
        System.out.println("Digite a medida do segundo lado:");
        int l2 = scanner.nextInt();
        System.out.println("Digite a medida do terceiro lado:");
        int l3 = scanner.nextInt();
        boolean ehtriangulo = true;

        if(l1 + l2 < l3){
            ehtriangulo = false;
        }
        if(l3 + l2 < l1){
            ehtriangulo = false;
        }
        if(l1 + l3 < l2){
            ehtriangulo = false;
        }

        if(ehtriangulo == true){
            if(l1 == l2 && l1 == l3) {
                System.out.println("Você formou um triângulo equilátero");
            }else if(l1 == l2 || l2 == l3 || l1 == l3){
                System.out.println("Você formou um triângulo isósceles");
            }else{
                System.out.println("Você formou um triângulo escaleno");
            }
        }else{
            System.out.println("Lados com esses tamanhos não podem formar um triângulo.");
        }
    }
}
