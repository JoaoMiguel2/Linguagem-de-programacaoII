package Main;


import java.util.Scanner;

public class Main {
	public static int vet[];
	public static int receiveNumber;
	public static int media;
	public static void main(String[] args) {

		int valueOne, valueTwo;
		
		Scanner SizeArray = new Scanner(System.in);
		System.out.println("Coloque o seu número por favor?");
		receiveNumber = SizeArray.nextInt();
		
		int positionVet;
		
		int vet[] = new int[receiveNumber];
		for(int i=0; i<= (receiveNumber -1); i++) {
			System.out.println("Digite o número que você desejar:");
			positionVet = SizeArray.nextInt();
			vet[i] = positionVet;
			break;
		}
	

	int media = 0;
	for(int jm = 0; jm <= (receiveNumber -1); jm++) {
		media += vet[jm];
			}
	float aritmetic = (float)media / receiveNumber;
	System.out.println("A sua média aritmética é de: "  +aritmetic);
	
	
	
	
	
	}
}
