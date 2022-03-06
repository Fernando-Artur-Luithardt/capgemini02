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
                float lista= input.nextInt(); 
                entradaNumerica.add(lista);
                i++;
            }
            //LÓGICA
            float resultado = 0.0f;
            int posicaoNumero;
            if (entradaNumerica.size() %2 !=0) { //SE O TAMNNHO DO VETOR FOR IMPAR A MEDIANA É O NÚMERO CENTRAL
                posicaoNumero = ((entradaNumerica.size() - 1)/2);
                resultado = entradaNumerica.get(posicaoNumero);
            }else{  //SE O TAMNNHO DO VETOR FOR PAR A MEDIANA É OS DOIS NUMEROS CENTRAIS SOMADOS E DIVIDIDOS POR 2
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
        //LÓGICA
        int y;
        int resultado = 0;
        i = 0;
        while(i < vetor.size()) { //DOIS LAÇOS DE REPETIÇÃO PARA CADA NUMERO SER COMPARADO COM TODOS A SUA FRENTE
            y = i;                //y = i PARA QUE O LAÇO INTERNO INCIE A COMPARAÇÃO A PARTIR DA PRÓXIMA CASA DO VETOR CADA CICLO
            while(y < (vetor.size()-1)) {
                if ((vetor.get(i) - x) == vetor.get(y+1)){ //IF / ELSE IF PARA COMPARAR A DIFERENÇA ENTRE OS VALORES DO VETOR
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
        //LÓGICA
        //SE COMPRIMENTO DA STRING NÃO FOR EXATAMENTE DIVISIVEL PELA RAIZ SIGNIFICA QUE O NÚMERO DE LINHAS É O VALOR RAIZ + 1
        linhas = (int) raiz +1;
        if (length % raiz !=0) {
        } else {linhas = (int) raiz;}
        int caracter = 0;
        while (i < linhas){//PULA PARA LER A NOVA COLUNA A CADA CICLO
            while(j <= linhas){//FAZ O PRINT DOS CARACTERES DE CADA COLUNA              
                    caracter = (int) (j * raiz) + i; //SELECIONA OS CARACTERES QUE VÃO PARA TELA (j * raiz(SELECIONA OS CARACTERES DA LINHA))
                    //+i SELECIONA A COLUNA QUE OS CARACTERES VÃO SER PEGOS
                    if (caracter <= (entrada.length()-1)){//GARANTE QUE O NÚMERO DO CARACTER NÃO ULTRAPASSE O COMPRIMENTO DA STRING
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
