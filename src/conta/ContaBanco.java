package conta;

import javax.swing.JOptionPane;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private float valor;
	private boolean status;
	
	public void estadoAtual() {
		JOptionPane.showMessageDialog(null, "Número da Conta: "+this.getNumConta()+
				"\nConta Tipo: "+this.getTipo()+"\nDono da Conta: "+this.getDono()+
				"\nSaldo: "+this.getSaldo());
		System.out.println("--------------------------------------");
		System.out.println("Número da Conta: "+this.getNumConta());
		System.out.println("Conta Tipo: "+this.getTipo());
		System.out.println("Dono da Conta: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("--------------------------------------");
	}
	
	public void abrirConta(String tp) {
		this.setTipo(tp);
		this.setStatus(true);
		if(tp == "CC") {
			this.setSaldo(50);
		}
		else if(tp == "CP") {
			this.setSaldo(150);
		}
		JOptionPane.showMessageDialog(null, "Conta aberta com Sucesso!");
		System.out.println("Conta aberta com Sucesso!");
	}
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			JOptionPane.showMessageDialog(null, "Conta não pode ser fechada, pois tem "+this.getSaldo()+" de crédito");
			System.out.println("Conta não pode ser fechada, pois tem "+this.getSaldo()+"  de crédito");
		}
		else if(this.getSaldo() < 0) {
			JOptionPane.showMessageDialog(null, "Conta não pode ser fechada, pois tem débito");
			System.out.println("Conta não pode ser fechada, pis tem débito");
		}
		else {
			this.setStatus(false);
			JOptionPane.showMessageDialog(null, "Conta encerrada");
			System.out.println("Conta encerrada");
		}
	}
	public void depositar(float vl) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + vl);
			JOptionPane.showMessageDialog(null, "Depósito de "+vl+" reais"+"\nRealizado na conta de "+this.getDono());
			System.out.println("Depósito de "+vl);
			System.out.println("Realizado na conta de "+this.getDono());
		}
		else {
			JOptionPane.showMessageDialog(null,"Impossível depositar numa conta fechada");
			System.out.println("Impossível depositar numa conta fechada");
		}
	}
	public void sacar(float vl) {
		if(this.getStatus()) {
			if(this.getSaldo() >= vl) {
				this.setSaldo(this.getSaldo() - vl);
				JOptionPane.showMessageDialog(null, "Saque de "+vl+" reais"+ " realizado na conta de "+this.getDono());
				System.out.println("Saque de "+vl+" realizado na conta de "+this.getDono());
			}
			else {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque");
				System.out.println("Saldo insuficiente para saque");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Impossível sacar de uma conta fechada");
		}
	}
	public void pagarMensal() {
		int pm =0;
		if(this.getTipo() == "CC") {
			pm = 12;
		}
		else if(this.getTipo() == "CP") {
			pm = 20;
		}
		
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - pm);
			JOptionPane.showMessageDialog(null,"Mensalidade de "+pm+" paga com sucesso por "+this.getDono());
			System.out.println("Mensalidade de "+pm+" paga com sucesso por "+this.getDono());
		}
		else {
			JOptionPane.showMessageDialog(null, "Impossível pagar uma conta fechada");
			System.out.println("Impossível pagar uma conta fechada");
		}
	}
	
	public ContaBanco(int nc, String tp, String dn, float vl) {
		this.numConta = nc;
		this.tipo = tp;
		this.dono = dn;
		this.valor = vl;
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int nc) {
		this.numConta = nc;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tp) {
		this.tipo = tp;
	}
	
	public String getDono() {
		return this.dono;
	}
	public void setDono(String dn) {
		this.dono = dn;
	}
	
	public float getValor() {
		return this.valor;
	}
	public void setValor(float vl) {
		this.valor = vl;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float sd) {
		this.saldo = sd;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	
}
