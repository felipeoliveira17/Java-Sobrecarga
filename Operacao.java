package AtividadeSobrecarga;

public class Operacao {
	private int nroFatorial = 0;
	private int nroMinuendo = 0;
	private int nroSubtraendo = 0;
	private int nroGenerico1 = 0;
	private int nroGenerico2 = 0;
	public int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	// CONSTRUTOR Operacao SEM PASSAGEM DE PARAMETROS - CONSTRUTOR COM POLIMORFISMO
	public Operacao() {
		this.nroMinuendo = 0;
		this.nroSubtraendo = 0;
		this.nroGenerico1 = 0;
		this.nroGenerico2 = 0;
	}
	public void setMinuendo(int numero) {
		this.nroMinuendo = numero;
	}
	public void setSubtraendo(int numero) {
		this.nroSubtraendo = numero;
	}
	public int subtracao() {
		return nroMinuendo - nroSubtraendo;
	}
	public void setFatorial(int numero) {
		this.nroFatorial = numero;
	}
	private int fatorialRecursivo(int numero) {
		if ((numero==1) || (numero==0)) {
			return 1;
		} else {
			return fatorialRecursivo(numero-1)*numero;
		}
	}
	public int getFatorial() {
		return fatorialRecursivo(nroFatorial);
	}
	public int multiplicacao() {
		return this.nroGenerico1 * this.nroGenerico2;
	}
	public void setNumeroGenerico1(int numero) {
		this.nroGenerico1 = numero;
	}
	public void setNumeroGenerico2(int numero) {
		this.nroGenerico2 = numero;
	}
	public int divisao() {
		return this.nroGenerico1 / this.nroGenerico2;
	}
	public int exponenciacao() {
		return (int)Math.pow(nroGenerico1, nroGenerico2);
	}
	
	// SOBRECARGA:
	public int soma(int numero1, int numero2, int numero3) {
		return numero1+numero2+numero3;
	}
	public int soma(String numero1, String numero2) {
		return Integer.parseInt(numero1)+Integer.parseInt(numero2);
	}
	
	static public String mensagemEstatica() {
		return "Sou um método estático, diferentemente do dinâmico, não preciso ser instanciado! Bem-vindo, aperte ENTER para continuar!";
	}
}
