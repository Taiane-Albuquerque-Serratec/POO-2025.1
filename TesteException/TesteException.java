package TesteException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException {

	public static void main(String[] args) {
		try {
			System.out.println("Resultado:" + divisao(10, 2));
			System.out.println("Passou aqui");
			FileReader fileReader1 = new FileReader("c:\temp\teste");

		} catch (ArithmeticException erro ) {
			System.out.println("Impossível dividir por zero");
			erro.printStackTrace();
			
		} catch (FileNotFoundException erro) {
			System.out.println("Arquivo não encontrado!");
		}

		finally {
			System.out.println("Finalizando o programa!");
		}
	}

	public static int divisao(int a, int b) throws ArithmeticException {
//		if (b == 0) {
//			throw new ArithmeticException("Impossível dividir por zero");
//		}
//		return a / b;
		return a / b;

	}
}
