import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        String categoria;
        if(idade >= 60){
            categoria = "Sênior";
        } else if(idade >= 18){
            categoria = "Adulto";
        } else if(idade >=13){
            categoria = "Juvenil";
        } else {
            categoria = "Infantil";
        }

        if(idade <= 0){
            categoria = "Idade inválida!";
        }

        if (categoria != "Idade inválida!"){
            System.out.println("Você é da categoria " + categoria);
        } else{
            System.out.println(categoria);
        }
    }
}

