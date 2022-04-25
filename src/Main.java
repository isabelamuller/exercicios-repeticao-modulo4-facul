import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicios exercicio1 = new Exercicios();
        System.out.println("1. conta até 300\n" + "2. imprime pares\n" + "3. sair");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Escreva um número de 1 a 300");
                exercicio1.contador();
                break;
            case 2:
                System.out.println("Escreva um número de 1 a 100");
                exercicio1.imprimePares();
                break;
            case 3:
                System.out.println("Esperamos ver você mais vezes!");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
