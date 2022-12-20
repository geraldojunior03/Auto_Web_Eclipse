package fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import stepsDefinition.Hooks;

public class ConfigFileWriter {

	private static final Path currentRelativePath = Paths.get("");
	private static final String currentPath = currentRelativePath.toAbsolutePath().toString();
	private static final String propertyFilePath = currentPath + "\\src\\test\\resources\\configs\\config.properties";

	private static final String dataCTEmpresa01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTEmpresa01.properties";
	private static final String dataCTIncluirFilial_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTIncluirFilial.properties";
	private static final String dataCTAtender02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAtender02.properties";
	private static final String dataManterCartao_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_ManterCartao.properties";
	private static final String dataCTCancelamento01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamento01.properties";
	private static final String dataCTCancelamento02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamento02.properties";
	private static final String dataCTCancelamento03_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamento03.properties";
	private static final String dataCTCancelamento04_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamento04.properties";
	private static final String dataCTCancelamento05_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamento05.properties";
	private static final String dataCTCancelamento06_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamento06.properties";
	private static final String dataCTBloqueioCartaoCA_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTBloqueioCartaoCA.properties";
	private static final String dataCTAlterarDataDisponibilizacao_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAlterarDataDisponibilizacao.properties";
	private static final String dataCTAlterarDataDisponibilizacao_pedidoPropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAlterarDataDisponibilizacao_pedido.properties";
	private static final String dataCancelamentoContrato01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CancelamentoContrato01.properties";
	private static final String CTReemissaoCartaoContratoAlterado_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTReemissaoCartaoContratoAlterado.properties";
	private static final String dataNovoContrato_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_NovoContrato.properties";
	
	public static int contador;

