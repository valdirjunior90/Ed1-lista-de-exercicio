import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ContaPalavraCsv {

	public static void main(String[] args) {
		int estd = 0, mt = 0, semp = 0;
		String path = "src/temp/texto.txt";
		String pathEscrita = "src/temp/texto.csv";
		String textoOutput;
		String textoInput = "";
		System.out.println("Lendo TXT");
		try {
			textoOutput = leitor(path);
			textoOutput = textoOutput.trim();
			System.out.println(textoOutput);

			String[] parts = textoOutput.split(" ");

			for (int i = 0; i < parts.length; i++) {
				if (parts[i].equals("estude")) {
					estd++;
				} else if (parts[i].equals("muito")) {
					mt++;
				} else if (parts[i].equals("sempre")) {
					semp++;
				}
			}
			System.out.println("\nEstude: " + estd + "\nMuito: " + mt + "\nSempre: " + semp);

			System.out.println("\nEscrita no CSV");
			textoInput = "Estude: " + estd + "\nMuito: " + mt + "\nSempre: " + semp;
			System.out.println(textoInput);

			try {
				escritor(pathEscrita, textoInput);
			} catch (IOException e) {
				System.out.println("Erro na escrita");
				e.printStackTrace();
			}

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

	public static void escritor(String pathEscrita, String texto) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathEscrita));
		bufferedWriter.append(texto);
		bufferedWriter.close();
	}
}