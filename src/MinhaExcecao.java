
public class MinhaExcecao extends Exception {
	public MinhaExcecao(String msg) {
		super(msg);
	}
}

//Olhando a classe RuntimeException, notamos que ela possui o construtor 
//que recebe uma message. Ele chama o super e manda a mensagem para a classe m�e. 
//� uma boa pr�tica para n�o perder a mensagem.