package sensoresControle;

import java.util.Scanner;

public class ControleAcesso {

	public static void main(String[] args) {
		Lampada p1 = new Lampada();
		Scanner dados = new Scanner(System.in);
		int opcao = 1;
		boolean estadoInicial = true;
		int sensorPresenca;
		int sensorLuminosidade = 0;
		double sensorPeso;
		int sempresenca = 5;
		System.out.println("Estado inicial da lampada apagada");
		System.out.println(" movimento detectado no local: 1 para positivo . ");
		opcao = dados.nextInt();
		if (opcao == 1) {
			System.out.println(" analise  do  peso: \nqual peso?");
			sensorPeso = dados.nextDouble();
			if (sensorPeso <= 30) {
				System.out.println(" lampada Desligada");
			} else if (sensorPeso >30) {
				System.out.println("Ligar Lampada");
			}
			System.out.println("Ainda a presenca no local : 5 para sim 3 pra nao  ");
			sempresenca = dados.nextInt();
			if (sempresenca == 5) {
				System.out.println("ainda e o mesmo peso ? 5 pra sim 2 pra nao ");
				sensorPeso=dados.nextDouble();
				if(sensorPeso == 5 ){
					System.out.println("Manter ligado");
				}else if (sensorPeso==2){
					System.out.println("    Manter Apagada ");
				}
					
			} else {
				if (sensorPeso==3){
			}
				System.out.println("Desligar Lampada");
			}

			System.out.println("\n Escureceu ?\n 0 para  ja esta   escuro ");
			sensorLuminosidade = dados.nextInt();
			if (sensorLuminosidade == 0) {
				System.out.println("  Acender Lampada");
			} else {
				if (sensorLuminosidade != 0) {
					System.out.println("Lampada Apagada");
				}

			}
			
		}
		
	}
}