import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ContaPalavras {

	public static void main(String[] args) {
		int estd = 0, mt = 0, semp = 0;
		String path = "src/temp/texto.txt";
		String texto;
		System.out.println("Lendo");
		try {
			texto = leitor(path);
			texto = texto.trim();
			System.out.println(texto);

			String[] parts = texto.split(" ");

			for (int i = 0; i < parts.length; i++) {
			if (parts[i].equals("estude")) {
					estd++;
				} else if (parts[i].equals("muito")) {
					mt++;
				} else if(parts[i].equals("sempre")) {
					semp++;
				}
			}

			System.out.println("Estude: " + estd + "\nMuito: " + mt + "\nSempre: " + semp);

		} catch (

		IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		}

	}

	public static String leitor(String path) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

		StringBuffer sbResult = new StringBuffer();
		String linha = "";

		while (linha != null) {
			sbResult.append(linha + "\n");
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();
		return sbResult.toString();
	}
}