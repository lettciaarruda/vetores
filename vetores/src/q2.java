import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorFim[] = new double[11];
        double valorU[]  = new double[11];
        int quantidade[] = new int [11];
        int quantidadeFim[] = new int [11];
        int  fimV=1, fimQ=1;
        int i, maisVend=0;
        double soma =0, valorTot=0;

        System.out.println("LOJA DE ARTESANATO: ");



        for (i=1; i<11; i++) {
            System.out.println("Qual o valor do produto " + i + "?");
            valorU[i] = sc.nextDouble();

        }

        for (i=1; i<11; i++)  {

            valorFim[fimV] = valorU[i] ;
            fimV++;


        }




        for (i=1; i<11; i++) {
            System.out.println("Qual a quantidade do produto " + i + "?");
            quantidade[i] = sc.nextInt();

        }


        for (i=1; i<11; i++)  {

            quantidadeFim[fimQ] = quantidade[i] ;
            fimQ++;
        }



        System.out.println();
        System.out.println("Relat�rio: ");
        System.out.println();

        for ( fimV=1; fimV<11; fimV++) {
            System.out.println( "Valor do produto " +  (fimV) + " : " +   valorFim[fimV]);

        }

        System.out.println();

        for ( fimQ=1; fimQ<11; fimQ++) {
            System.out.println( "Quantidade do produto " +  fimQ + " vendidos: "+ quantidadeFim[fimQ]);


        }
        System.out.println();

        for (i=1; i<11; i++)  {
            soma = (quantidade[i] * valorU[i]);
            valorTot+=soma;
            System.out.println("Valor  total do produto " + i + ": " +  soma);
        }
        System.out.println();
        System.out.println("Valor total das vendas: " + valorTot);
        System.out.println("Valor da comiss�o do vendedor: " + (valorTot*0.05));

        for (i=1; i<11; i++)  {
            if(quantidade[i] > maisVend){
                maisVend = quantidade[i];
            }
        }

    }
}
