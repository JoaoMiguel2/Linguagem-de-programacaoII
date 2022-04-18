package calc;

import java.util.Scanner;

public class calcus {

	public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
       
        int Opcao = 0;
        double v1;
        double v2;
        double Resultado;
        while (Opcao != 5) {
            switch (Opcao) {
 

                case 1:

                    System.out.println("soma");
                    System.out.println("Digite o primeiro valor:");
                    v1 = op.nextDouble();
                    System.out.println("Digite segundo valor :");
                    v2 = op.nextDouble();
                    	Resultado = v1 + v2;
                    System.out.println("O Resultado é:\n " + Resultado);
                    break;
 

                case 2:
 

                    System.out.println("Subtração");
                    System.out.println("Entre com o primeiro valor:");
                    v1 = op.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    v2 = op.nextDouble();
                    	Resultado = v1 - v2;
                    System.out.println("O Resultado é:\n " + Resultado);
                    break;
 

                case 3:
 

                    System.out.println("Multiplicação");
                    System.out.println("Entre com o primeiro valor:");
                    v1 = op.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    v2 = op.nextDouble();
                    Resultado = v1 * v2;
                    System.out.println("O Resultado é:\n " + Resultado);
                    break;


                case 4:
 

                    System.out.println("Divisão");
                    System.out.println("Entre com o primeiro valor:");
                    v1 = op.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    v2 = op.nextDouble();
                    Resultado = v1 / v2;
                    System.out.println("O Resultado é:\n " + Resultado);
                    break;
 

                case 5:
 

                    break;
 //fim break

            }
 

            System.out.println("Calculadora");
            System.out.println("[1] - Soma");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Sair");
            System.out.println("Selecione o número que você quer ");
 

            Opcao = op.nextInt();
 

            
         
        }
 

    }
 



	}


