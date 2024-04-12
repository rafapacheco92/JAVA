import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos salários serão digitados: ");
        int quantos = scanner.nextInt();

        float[] salarios = new float[quantos];

        for (int i = 0; i < quantos; i++){
            System.out.print("Digite o " + (i + 1) + "º salário: ");
            salarios[i] = scanner.nextInt();
        }

        float maior = salarios[0];

        for (int i = 1; i < quantos; i++){
            if (salarios[i] > maior){
                maior = salarios[i];
            }
        }

        int somaAntes = 0;
        int somaDepois = 0;

        for (int i = 0; i < quantos; i++){
            somaAntes += salarios[i];
        }

        for (int i = 0; i < quantos; i++){
            if (salarios[i] < 2500){
                salarios[i] *= 1.1;
            }
        }

        for (int i = 0; i < quantos; i++){
            somaDepois += salarios[i];
        }


        System.out.print("O maior salário é " + maior);
        System.out.print("A soma dos salários antes do aumento é de " + somaAntes);
        System.out.print("A soma dos salários depois do aumento é de " + somaDepois);


    }
}

