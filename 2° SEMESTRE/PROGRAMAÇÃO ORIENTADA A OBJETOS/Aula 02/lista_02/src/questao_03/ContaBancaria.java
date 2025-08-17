package questao_03;

public class ContaBancaria {

	private String numero;
	private String titular;
	private double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(String numero, String titular, double saldo) {
		setNumero(numero);
		setTitular(titular);
		setSaldo(saldo);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero == null || numero.isBlank()) {
			System.out.println("Número inválido");
		} else {
			this.numero = numero;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if (titular == null || titular.isBlank()) {
			System.out.println("Titular inválido");
		} else {
			this.titular = titular;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo <= 0) {
		} else {
			this.saldo = saldo;
		}
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Recusado o depósito");
		} else {
			saldo = saldo + valor;
		}
	}

	public void sacar(double valor) {
		if (valor <= 0 || saldo < valor) {
			System.out.println("Recusado o saque");
		} else {
			saldo = saldo - valor;
		}
	}

	public void transferir(ContaBancaria contaDestino, double valor) {
		if (valor <= 0 || saldo < valor) {
			System.out.println("Recusado a transferência");
		} else {
			contaDestino.saldo = valor + contaDestino.saldo;
			saldo = saldo - valor;
		}
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
}
