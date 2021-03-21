import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class LendoArquivo {

	public static void main(String[] args) {

		String path = "src/temp/leitura.txt";
		String pathEscrita = "src/temp/atexto.csv";
		String texto;
		String textoInput = "";
		System.out.println("Lendo TXT");
		try {
			texto = leitor(path);
			texto = texto.trim();
			System.out.println(texto);

			System.out.println("\nEscrevendo no CSV");
			texto = texto.replace("\n", ";");
			String[] parts = texto.split(";;");
			for (int i = 0; i < parts.length; i++) {
				// textoInput = (parts[i]);
				textoInput = textoInput.concat(parts[i] + "\n");
			}
			System.out.println(textoInput);
			try {
				escritor(pathEscrita, textoInput);
			} catch (IOException e) {
				System.out.println("Erro na escrita");
				e.printStackTrace();
			}

		} catch (IOException e) {
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
