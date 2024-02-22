
public class Ave {
	int peso;
	int altura;
	int invergadura;
	
	//strings
	String nomePopular;
	String genero;
	String especie;
	
	//metodos
	Ave (int peso, int altura, int envergadura, String nomePopular, String genero, String especie){
		this.peso = peso;				// g
		this.altura = altura;			// cm
		this.envergadura = envergadura;	// cm	
		this.nomePopular = nomePopular;
		this.genero = genero;
		this.especie = especie;
	}
	public String Cantar() {
		return "Fiu, Fiu, Fiu";
	}

	public void MostrarNomes(){
		System.out.println("Peso:" +peso);
		System.out.println("altura:" +altura);
		System.out.println("nomePopular:" +nomePopular);
		System.out.println("genero:" +genero);
		System.out.println("invergadura:" +invergadura);
		System.out.println("especie:" +especie);
	}

} 
