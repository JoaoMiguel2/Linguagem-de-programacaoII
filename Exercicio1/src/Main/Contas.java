package Main;

public class Contas {	
	
		public void  exercs1() {
	for(int jm = 0; jm <= (Main.receiveNumber -1); jm++) {
	Main.media += Main.vet[jm];
	}
	float aritmetic = (float)Main.media / Main.receiveNumber;
	System.out.println("A sua média aritmética é de: " +aritmetic);
	
		}
}

