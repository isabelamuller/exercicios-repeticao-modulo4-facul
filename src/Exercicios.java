import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    int x;

    public void contador() {
        x = sc.nextInt();
        for (; x <= 300; x++) {
            System.out.println(x);
        }
    }

    public void imprimePares() {
        x = sc.nextInt();
        if (x >= 0) {
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " é par");
                }
            }
        } else {
            System.out.println("Erro: número negativo");
        }
    }
}

