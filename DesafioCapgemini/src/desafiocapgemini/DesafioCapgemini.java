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
            System.out.print("\nSTRING: "+entradaNumerica + "\n");
            System.out.print("A MEDIANA DA STRING É: " + resultado + "\n\n");
            main(null);
    }
    static void desafio02() {
        System.out.print("ENTRE COM O NÚMERO DE CASAS A DO VETOR: ");
        Scanner input = new Scanner(System.in);
        int casasVetor = input.nextInt();
        ArrayList<Float> vetor = new ArrayList<>();
        int i = 1;
        while (i <= casasVetor) {
                System.out.print("ENTRE COM O " + i + "° NÚMERO: ");
                float lista= input.nextInt();
                vetor.add(lista);
                i++;
            }
        System.out.print("\nENTRE COM 'X' (diferença entre as casas do vetor): ");
        int x = input.nextInt();
        i = 0;
        int y = 0;
        float resultado = 0.0f;
        while(i < vetor.size()) {
            y = i;
            while(y < (vetor.size()-1)) {
                if ((vetor.get(i) - x) == vetor.get(y+1)){
                resultado++;                
                }else if ((vetor.get(i) + x) == vetor.get(y+1)){
                resultado++;
                }
            y++;
            }
            i++;
        }
        System.out.print("\nSTRING: "+ vetor + "\n");
        System.out.print("RESULTADO:"+resultado+"\n");
        main(null);
        
    }
    static void desafio03() {
        System.out.print("ENTRE COM UMA FRASE PARA SER DECODIFICADA:\n");
        Scanner input = new Scanner(System.in);
        var entrada = input.nextLine();
        entrada = entrada.replaceAll(" ", "");
        int length = entrada.length();
        float raiz = Math.round(Math.sqrt(length));
        int i = 0;
        int j = 0;
        int linhas = 0;
        
        System.out.print("\n RESPOSTA: ");
        if (length % raiz !=0) {
            linhas = (int) raiz +1;
        } else {linhas = (int) raiz;}
        int caracter = 0;
        while (i < linhas){
            while(j <= linhas){               
                    caracter = (int) (j * raiz) + i;
                    if (caracter <= (entrada.length()-1)){
                        System.out.print(entrada.charAt(caracter));
                    } else{
                        break;
                    }
                j++;
            }
            j = 0;
            System.out.print(" ");        
            i++;
        }
        System.out.print("\n\n");
        main(null);
    }
    public static void main(String[] args) {
        System.out.print("ESCOLHA ENTRE: \n [1] DESAFIO 01\n [2] DESAFIO 02\n [3] DESAFIO 03\n [4] SAIR  \n");
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        switch (escolha){
            case 1: desafio01();
            case 2: desafio02();
            case 3: desafio03();    
            case 4: System.exit(0);
            default: main(null);
        }
                       
    }        
}
