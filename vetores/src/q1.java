import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int  i, fim=0;
        int  v1[] = new int[10];
        int  v2[] = new int[10];
        int  v3[] = new int[20];

        System.out.println("preencha dois vetores de dez números cada: ");
        System.out.println("vetor 1: ");



        for ( i=0; i<10; i++) {
            System.out.println(i + ":");
            v1[i]= sc.nextInt();

        }

        System.out.println();
        System.out.println("vetor 2: ");
        System.out.println();

        for (  i=0; i<10; i++) {
            System.out.println(i + ":");
            v2[i]= sc.nextInt();

        }

        for ( i=0; i<10; i++) {
            v3[fim] = v1[i];
            fim++;
            v3[fim] = v2[i];
            fim++;
        }

        System.out.println("resultado intercalado: ");
        for (fim=0; fim<20; fim++) {
            System.out.println(v3[fim]);
        }


    }

}