import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        System.out.println("Digite a base do retângulo:\n");
        Scanner scanner= new Scanner(System.in);
        double base= Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a altura do retângulo:\n");
        double altura= Double.parseDouble(scanner.nextLine());
        double area= altura*base;
        System.out.println("A área é igual a = "+area);
    }
}
