
public class MinhaExcecao extends Exception {
	public MinhaExcecao(String msg) {
		super(msg);
	}
}

//Olhando a classe RuntimeException, notamos que ela possui o construtor 
//que recebe uma message. Ele chama o super e manda a mensagem para a classe mãe. 
//É uma boa prática para não perder a mensagem.