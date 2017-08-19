/* ARQUIVO ('PRINCIPAL'): POOAplicativos.java  
 *
 *  IFPB - CAMPUS PICUÍ.
 *  PROGRAMAÇÃO. Turma: POO. 2017.1
 *  Prof.: Me. Sergio ESPINOLA. http://mestre.sergiodbe.net/IFPB  
 *  Objetivo: Este programa é MENU (CLI) com várias opções de java estruturado (CoreJava)!
 *   
 *  Data: 2/6/2017.
 */

package net.sergiodbe.mestre.poo;

/**
 *
 * @author Me. Sérgio ESPINOLA <http://mestre.sergiodbe.net/IFPB>
 */


import java.util.Scanner;



// linha seguinte simplifica a escrita do System.out.println();
import static java.lang.System.*;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


/**
 * Created by sergiodbe on 12/06/17.
 */

public class POOAplicativos {

    public static void main(String[] args) {
        int opcao;

        out.println("-------------------------------------");
        out.println("| >> IFPB-PC MENU                   |");
        out.println("| Opções para programas:            |");
        out.println("|        1. Soma 2 nums             |");
        out.println("|        2. Multiplica 2 nums       |");
        out.println("|        3. Calc Media N notas      |");
        out.println("|        4. Exibir N Termos         |");
        out.println("|                      Soma de P.A. |");  
        out.println("|        5. Exibir                  |");
        out.println("|                              P.G. |");         
        out.println("|        6. Verificar se Primo      |");
        out.println("|        7. SOMA DE MATRIZES(C=A+B) |");
        out.println("|        8. Multip. MATRIZES(C=A+B) |");

        out.println("|        9. Estruturas de Repetição |");
        out.println("|            (Resumo): FOR, WHILE e |");
        out.println("|             DO ... While          |");
        out.println("|        10. Sair                    |");
        out.println("-------------------------------------");
        out.println(" Selecionar opção: ");

        Scanner objApontador = new Scanner(in);
        opcao = objApontador.nextInt();

        int a, r, n = 1, t, b;

        switch (opcao) {
            case 1:
                out.println("Selecionada OP#1 SOMA");
                out.println(" Digitar, favor, dois números (seguidos de <enter>)");
                int n1 = objApontador.nextInt();
                int n2 = objApontador.nextInt();
                int soma = n1 + n2;
                out.println( ">> SOMA foi " + soma);

                break;
            case 2:
                out.println("Selecionada OP#2 MULTIPLICACAO");
                out.println(" Digitar, favor, dois números (seguidos de <enter>)");
                n1 = objApontador.nextInt();
                n2 = objApontador.nextInt();
                int mult = n1 * n2;
                out.println( ">> MULT. foi " + mult);

                break;
            case 3:
                out.println("Selecionada OP#3: CALC  media, 'N', notas");
                out.println(" Digitar, favor, NUM DE MÉDIAS");

                int numNotas = objApontador.nextInt();
                out.println( ">> INFORMAR AS  " + numNotas);
                double media=0, somaMedia=0;
                
                
                for (int i = 1; i <= numNotas; i++) {
                    out.println(" Digitar nota: " + i);
                    double cadaNota = objApontador.nextDouble();
                    somaMedia+=cadaNota;
                }
                media=somaMedia/numNotas;
                
                out.println( ">> MEDIA FOI " + media);
                out.println( ">>   SITUACAO ");
                
                if (media >= 7) {
                    out.println( " APROVADA");
                } else {
                   out.println( "  RECUPERAÇÃO");
                }
                
                break;
                
                
            case 4:
                double somaPA=0;
      
                out.println("Selecionada OP#4");
                out.println(" Digitar o primeiro termo da P.A.");
                soma=0;
                a=objApontador.nextInt();
                System.out.println(" Entrar com a razao");
                r=objApontador.nextInt();
                System.out.println(" Entrar com o número de termos");
                b=objApontador.nextInt();

                out.println( ">> PROGRESSÃO ARITMÉTICA");
                
                // ITERACAO (Controlada via expressao 'b != n-1')
                while(b != n-1) {
                    t=(a+(n-1)*r);
                    n++;
                    somaPA+=t;
                    out.print(t + " ");
                }
                out.println();
                out.println(" Soma PA: " + somaPA);
                
                break;

            case 5:
              out.println();
              out.println("Selecionada OP #5");

              double PG=0;
                int term, base, num;
                // EXEMPLO 
                //TODO MELHORAR para ALUNOS! :D
                term=3; 
                base=8; 
                num=4;
                n=n-1;
                PG = term * (Math.pow(base,num));
            
                out.println("Progressão Geométrica eh:" + PG);
   
                
                break;    
                
                
            case 6:
                //USANDO ORIENTACAO A OBJETOS! 
                // CLASSE Definida internamente (PARALELA a que contem main()).
                UtilitariaPrimo utP = new UtilitariaPrimo();
                               
                out.println("Selecionada OP #6");
                out.println(" Informar um número para inspeção se primo!");

                int numTestado = objApontador.nextInt();
                System.out.println(" Resultado: " + utP.ehPrimo(numTestado));
                
                 break;    
                

            
            case 7:
                out.println("Selecionada OP #7");
                out.println("** OPERAÇÕES COM MATRIZES **");
                
                out.println("Informar número de linhas: ");
         
                int linhas = objApontador.nextInt();
         
                out.println("Informar número de colunas: ");
         
                int cols = objApontador.nextInt();         

                // VETORES HOMOGÊNEOS - BIDIMENSIONAIS!
                //  TIPO [] [] varExemplo = new TIPO[tam1][tam2]
                
                int[][] matriz1 = new int[linhas][cols];
      
                int[][] matriz2 = new int[linhas][cols];
         
                int[][] somaMatrizes = new int[linhas][cols];
         
                out.println("\n> Informar os elementos da MAT. A :");
         
                for (int i = 0; i < linhas; i++){
                    for (int j = 0; j < cols; j++){
                        int l = i+1;
                        int c = j+1;
                        out.println("Elemento[linha=" + l + " , col=" + c + "]:");
                        matriz1[i][j] = objApontador.nextInt();
                    } //fim For interno (j)
                } //fim For Externo (i)
         
                out.println("\n> Informar os elementos da MAT. B :");
         
                for (int i = 0; i < linhas; i++){
                    for (int j = 0; j < cols; j++){
                        int l = i+1;
                        int c = j+1;
                        out.println("Elemento[linha=" + l + " , col=" + c + "]:");
                        matriz2[i][j] = objApontador.nextInt();
                    } //fim For interno (j)
                } //fim For Externo (i)
                
                out.println("\n** Primeira Matriz = ");
         
                for (int i = 0; i < linhas; i++) {
                   for (int j = 0; j < cols; j++) {
                        out.print(matriz1[i][j]+"\t");
                   } //fim For interno (j)
                    out.println();
                } //fim For Externo (i)
         
                out.println("\n** Segunda Matriz = ");
                  
                for (int i = 0; i < linhas; i++) {
                   for (int j = 0; j < cols; j++) {
                        out.print(matriz2[i][j]+"\t");
                   } //fim For interno (j)
                    out.println();
                } //fim For Externo (i)
                
                out.println("\n** Soma = ");
         
                for (int i = 0; i < linhas; i++) {
                    for (int j = 0; j < cols; j++)  {
                        somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j]; 
                        out.print(somaMatrizes[i][j]+"\t");
                    } //fim For interno (j)
                    out.println();
                } //fim For Externo (i)               
                break;
                
            case 8:
                out.println("Selecionada OP #8");
                out.println("** MULT. MATRIZES **");
                
                out.println("Informar número de linhas(Matriz A): ");
         
                int aLinhas = objApontador.nextInt();
         
                out.println("Informar número de colunas(Matriz A): ");
         
                int aCols = objApontador.nextInt();

                // VETORES HOMOGÊNEOS - BIDIMENSIONAIS!
                //  TIPO [] [] varExemplo = new TIPO[tam1][tam2]
                
                int[][] matrizA = new int[aLinhas][aCols];

                out.println("Informar número de linhas(Matriz B): ");       
                int bLinhas = objApontador.nextInt();
         
                out.println("Informar número de colunas(Matriz B): ");      
                int bCols = objApontador.nextInt();
                int[][] matrizB = new int[bLinhas][bCols];
         
                int[][] matrizC;
                
                if (aCols != bLinhas) {
                
                                    out.println("Matrizes não compatíveis!");      
                                    break;
                
                } 
                else { // MATRIZES A e B Compatíveis! Nova será MatrizC!
                    
                    matrizC = new int[aLinhas][bCols];
         
                    // LEITURA DAS MATRIZES
                    out.println("\n> Informar os elementos da MAT. A :");
         
                    for (int i = 0; i < aLinhas; i++){
                      for (int j = 0; j < aCols; j++){
                        int l = i+1;
                        int c = j+1;
                        out.println("Elemento[linha=" + l + " , col=" + c + "]:");
                        matrizA[i][j] = objApontador.nextInt();
                      } //fim For interno (j)
                    } //fim For Externo (i)
         
                    out.println("\n> Informar os elementos da MAT. B :");
         
                    for (int i = 0; i < bLinhas; i++){
                        for (int j = 0; j < bCols; j++){
                            int l = i+1;
                            int c = j+1;
                            out.println("Elemento[linha=" + l + " , col=" + c + "]:");
                            matrizB[i][j] = objApontador.nextInt();
                        } //fim For interno (j)
                    } //fim For Externo (i)

                    // ESCRITA DE MATRIZES
                    out.println("\n**  Matriz A = ");
         
                    for (int i = 0; i < bLinhas; i++) {
                        for (int j = 0; j < bCols; j++) {
                            out.print(matrizA[i][j]+"\t");
                        } //fim For interno (j)
                        out.println();
                    } //fim For Externo (i)
         
                    out.println("\n** Matriz B = ");      
                    for (int i = 0; i < bLinhas; i++) {
                       for (int j = 0; j < bCols; j++) {
                            out.print(matrizB[i][j]+"\t");
                        } //fim For interno (j)
                        out.println();
                    } //fim For Externo (i)
                
                    out.println("\n** M U L T I P L I C A Ç Ã O ** ");                    

                    for (int i = 0; i < aLinhas; i++) {
                       for (int j = 0; j < bCols; j++) {
                           int somaElemento = 0;
                           // k acumula a 
                           for (int k = 0; k < bCols; k++) {
                               somaElemento+= ( matrizA[i][k] * matrizB[k][j] );
                            } //k
                            matrizC[i][j]=somaElemento;
                       }//j
                    }//i
        
                    out.println("\n** Matriz C = ");      
                    for (int i = 0; i < bLinhas; i++) {
                       for (int j = 0; j < bCols; j++) {
                            out.print(matrizC[i][j]+"\t");
                        } //fim For interno (j)
                        out.println();
                    } //fim For Externo (i)
            }        
                
               break;
            case 9:
                out.println("Selecionada OP #9");
                out.println("** ESTRUTURAS DE REPETIÇÃO **");
                out.println("** FOR, WHILE ... e Do...While (repita) **");

                out.println("*** Ex1. WHILE **");

                int x = 100;
                do { // início While
                    out.print("valor de x : " + x);
                    x++;
                    out.print("\n");
                } while( x < 100 );
                
                break;
            case 10:
                out.println("Opção Sair Selecionada");
                break;
            
            default:
                out.println("Seleção Inválida");
                break; // Esta parte é opcional
        } //switch
    } //main
    
    
     public static String ehPrimoInterna(int x) {
        boolean condPrimo = false;
        String resultado = "Indeterminado!";

        // Numeros inteiros positivos começa em 1.
        int numDeDivisores = 1;
        // Candidato a divisor (não trivial) eh o 2. 
        int candDivisor = 2;
        // Testa a divisão por todos os números menores ou iguais a x.
        while ( candDivisor <= x) {
            if (x % candDivisor == 0) 
                    numDeDivisores += 1;
            candDivisor += 1; 
        } //fimWhile
    
        if (numDeDivisores == 2)
            condPrimo = TRUE;
        else condPrimo = FALSE;
        
        if (condPrimo)
            resultado = "Eh Primo!";
        else resultado = "Não eh Primo!";
                
        return resultado; 
    
    } //fim EhPrimo()

    
    

} //fim_Classe Principal POOAplicativos. 



/*
* ESTA CLASSE É PARALELA à definição da classe principal! 
*  PODE SER USADA DENTRO do método main(). 
*/

class UtilitariaPrimo {
    
/* Verificar se número eh Primo! */
    String ehPrimo(int x) {
        boolean condPrimo = false;
        String resultado = "Indeterminado!";

        // Numeros inteiros positivos começa em 1.
        int numDeDivisores = 1;
        // Candidato a divisor (não trivial) eh o 2. 
        int candDivisor = 2;
        // Testa a divisão por todos os números menores ou iguais a x.
        while ( candDivisor <= x) {
            if (x % candDivisor == 0) 
                    numDeDivisores += 1;
            candDivisor += 1; 
        } //fimWhile
    
        if (numDeDivisores == 2) {
            condPrimo = TRUE;            
        }
        else { condPrimo = FALSE;  
        
        }
        
        if (condPrimo)
            resultado = "Eh Primo!";
        else resultado = "Não eh Primo!";
                
        return resultado; 
    
    } //fim EhPrimo()
} //fim Classe UtilitariaPrimo
