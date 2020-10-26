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

//Existe uma outra hierarquia de classes que estende Throwable, como a classe Error. Entretanto, nós não a conhecemos muito bem, porque é uma hierarquia pensada para desenvolvedores de máquina virtual. Nós, desenvolvedores Java, não trabalhamos com essas classes diretamente. Quem cria e joga esses objetos na pilha é a máquina virtual, quando algo muito grave acontece.
//A máquina virtual pode não conseguir mais executar o código porque não tem mais memória o suficiente, e então ela jogará um erro internamente
