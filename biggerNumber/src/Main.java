import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i + 1) + "º valor");
            valores[i] = scanner.nextInt();
        }

        int maior = valores[0];

        for (int i = 1; i < 10; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }
        }

        System.out.print(maior);

    }
}


