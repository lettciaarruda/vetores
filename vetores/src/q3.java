import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int vetor[] = new int [10];
        int soma=0, quant=0, maior=0, menor=0, i;
        double media=0;


        System.out.println("Digite 10 numeros inteiros: ");


        for (i=0; i<10; i++) {
            quant++;
            System.out.println("Numero " + i + ":");
            vetor[i] = sc.nextInt();
            soma = soma +vetor[i];



            media= soma/quant;

            if(vetor[i] > maior) {
                maior = vetor[i];
            }
            else if (vetor[i] < menor) {
                menor = vetor[i];

            }


        }
        System.out.println("A soma de todos os numeros �: " + soma);
        System.out.println("A m�dia dos valores �: " + media);
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);


    }
}