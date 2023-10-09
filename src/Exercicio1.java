import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        System.out.println("Digite um número:"+"\n");
        Scanner scanner= new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Seu antecessor é "+ (number-1));
    }

}
