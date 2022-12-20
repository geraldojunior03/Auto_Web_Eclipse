package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import com.google.common.collect.Table.Cell;
import managers.FileReaderManager;

/**
 * General utility.
 * 
 * @author <a reef="https://github.com/DavidePastore">DavidePastore</a>
 *
 */
public class Utils {

	private static final Path currentRelativePath = Paths.get("");
	private static final String currentPath = currentRelativePath.toAbsolutePath().toString();
	private static final String xlsFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\Copy of Serasa_MassaTesteHOM.xls";
	public static String cpfNumerico = null;
	public static String cnpjGerado = null;
	public static String cnpjNumerico = null;
	public static String radicalCNPJ = null;
	public static String restanteCNPJ = null;
	public static String quatroNumerosGerados = null;
	public static String seisNumerosGerados = null;
	public static String numCelular = null;
	public static String email = null;

	public static String valor = null;

	/**
	 * Converts an int to a boolean value.
	 * 
	 * @param num the number to convert.
	 * @return the boolean value.
	 */
	public static boolean fromIntToBoolean(int num) {
		return num != 0;
	}

	private static String getCPFVerifier(String number) {
		int v1, v2, sum, weight;

		sum = 0;
		weight = 10;
		for (int i = 0; i < number.length(); i++)
			sum += Integer.parseInt(number.substring(i, i + 1)) * weight--;
		if (sum % 11 == 0 | sum % 11 == 1)
			v1 = 0;
		else
			v1 = 11 - (sum % 11);

		sum = 0;
		weight = 11;
		for (int i = 0; i < number.length(); i++)
			sum += Integer.parseInt(number.substring(i, i + 1)) * weight--;
		sum += v1 * 2;
		if (sum % 11 == 0 | sum % 11 == 1)
			v2 = 0;
		else
			v2 = 11 - (sum % 11);

		return String.valueOf(v1) + String.valueOf(v2);
	}

	public static String generateCPF() {
		String cpf = "";
		int r;
		Random gen = new Random();

		for (int i = 0; i < 9; i++) {
			r = gen.nextInt(9);
			cpf += String.valueOf(r);
		}

		cpfNumerico = cpf + getCPFVerifier(cpf);

		System.out.println(cpfNumerico);

		return cpfNumerico;

//		return cpf + getCPFVerifier(cpf);
	}

	public static String generateRG() {
		String rg = "";
		int rand = new Random().nextInt(999999999);
		rg = String.valueOf(rand);
		return rg;
	}

	public static String generateEmail() {
		email = "";
		int randMail = new Random().nextInt(99999);
		String randId = String.valueOf(randMail);
		email = "teste" + randId + "@teste.com.br";
		return email;
	}

	public static String geraCPF() {

		int digito1 = 0, digito2 = 0, resto = 0;
		String nDigResult;
		String numerosContatenados;
		String numeroGerado;

		Random numeroAleatorio = new Random();

		// numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);

		int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		int valor = (soma / 11) * 11;

		digito1 = soma - valor;

		// Primeiro resto da divisão por 11.
		resto = (digito1 % 11);

		if (digito1 < 2) {
			digito1 = 0;
		} else {
			digito1 = 11 - resto;
		}

		int soma2 = digito1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		int valor2 = (soma2 / 11) * 11;

		digito2 = soma2 - valor2;

		// Primeiro resto da divisão por 11.
		resto = (digito2 % 11);

		if (digito2 < 2) {
			digito2 = 0;
		} else {
			digito2 = 11 - resto;
		}

		// Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + "." + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + "." + String.valueOf(n7) + String.valueOf(n8)
				+ String.valueOf(n9) + "-";

		// Concatenando o primeiro resto com o segundo.
		nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

		numeroGerado = numerosContatenados + nDigResult;

		System.out.println("CPF Gerado " + numeroGerado);

		return numeroGerado;
	}// fim do metodo geraCPF

	public String mostraResultado() throws Exception {

		String resultadoCPF = geraCPF();

		return resultadoCPF;
	}

