package conta;

public class MainProgram {

	public static void main(String[] args) {
		
		ContaBanco cb1 = new ContaBanco(0, null, null, 0);
		cb1.setNumConta(1001);
		cb1.setDono("João Paulo de Assis");
		cb1.abrirConta("CC");
		cb1.estadoAtual();
		
		cb1.depositar(100);
		cb1.estadoAtual();
		
		cb1.sacar(50);
		cb1.estadoAtual();
		
		cb1.pagarMensal();
		cb1.estadoAtual();
		
		cb1.fecharConta();
		cb1.sacar(88);
		
		cb1.fecharConta();
		cb1.estadoAtual();
		
		ContaBanco cb2 = new ContaBanco(0, null, null, 0);
		cb2.setNumConta(1002);
		cb2.setDono("Maria Dose da Penha");
		cb2.abrirConta("CP");
		cb2.estadoAtual();
		
		cb2.depositar(200);
		cb2.estadoAtual();
		
		cb2.sacar(100);
		cb2.estadoAtual();
		
		cb2.pagarMensal();
		cb2.estadoAtual();
		
		cb2.fecharConta();
		cb2.sacar(230);
		
		cb2.fecharConta();
		cb2.estadoAtual();
	}

}
