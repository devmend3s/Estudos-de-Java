public class TestAve {
	public static void main(String[] args) {
		// instanciando a classe Ave
		Ave canto_ave = new Ave();
		
		//Chamando o metodo Cantar e o atribuindo a variável canto
		String canto = canto_ave.Cantar();
		
		//Imprimindo o "Fiu, Fiu"
		System.out.print(canto);
	}
}