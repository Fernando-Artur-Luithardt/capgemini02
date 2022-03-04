package desafiocapgemini;

import java.util.Scanner;
import java.util.ArrayList;

public class DesafioCapgemini {
    static void desafio01() {
        System.out.print("ENTRE COM O NÚMERO DE CASAS A SEREM ANALISADAS: ");
            Scanner input = new Scanner(System.in);
            int casasString= input.nextInt();
            ArrayList<Float> entradaNumerica = new ArrayList<>();
            int i = 1;
            while (i <= casasString) {
                System.out.print("ENTRE COM O " + i + "° NÚMERO: ");
                float lista= input.nextInt(); //adicionar um if(input = null){print("necessário entrar com um número, podendo ser 0")} se input for nulo
                entradaNumerica.add(lista);
                i++;
            }
            float resultado = 0.0f;
            int posicaoNumero;
            if (entradaNumerica.size() %2 !=0) {
                posicaoNumero = ((entradaNumerica.size() - 1)/2);
                resultado = entradaNumerica.get(posicaoNumero);
            }else{
                posicaoNumero = ((entradaNumerica.size())/2);
                resultado = ((entradaNumerica.get(posicaoNumero))+(entradaNumerica.get(posicaoNumero-1)))/2;
            }
            System.out.print("\nA MEDIANA DA STRING É: " + resultado + "\n\n");
            main(null);
    }

    public static void main(String[] args) {
        System.out.print("ESCOLHA ENTRE: \n [1] DESAFIO 01\n [2] DESAFIO 02\n [3] DESAFIO 03\n [4] SAIR  \n");
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        switch (escolha){
            case 1: desafio01();
                
            case 4: break;
            default: main(null);
        }
                       
    }        
}
