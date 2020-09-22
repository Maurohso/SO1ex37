package view;
import java.util.concurrent.Semaphore;

import controller.ThreadCruzamento;

public class Main {

	public static void main(String[] args) {
		int permissoes  = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int idCarro = 1; idCarro <= 4; idCarro++) {
			Thread tCruzamento = new ThreadCruzamento(idCarro,semaforo);
			tCruzamento.start();			
		}

	}

}