	public static String generatePhoneNumber() {
		numCelular = "";
		int rand = new Random().nextInt(99999999);
		numCelular = "9" + String.valueOf(rand);
		return numCelular;
	}

	private static int mod(int dividendo, int divisor) {
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}

	public static String geraCNPJ() {

		String numerosContatenados;

		Random numeroAleatorio = new Random();

		// numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = 0; // randomiza(n);
		int n10 = 0; // randomiza(n);
		int n11 = 0; // randomiza(n);
		int n12 = 1; // randomiza(n);
		int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4
				+ n1 * 5;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4
				+ n2 * 5 + n1 * 6;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		cnpjNumerico = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) + String.valueOf(n8) + String.valueOf(n9)
				+ String.valueOf(n10) + String.valueOf(n11) + String.valueOf(n12) + String.valueOf(d1)
				+ String.valueOf(d2);

		// Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + "." + String.valueOf(n3) + String.valueOf(n4)
				+ String.valueOf(n5) + "." + String.valueOf(n6) + String.valueOf(n7) + String.valueOf(n8) + "/"
				+ String.valueOf(n9) + String.valueOf(n10) + String.valueOf(n11) + String.valueOf(n12) + "-"
				+ String.valueOf(d1) + String.valueOf(d2);

		radicalCNPJ = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) + String.valueOf(n8);

		restanteCNPJ = String.valueOf(n9) + String.valueOf(n10) + String.valueOf(n11) + String.valueOf(n12)
				+ String.valueOf(d1) + String.valueOf(d2);

		cnpjGerado = numerosContatenados;

		System.out.println("CNPJ Gerado " + cnpjGerado);

		return cnpjGerado;
	}

	public static String geradorAgencia() {
		String agencia = "";
		int rand = new Random().nextInt(9999);
		agencia = String.valueOf(rand);
		quatroNumerosGerados = agencia;
		return agencia;
	}

	public static String geradorContaBanc() {
		int rand = new Random().nextInt(999999);
		seisNumerosGerados = String.valueOf(rand);
		return seisNumerosGerados;
	}

	public static String geradorDigitoConta() {
		String digito = "";
		int rand = new Random().nextInt(9);
		digito = String.valueOf(rand);
		return digito;
	}

	public static String geradorContaPagamento() {
		String conta_pag = "";
		int rand = new Random().nextInt(99999999);
		conta_pag = String.valueOf(rand);
		return conta_pag;
	}

//	public static Map<String, String> getDadosExcel() throws Exception {
//
//		String teste = FileReaderManager.getInstance().getConfigReader().getTeste();
//
//		Workbook workbook = Workbook.getWorkbook(new File(xlsFilePath));
//
//		Sheet sheet = workbook.getSheet(0);
//
//		int linhas = sheet.getRows();
//		int colunas = sheet.getColumns();
//
//		Map<String, String> registro = new HashMap<String, String>();
//
//		String header = null;
//		String dado = null;
//		String utilizado = null;
//
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				// verificar se dados já foram utilizados
//				for (int u = 1; u < linhas; u++) {
//					Cell celula_utilizado = sheet.getCell(4, u);
//					utilizado = celula_utilizado.getContents();
//					while (utilizado.isEmpty()) {
//						for (int reg = 0; reg < colunas; reg++) {
//							Cell celula = sheet.getCell(reg, i);
//							header = celula.getContents();
//
//							Cell conteudo = sheet.getCell(reg, u);
//							dado = conteudo.getContents();
//
//							registro.put(header, dado);
//						}
//						if (registro != null) {
//							if (teste.equals("C11197537")) {
//								return registro;
//							} else {
//								escreverSimEmPlanilhaParaCPFjaUtilizado(4, u);
//								return registro;
//							}
//						}
//					}
//				}
//			}
//		}
//		return registro;
//	}

	public static String ajustarFormatoDataInvertido(String data) throws Exception {
		String data_excel = data;

		String[] semTraco = data_excel.split("-");
		String ano = semTraco[0];
		String mes = semTraco[1];

		String dia_excel = semTraco[2];
		String[] semEspaco = dia_excel.split(" ");
		String dia = semEspaco[0];

		String data_correta = dia + "/" + mes + "/" + ano;

		return data_correta;
	}

	public static String ajustarCPFComPontosETraco(String cpf) throws Exception {
		String cpf_excel = cpf;

		String[] cpfPorCarac = cpf_excel.split("");

		String cpfFim = cpfPorCarac[0] + cpfPorCarac[1] + cpfPorCarac[2] + "." + cpfPorCarac[3] + cpfPorCarac[4]
				+ cpfPorCarac[5] + "." + cpfPorCarac[6] + cpfPorCarac[7] + cpfPorCarac[8] + "-" + cpfPorCarac[9]
				+ cpfPorCarac[10];

		return cpfFim;
	}

