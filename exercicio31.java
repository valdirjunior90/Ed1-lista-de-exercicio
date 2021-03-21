//31. Utilizando o recurso Generic de Java, faça um método para exibir um objeto (usando seu método toString), 
//e outro método para exibir os elementos de um vetor. 

class Generci {
	public static void main(String[] args) 
	{
		// printObject
		printObject(100);
		printObject(100.1);
		printObject('X');
		printObject(new Cadastro("Valdir", 98, 1.73));
		System.out.println();
		
		// printArray
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'B', 'o', 'm',' ', 'd', 'i','a','!'};
		Cadastro[] CadastroArray = { new Cadastro("Arthur", 75, 1.75),  new Cadastro("Eduarda", 55, 1.70)};

		System.out.println("intArray:");
		printArray(intArray);

		System.out.println("doubleArray:");
		printArray(doubleArray);

		System.out.println("charArray:");
		printArray(charArray);
		
		System.out.println("CadastroArray: ");
		printArray(CadastroArray);
	}
	
	
	public static <T> void printObject(T myObj) 
	{
		System.out.println(myObj + " ");
	}
	
	public static <E> void printArray(E[] myArray) 
	{
		for(E element : myArray) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	
	private static class Cadastro
	{
		String nome;
		double peso;
		double altura;

		public Cadastro(String nome, double peso, double altura) {
			this.nome = nome;
			this.peso = peso;
			this.altura = altura;
			}

		@Override
		public String toString() {
			return "Cadastro ["
					+ (nome != null ? "nome=" + nome : "") + ", " 
					+ "Peso=" + peso + ", "
					+ "Altura=" + altura 
					+ "]\n";
		}
	}
}