package view;

public class Cadastro {
	public static void main(String args []) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Nome: Guilherme Lima");
		pessoa.setEndereco("Endereco: AV.Marechal Tito");
		pessoa.setRg(1254896547);
		pessoa.setCpf(38567);
		pessoa.setCep(10015100);
		pessoa.setIdade(17);
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome(" Nome: Jamal");
		pf.setEndereco(" Endereco: Rua Prosperidade");
		
		pj.setRazaoSocial("Razao Social: Empresa AGL");
		pj.setEndereco(" Endereco: AV.Pires do Rio");
		
		
		System.out.println("CADASTRO PESSOA (NORMAL) -");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.print("RG:");
		System.out.println(pessoa.getRg());
		System.out.print("CPF:");
		System.out.println(pessoa.getCpf());
		System.out.print("CEP:");
		System.out.println(pessoa.getCep());
		System.out.print("Idade:");
		System.out.println(pessoa.getIdade());
		System.out.println("PESSOA FISICA -");
		System.out.println(pf.getNome());
		System.out.println(pf.getEndereco());
		System.out.println("PESSOA JURIDICA -");
		System.out.println(pj.getRazaoSocial());
		System.out.println(pj.getEndereco());
		
	}

}
