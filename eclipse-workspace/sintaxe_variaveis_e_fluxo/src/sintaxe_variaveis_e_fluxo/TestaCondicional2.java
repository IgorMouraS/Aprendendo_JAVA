package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		}
		else {
			System.out.println("infelizmente você não pode entrar");				
		}

	}

}