//	public static void escreverSimEmPlanilhaParaCPFjaUtilizado(int coluna, int linha) throws Exception {
//		try {
//			InputStream inp = new FileInputStream(xlsFilePath);
//
//			org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(inp);
//			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(0);
//			Row row = sheet.getRow(linha);
//			org.apache.poi.ss.usermodel.Cell cell = row.getCell(coluna);
//			if (cell == null)
//				cell = row.createCell(coluna);
////		    cell.setCellType(Cell.CELL_TYPE_STRING);
//			cell.setCellValue("Sim");
//
//			// Write the output to a file
//			FileOutputStream fileOut = new FileOutputStream(xlsFilePath);
//			wb.write(fileOut);
//			fileOut.close();
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//	}

	public static String geradorProtocolo() {
		String protocolo = "";
		String prefix = "SVLABS202000";
		int rand = new Random().nextInt(999999);
		protocolo = prefix + String.valueOf(rand);
		return protocolo;
	}

//	public static String geradorRadicalCNPJ() {
//		return radicalCNPJ;
//	}

	public static String geradorIdBulkCard() {
		String id = "";
		int rand = new Random().nextInt(9999);
		id = String.valueOf(rand);
		return id;
	}

	public static BigDecimal converterStringParaBigDecimal(String valorEmString) throws Exception {
		BigDecimal valor = new BigDecimal(valorEmString.replaceAll("\\.", "").replace(",", "."));

		return valor;
	}

	public static String ajustarCPFParaRetirarPontoETraco(String cpf) throws Exception {
		String[] cpfPorConjunto = cpf.split(Pattern.quote("."));

		String cpf1 = cpfPorConjunto[0];
		String cpf2 = cpfPorConjunto[1];

		String cpfTraco = cpfPorConjunto[2];
		String[] separarTraco = cpfTraco.split("-");

		String cpf3 = separarTraco[0];
		String cpfDigito = separarTraco[1];

		String cpfFim = cpf1 + cpf2 + cpf3 + cpfDigito;

		return cpfFim;
	}

	public static void copiarArquivoOuDiretorio(String srcDir, String dstDir) {

		try {
			File src = new File(srcDir);
			File dst = new File(dstDir, src.getName());

			if (src.isDirectory()) {

				String files[] = src.list();
				int filesLength = files.length;
				for (int i = 0; i < filesLength; i++) {
					String src1 = (new File(src, files[i]).getPath());
					String dst1 = dst.getPath();
					copiarArquivoOuDiretorio(src1, dst1);

				}
			} else {
				copiarArquivo(src, dst);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public static void copiarArquivo(File sourceFile, File destFile) throws IOException {
		if (!destFile.getParentFile().exists())
			destFile.getParentFile().mkdirs();

		if (!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel source = null;
		FileChannel destination = null;

		try {
			source = new FileInputStream(sourceFile).getChannel();
			destination = new FileOutputStream(destFile).getChannel();
			destination.transferFrom(source, 0, source.size());
		} finally {
			if (source != null) {
				source.close();
			}
			if (destination != null) {
				destination.close();
			}
		}
	}

	public static String subtrairDiasDaDataAtual(int dias) throws Exception {
		LocalDate date = LocalDate.now().minusDays(dias);
		String novaData = date.toString();
		return ajustarFormatoDataInvertido(novaData);
	}

	public static String somarDiasDaDataAtual(int dias) throws Exception {
		LocalDate date = LocalDate.now().plusDays(dias);
		String novaData = date.toString();
		System.out.println("\n DATA: " + ajustarFormatoDataInvertido(novaData) + "\n");
		return ajustarFormatoDataInvertido(novaData);
	}

	public static boolean verificarExistenciaDeArquivo(String downloadPath, String fileName, String fileExtension) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName + fileExtension)) {
//				dirContents[i].delete();
				return true;
			}
		}
		return false;
	}

	public static String getDataAtualSemTracos() throws Exception {
		DateFormat formatter = new SimpleDateFormat("ddMMyyyy");
		Date today = new Date();

		String strDate = formatter.format(today);

		return strDate;
	}

	public static String getElementoIDDataAtualMenosDias() throws Exception {
		SimpleDateFormat data = new SimpleDateFormat("yyyy_M_dd");
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		// Subtrai 25 dias do dia atual
		cal.add(Calendar.DAY_OF_MONTH, -25);
		today = cal.getTime();
		String dataGerada = data.format(today);
		// Gerar ElementoID do Tipo Data
		String elementId = "ctl00_ContentPlaceHolder1_SearchWizard_SearchControl_PickerFrom_Calendar1_";
		elementId = elementId + dataGerada + "_0";

		return elementId;

	}

	public static String gerarValorTarifa() {
		Random rand = new Random();
		double randomNum = rand.nextInt((13 - 3) + 1) + 3;
		valor = String.valueOf(randomNum);
		valor = valor.replace(".", ",");
		return valor;
	}

	public static String gerarCodigo3Digitos() {
		String id = "";
		int rand = new Random().nextInt(999);
		id = String.valueOf(rand);
		return id;
	}

	public static boolean verificarExistenciaDeArquivoPorExtensao(String downloadPath, String fileExtension) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().contains(fileExtension)) {
				return true;
			}
		}
		return false;
	}

	public static String getBusinessDateFormatada() throws Exception {
		String dataSistema = OracleDB.selectDBAlelo("SELECT corp.BUSINESS_DATE FROM BC_CORPORATION corp",
				"BUSINESS_DATE");
		String[] string = dataSistema.split(Pattern.quote(" "));
		String data = string[0];
		data.replace("-", "/");
		String dataAjustada = ajustarFormatoDataInvertido(data);
		return dataAjustada;
	}

	public static String somarDiasEmData(String data, int dias) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(data, formatter);
		LocalDate newDate = localDate.plusDays(dias);
		String novaData = newDate.toString();
		return ajustarFormatoDataInvertido(novaData);
	}

	public static String getMesAnoBusinessDate() throws Exception {
		String businessDate = getBusinessDateFormatada(), mes = null, ano = null, mesAno = null;

		String[] string = businessDate.split(Pattern.quote("/"));

		mes = string[1];
		ano = string[2];
		mesAno = mes + ano;

		return mesAno;
	}

	public static String getMesAnoDataAtual() throws Exception {
		LocalDate date = LocalDate.now();
		String novaData = date.toString();
		novaData = ajustarFormatoDataInvertido(novaData);

		String mes = null, ano = null, mesAno = null;
		String[] string = novaData.split(Pattern.quote("/"));

		mes = string[1];
		ano = string[2];
		mesAno = mes + ano;

		return mesAno;
	}

	public static String ajustarCNPJParaRetirarPontoETraco(String cnpj) throws Exception {
		String[] cnpjPorConjunto = cnpj.split(Pattern.quote("."));

		String cnpj1 = cnpjPorConjunto[0];
		String cnpj2 = cnpjPorConjunto[1];
		String cnpj3 = cnpjPorConjunto[2];

		String cnpjBarra = cnpjPorConjunto[2];
		String[] separarBarra = cnpjBarra.split("/");
		cnpj3 = separarBarra[0];

		String cnpjTraco = separarBarra[1];
		String[] separarTraco = cnpjTraco.split("-");

		String cnpj4 = separarTraco[0];
		String cnpjDigito = separarTraco[1];

		String cnpjFim = cnpj1 + cnpj2 + cnpj3 + cnpj4 + cnpjDigito;

		return cnpjFim;
	}

}