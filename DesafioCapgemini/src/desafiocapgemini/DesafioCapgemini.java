package desafiocapgemini;

import java.util.Scanner;
import java.util.ArrayList;

public class DesafioCapgemini {

    public static void main(String[] args) {
        System.out.print("Entre com o número de casas a serem analisadas: ");
        Scanner input = new Scanner(System.in);
        int casasString= input.nextInt();
        ArrayList<Float> entradaNumerica = new ArrayList<>();
        int i = 1;
        while (i <= casasString) {
            System.out.print("entra com o " + i + " numero: ");
            float lista= input.nextInt(); //adicionar um if(input = null){print("necessário entrar com um número, podendo ser 0")} se input for nulo
            entradaNumerica.add(lista);
            i++;
        }
        
    }
    
}
