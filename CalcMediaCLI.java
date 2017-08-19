/* ARQUIVO ('PRINCIPAL'): CalcMediaCLI.java  
 *
 *  IFPB - CAMPUS PICUÍ.
 *  PROGRAMAÇÃO. Turma: POO e EDADOS. 2017.1
 *  Prof.: Me. Sergio ESPINOLA. http://mestre.sergiodbe.net/IFPB  
 *  Objetivo: Este programa CALCULA A MÉDIA das Notas Repassadas via linha de!
 *     			comando (CLI)
 *  Data: 2/6/2017.
 */
package net.sergiodbe.mestre.poo;



// A linha seguinte simplifica escrita do System.out.println()
import static java.lang.System.*;


/* @author sergiodbe @POO/IFPB 
   Programa para exibir a média dos n argumentos passados -- via linha de comando! */

public class CalcMediaCLI{
	public static void main(String[] argums) {
		out.println("Olá!");
		int numArgums = argums.length;
		if (numArgums!=0){
		   out.println(" lido(s): " + numArgums + " argumento(s)!");		
		   double soma=0, media=0;
		   for (int c=0; c<numArgums;c++) {
		      // conversao de STRING para double
		      double valorConvert = Double.parseDouble(argums[c]);
	              soma=soma+valorConvert;
		   } //fim For
		   media=soma/numArgums;
		   out.println("Media dos valores lidos foi: " + media);
		} else out.println("Nada a ser feito. :D Requer um ou mais argumentos!");	
} //fim main()
} //fim classe