	public ConfigFileWriter(String variavel1) throws Exception {
		
		try {
			File file = new File(dataCTEmpresa01_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.newLine();

			writer.write("cnpj_empresa = " + variavel1);
			writer.newLine();
			
			writer.write("banco = BANCO BRADESCO S.A.");
			writer.newLine();
			
			writer.write("valor = 192000");
			writer.newLine();

			writer.flush();
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTIncluirFilial_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.newLine();

			writer.write("cnpj_empresa = " + variavel1);
			writer.newLine();

			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTAtender02_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("cpf = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataManterCartao_PropertyFilePath);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("cpf = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}

	
		try {
			File file = new File(dataCTBloqueioCartaoCA_PropertyFilePath);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("cpf = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTCancelamento01_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("contrato_pat = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTCancelamento02_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("contrato_transporte = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTCancelamento03_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("contrato_pj = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTCancelamento04_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("contrato_pat = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTCancelamento05_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("contrato_transporte = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTCancelamento06_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();
			
			writer.write("contrato_pj = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTAlterarDataDisponibilizacao_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();

			writer.write("teste = Alterar Data Disponibilizacao (Contexto de Atendimento) e Disponibilizacao OnLine - PAT\r\n" + 
					"contrato_pat = 28020518\r\n" + 
					"cpf_pj = 38721015287\r\n" + 
					"contrato = 43156509\r\n" + 
					"banco = \r\n" + 
					"valor = 80000");
			writer.newLine();
			
			writer.write("contrato = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataNovoContrato_PropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.newLine();

			writer.write("cnpj_empresa = " + variavel1);
			writer.newLine();
			
			writer.write("cnpj_pat = " + variavel1);
			writer.newLine();
			
			writer.write("banco = ");
			writer.newLine();
			
			writer.write("valor = 80000");
			writer.newLine();
			
			writer.flush();
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		try {
			File file = new File(dataCTAlterarDataDisponibilizacao_pedidoPropertyFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.newLine();

			writer.write("teste = Alterar Data Disponibilizacao (Contexto de Atendimento) e Disponibilizacao OnLine - PAT\r\n" + 
					"cpf_pj = 38721015287\r\n" + 
					"contrato_pat = 28020518\r\n" + 
					"contrato_transporte = 25236918\r\n" + 
					"#contrato_pj = 12332517\r\n" + 
					"contrato_pj = 16305619\r\n" + 
					"cpf_transporte = 40394971809\r\n" + 
					"cpf_pj = 18452545894\r\n" + 
					"dataDisponibilizacao = 08092020\r\n" + 
					"cnpj_pat = 02428200\r\n" + 
					"contrato_pat = 28020518\r\n" + 
					"cpf = 02567308571\r\n" + 
					"#cnpj_pat = 29744778\r\n" + 
					"cnpj_pat = 15615818\r\n" + 
					"dataDisp = 2021_1_24_0\r\n" + 
					"mesAno = 012021\r\n" + 
					"usuario = Auto Pedido\r\n" + 
					"cpf = 46849342096\r\n" + 
					"nomeEmbossing =\r\n" + 
					"dataNascimento = 01011989\r\n" + 
					"valorDisp = 100\r\n" + 
					"empDestino =\r\n" + 
					"pedido_pj = 171\r\n" + 
					"cpf = 88419380563\r\n" + 
					"pedido = 88419380563"
					+ "contrato_pat = 28020518\r\n" + 
					"cpf = 02567308571\r\n" + 
					"dataDisp = 2021_1_24_0\r\n" + 
					"mesAno = 012021\r\n" + 
					"usuario = Auto Pedido\r\n" + 
					"cpf = 46849342096\r\n" + 
					"nomeEmbossing = Teste Auto\r\n" + 
					"dataNascimento = 01011989\r\n" + 
					"valorDisp = 100\r\n" + 
					"empDestino =\r\n" + 
					"cpf = 88419380563\r\n" + 
					"contrato_refeicao = 12216212\r\n" + 
					"contrato_multibeneficio = 13496118\r\n" + 
					"quantidadeFiliais = 1\r\n" + 
					"quantidadeFuncionarios = 10\r\n" + 
					"valorMedioBeneficios = 500000\r\n" + 
					"banco = \r\n" + 
					"valor = 80000\r\n" + 
					"contrato = 2984275\r\n" + 
					"cnpj_pat = 2984275\r\n" + 
					"cnpjCompleto_pat = 2984275");
			writer.newLine();
			
			writer.write("cnpj_empresa = " + variavel1);
			writer.newLine();
			
			writer.write("cnpj_pat = " + variavel1);
			writer.newLine();
			
			writer.write("banco = ");
			writer.newLine();
			
			writer.write("valor = 80000");
			writer.newLine();
			
			writer.write("pedido = " + variavel1);
			writer.newLine();
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
		
		if(Hooks.cenarioTag.contains("@CancelamentoContrato01")) {
			try {
				File file = new File(dataCancelamentoContrato01_PropertyFilePath);
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				
				writer.newLine();
				
				writer.write("contrato_transporte = " + variavel1);
				writer.newLine();
				
				writer.flush();
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException(
						"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
			}
		}
		
		if((Hooks.cenarioTag.contains("@reemissaoCartaoAlimentacaoPAT"))||
				(Hooks.cenarioTag.contains("@reemissaoCartaoRefeicaoPAT"))||
				(Hooks.cenarioTag.contains("@reemissaoCartaoMultibeneficiosPAT"))) {
			try {
				File file = new File(CTReemissaoCartaoContratoAlterado_PropertyFilePath);
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				
				writer.write("teste = Reemissao ContratoAlterado\r\n" + 
						"\r\n" + 
						"contrato_pat = 28020518\r\n" + 
						"cpf = 02567308571\r\n" + 
						"dataDisp = 2021_1_24_0\r\n" + 
						"mesAno = 012021\r\n" + 
						"usuario = Auto Pedido\r\n" + 
						"cpf = 46849342096\r\n" + 
						"nomeEmbossing = Teste Auto\r\n" + 
						"dataNascimento = 01011989\r\n" + 
						"valorDisp = 100\r\n" + 
						"empDestino =\r\n" + 
						"cpf = 88419380563\r\n" + 
						"contrato_refeicao = 12216212\r\n" + 
						"contrato_multibeneficio = 13496118\r\n" + 
						"quantidadeFiliais = 1\r\n" + 
						"quantidadeFuncionarios = 10\r\n" + 
						"valorMedioBeneficios = 500000\r\n" + 
						"banco = \r\n" + 
						"valor = 80000");
				writer.newLine();
				
				writer.write("contrato = " + variavel1);
				writer.newLine();
				
				writer.write("cnpj_pat = " + variavel1);
				writer.newLine();
				
				writer.write("cnpjCompleto_pat = " + variavel1);
				writer.newLine();
				
				writer.flush();
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException(
						"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
			}
		}
	}

	public ConfigFileWriter(String cnpjFilial, String cnpjEmpresa, String cpfInterlocutor, String idBulk, String proxy)
			throws IOException {

		if (Hooks.cenarioTag.contains("")) {
			try {

				if (contador == 0) {
					File file = new File("");
					BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					writer.close();
				}

				FileWriter file = new FileWriter("", true);
				BufferedWriter writer = new BufferedWriter(file);

				if (contador == 0) {
					writer.newLine();
					writer.write("cnpj_filial = " + cnpjFilial);
					writer.newLine();
					writer.write("cnpj_empresa = " + cnpjEmpresa);
					writer.newLine();
					writer.write("cpf_interlocutor = " + cpfInterlocutor);
					writer.newLine();
					writer.write("id_bulk = " + idBulk);
				} else if (contador == 1) {
					writer.newLine();
					writer.write("proxy = " + proxy);
				}

				contador = 1;

				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
						+ propertyFilePath);
			}
		}
	}
	
//	public ConfigFileWriter(String contrato, String cpf) throws Exception {
//		try {
//			File file = new File(dataCTBloqueioCartaoCA_PropertyFilePath);
//			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//			
//			writer.newLine();
//			
//			writer.write("cpf = " + cpf);
//			writer.newLine();
//			
//			writer.write("contrato = " + contrato);
//			writer.newLine();
//			
//			writer.flush();
//			writer.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			throw new RuntimeException(
//					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
//		}
//		
//		
//	}
}