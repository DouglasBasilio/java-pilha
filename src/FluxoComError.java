public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("ini do metodo 2");
		metodo2();
		System.out.println("fim do metodo 2");
	}
}

//Existe uma outra hierarquia de classes que estende Throwable, como a classe Error. Entretanto, n�s n�o a conhecemos muito bem, porque � uma hierarquia pensada para desenvolvedores de m�quina virtual. N�s, desenvolvedores Java, n�o trabalhamos com essas classes diretamente. Quem cria e joga esses objetos na pilha � a m�quina virtual, quando algo muito grave acontece.
//A m�quina virtual pode n�o conseguir mais executar o c�digo porque n�o tem mais mem�ria o suficiente, e ent�o ela jogar� um erro internamente
