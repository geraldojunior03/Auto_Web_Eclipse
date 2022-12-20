package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import core.BaseTest;

public class ConfigFileReader {

	private static final Path currentRelativePath = Paths.get("");
	private static final String currentPath = currentRelativePath.toAbsolutePath().toString();
	private static final String propertyFilePath = currentPath + "\\src\\test\\resources\\configs\\config.properties";

	private static final String dataCTFilial_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTFilial.properties";
	private static final String dataCTEmpresa02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTEmpresa02.properties";
	private static final String dataCTEmpresa01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTEmpresa01.properties";
	private static final String dataCTInterlocutor01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTInterlocutor01.properties";
	private static final String dataCTInterlocutor02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTInterlocutor02.properties";
	private static final String dataCT52_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CT52.properties";
	private static final String dataCTContrato01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTContrato01.properties";
	private static final String dataCTContrato02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTContrato02.properties";
	private static final String dataCTCobranca01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCobranca01.properties";
	private static final String dataCTCartao01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCartao01.properties";
	private static final String dataCTExtrato01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTExtrato01.properties";
	private static final String dataCTIncluirFilial_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTIncluirFilial.properties";
	private static final String dataCTPesquisaAjusteFinanceiro_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTPesquisaAjusteFinanceiro.properties";
	private static final String dataCTAtender01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAtender01.properties";
	private static final String dataCTAtender02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAtender02.properties";
	private static final String dataCTAtender03_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAtender03.properties";
	private static final String dataCTFPTarifa01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTFPTarifa01.properties";
	private static final String dataCTFPTarifa02_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTFPTarifa02.properties";
	private static final String dataCTCancelamentoTotalPedido_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamentoTotalPedido.properties";
	private static final String dataCT55_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CT55.properties";
	private static final String dataCT62_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CT62.properties";
	private static final String dataAlterarContratoCA_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_AlterarContratoCA.properties";
	private static final String dataConsultarContratoCA_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_ConsultarContratoCA.properties";
	private static final String dataConsultarBoletoCA_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_ConsultarBoletoCA.properties";
	private static final String dataPedidoCA_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_PedidoCA.properties";
	private static final String dataAgenteVendedor_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_AgenteVendedor.properties";
	private static final String dataAlterarInterlocutor_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_AlterarInterlocutor.properties";
	private static final String dataConsultarBoleto_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_ConsultarBoleto.properties";
	private static final String dataManterFuncoes_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_ManterFuncoes.properties";
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
	private static final String dataCTAjusteManual_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAjusteManual.properties";
	private static final String dataCTConsultaPerfil_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTConsultaPerfil.properties";
	private static final String dataCTAlterarDataDisponibilizacao_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAlterarDataDisponibilizacao.properties";
	private static final String dataCTAlterarDataDisponibilizacao_pedidoPropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTAlterarDataDisponibilizacao_pedido.properties";
	private static final String dataCTDesbloqueioCartaoLoteCAPropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTDesbloqueioCartaoLoteCA.properties";
	private static final String dataCTLiberarPedidoPropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTLiberarPedido.properties";
	private static final String dataCTCancelamentoTransacaoPropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTCancelamentoTransacao.properties";
	private static final String dataCancelamentoContrato01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CancelamentoContrato01.properties";
	private static final String CTReemissaoCartaoContratoAlterado_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTReemissaoCartaoContratoAlterado.properties";
	private static final String CTEvento01_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_CTEvento01.properties";
	private static final String dataNovoContrato_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_NovoContrato.properties";
	private static final String CTPedidoAnalitico_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_PedidoAN.properties";
	private static final String dataAlterarEmpresa_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_AlterarEmpresa.properties";
	private static final String dataAjusteTransacao_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_AjusteTransacao.properties";
	private static final String dataIncluirTransacao_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_IncluirTransacao.properties";
	
	private static final String dataIncluirLimiteCredito_PropertyFilePath = currentPath
			+ "\\src\\test\\resources\\configs\\massa_IncluirLimiteCredito.properties";

	private Properties properties;
	private static Properties properties_massa;
	private Properties properties_massa_CTFilial;
	private Properties properties_massa_CTIncluirFilial;
	private Properties properties_massa_CTEmpresa01;
	private Properties properties_massa_CTEmpresa02;
	private Properties properties_massa_CTInterlocutor01;
	private Properties properties_massa_CTInterlocutor02;
	private Properties properties_massa_CT52;
	private Properties properties_massa_CTContrato01;
	private Properties properties_massa_CTContrato02;
	private Properties properties_massa_CTCobranca01;
	private Properties properties_massa_CTCartao01;
	private Properties properties_massa_CTExtrato01;
	private Properties properties_massa_CTPesquisaAjusteFinanceiro;
	private Properties properties_massa_CTAtender01;
	private Properties properties_massa_CTAtender02;
	private Properties properties_massa_CTAtender03;
	private Properties properties_massa_CTFPTarifa01;
	private Properties properties_massa_CTFPTarifa02;
	private Properties properties_massa_CTCancelamentoTotalPedido;
	private Properties properties_massa_CT55;
	private Properties properties_massa_CT62;
	private Properties properties_massa_AlterarContratoCA;
	private Properties properties_massa_ConsultarContratoCA;
	private Properties properties_massa_PedidoCA;
	private Properties properties_massa_AgenteVendedor;
	private Properties properties_massa_AlterarInterlocutor;
	private Properties properties_massa_ConsultarBoletoCA;
	private Properties properties_massa_ConsultarBoleto;
	private Properties properties_massa_ManterFuncoes;
	private Properties properties_massa_ManterCartao;
	private Properties properties_massa_CTCancelamento01;
	private Properties properties_massa_CTCancelamento02;
	private Properties properties_massa_CTCancelamento03;
	private Properties properties_massa_CTCancelamento04;
	private Properties properties_massa_CTCancelamento05;
	private Properties properties_massa_CTCancelamento06;
	private Properties properties_massa_CTBloqueioCartaoCA;
	private Properties properties_massa_CTAjusteManual;
	private Properties properties_massa_CTConsultaPerfil;
	private Properties properties_massa_CTAlterarDataDisponibilizacao;
	private Properties properties_massa_CTAlterarDataDisponibilizacao_pedido;
	private Properties properties_massa_CTDesbloqueioCartaoLoteCA;
	private Properties properties_massa_CTLiberarPedido;
	private Properties properties_massa_CTCancelamentoTransacao;
	private Properties properties_massa_CancelamentoContrato01;
	private Properties properties_massa_CTReemissaoCartaoContratoAlterado;
	private Properties properties_massa_CTEvento01;
	private Properties properties_massa_NovoContrato;
	private Properties properties_massa_PedidoAN;
	private Properties properties_massa_AlterarEmpresa;
	private Properties properties_massa_AjusteTransacao;
	private Properties properties_massa_IncluirTransacao;
	private Properties properties_massa_IncluirLimiteCredito;

	public ConfigFileReader() {

		try {
			BufferedReader readerProperties = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(readerProperties);
				readerProperties.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTFilial = new BufferedReader(
					new FileReader(dataCTFilial_PropertyFilePath));
			properties_massa_CTFilial = new Properties();
			try {
				properties_massa_CTFilial.load(readerProperties_massa_CTFilial);
				readerProperties_massa_CTFilial.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTFilial_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTIncluirFilial = new BufferedReader(
					new FileReader(dataCTIncluirFilial_PropertyFilePath));
			properties_massa_CTIncluirFilial = new Properties();
			try {
				properties_massa_CTIncluirFilial.load(readerProperties_massa_CTIncluirFilial);
				readerProperties_massa_CTIncluirFilial.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTIncluirFilial_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTEmpresa01 = new BufferedReader(
					new FileReader(dataCTEmpresa01_PropertyFilePath));
			properties_massa_CTEmpresa01 = new Properties();
			try {
				properties_massa_CTEmpresa01.load(readerProperties_massa_CTEmpresa01);
				readerProperties_massa_CTEmpresa01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTEmpresa01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTEmpresa02 = new BufferedReader(
					new FileReader(dataCTEmpresa02_PropertyFilePath));
			properties_massa_CTEmpresa02 = new Properties();
			try {
				properties_massa_CTEmpresa02.load(readerProperties_massa_CTEmpresa02);
				readerProperties_massa_CTEmpresa02.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTEmpresa02_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTInterlocutor01 = new BufferedReader(
					new FileReader(dataCTInterlocutor01_PropertyFilePath));
			properties_massa_CTInterlocutor01 = new Properties();
			try {
				properties_massa_CTInterlocutor01.load(readerProperties_massa_CTInterlocutor01);
				readerProperties_massa_CTInterlocutor01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTInterlocutor01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTInterlocutor02 = new BufferedReader(
					new FileReader(dataCTInterlocutor02_PropertyFilePath));
			properties_massa_CTInterlocutor02 = new Properties();
			try {
				properties_massa_CTInterlocutor02.load(readerProperties_massa_CTInterlocutor02);
				readerProperties_massa_CTInterlocutor02.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTInterlocutor02_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTEmpresa01 = new BufferedReader(
					new FileReader(dataCTEmpresa01_PropertyFilePath));
			properties_massa_CTEmpresa01 = new Properties();
			try {
				properties_massa_CTEmpresa01.load(readerProperties_massa_CTEmpresa01);
				readerProperties_massa_CTEmpresa01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTEmpresa01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CT52 = new BufferedReader(new FileReader(dataCT52_PropertyFilePath));
			properties_massa_CT52 = new Properties();
			try {
				properties_massa_CT52.load(readerProperties_massa_CT52);
				readerProperties_massa_CT52.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCT52_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTContrato01 = new BufferedReader(
					new FileReader(dataCTContrato01_PropertyFilePath));
			properties_massa_CTContrato01 = new Properties();
			try {
				properties_massa_CTContrato01.load(readerProperties_massa_CTContrato01);
				readerProperties_massa_CTContrato01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTContrato01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTContrato02 = new BufferedReader(
					new FileReader(dataCTContrato02_PropertyFilePath));
			properties_massa_CTContrato02 = new Properties();
			try {
				properties_massa_CTContrato02.load(readerProperties_massa_CTContrato02);
				readerProperties_massa_CTContrato02.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTContrato02_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCobranca01 = new BufferedReader(
					new FileReader(dataCTCobranca01_PropertyFilePath));
			properties_massa_CTCobranca01 = new Properties();
			try {
				properties_massa_CTCobranca01.load(readerProperties_massa_CTCobranca01);
				readerProperties_massa_CTCobranca01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCobranca01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCartao01 = new BufferedReader(
					new FileReader(dataCTCartao01_PropertyFilePath));
			properties_massa_CTCartao01 = new Properties();
			try {
				properties_massa_CTCartao01.load(readerProperties_massa_CTCartao01);
				readerProperties_massa_CTCartao01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCartao01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTExtrato01 = new BufferedReader(
					new FileReader(dataCTExtrato01_PropertyFilePath));
			properties_massa_CTExtrato01 = new Properties();
			try {
				properties_massa_CTExtrato01.load(readerProperties_massa_CTExtrato01);
				readerProperties_massa_CTExtrato01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTExtrato01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTPesquisaAjusteFinanceiro = new BufferedReader(
					new FileReader(dataCTPesquisaAjusteFinanceiro_PropertyFilePath));
			properties_massa_CTPesquisaAjusteFinanceiro = new Properties();
			try {
				properties_massa_CTPesquisaAjusteFinanceiro.load(readerProperties_massa_CTPesquisaAjusteFinanceiro);
				readerProperties_massa_CTPesquisaAjusteFinanceiro.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTPesquisaAjusteFinanceiro_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTAtender01 = new BufferedReader(
					new FileReader(dataCTAtender01_PropertyFilePath));
			properties_massa_CTAtender01 = new Properties();
			try {
				properties_massa_CTAtender01.load(readerProperties_massa_CTAtender01);
				readerProperties_massa_CTAtender01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTAtender01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTAtender02 = new BufferedReader(
					new FileReader(dataCTAtender02_PropertyFilePath));
			properties_massa_CTAtender02 = new Properties();
			try {
				properties_massa_CTAtender02.load(readerProperties_massa_CTAtender02);
				readerProperties_massa_CTAtender02.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTAtender02_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTAtender03 = new BufferedReader(
					new FileReader(dataCTAtender03_PropertyFilePath));
			properties_massa_CTAtender03 = new Properties();
			try {
				properties_massa_CTAtender03.load(readerProperties_massa_CTAtender03);
				readerProperties_massa_CTAtender03.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTAtender03_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTFPTarifa01 = new BufferedReader(
					new FileReader(dataCTFPTarifa01_PropertyFilePath));
			properties_massa_CTFPTarifa01 = new Properties();
			try {
				properties_massa_CTFPTarifa01.load(readerProperties_massa_CTFPTarifa01);
				readerProperties_massa_CTFPTarifa01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTFPTarifa01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTFPTarifa02 = new BufferedReader(
					new FileReader(dataCTFPTarifa02_PropertyFilePath));
			properties_massa_CTFPTarifa02 = new Properties();
			try {
				properties_massa_CTFPTarifa02.load(readerProperties_massa_CTFPTarifa02);
				readerProperties_massa_CTFPTarifa02.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTFPTarifa02_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamentoTotalPedido = new BufferedReader(
					new FileReader(dataCTCancelamentoTotalPedido_PropertyFilePath));
			properties_massa_CTCancelamentoTotalPedido = new Properties();
			try {
				properties_massa_CTCancelamentoTotalPedido.load(readerProperties_massa_CTCancelamentoTotalPedido);
				readerProperties_massa_CTCancelamentoTotalPedido.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamentoTotalPedido_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CT55 = new BufferedReader(new FileReader(dataCT55_PropertyFilePath));
			properties_massa_CT55 = new Properties();
			try {
				properties_massa_CT55.load(readerProperties_massa_CT55);
				readerProperties_massa_CT55.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCT55_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CT62 = new BufferedReader(new FileReader(dataCT62_PropertyFilePath));
			properties_massa_CT62 = new Properties();
			try {
				properties_massa_CT62.load(readerProperties_massa_CT62);
				readerProperties_massa_CT62.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCT62_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_AlterarContratoCA = new BufferedReader(
					new FileReader(dataAlterarContratoCA_PropertyFilePath));
			properties_massa_AlterarContratoCA = new Properties();
			try {
				properties_massa_AlterarContratoCA.load(readerProperties_massa_AlterarContratoCA);
				readerProperties_massa_AlterarContratoCA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataAlterarContratoCA_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_ConsultarContratoCA = new BufferedReader(
					new FileReader(dataConsultarContratoCA_PropertyFilePath));
			properties_massa_ConsultarContratoCA = new Properties();
			try {
				properties_massa_ConsultarContratoCA.load(readerProperties_massa_ConsultarContratoCA);
				readerProperties_massa_ConsultarContratoCA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataConsultarContratoCA_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_PedidoCA = new BufferedReader(
					new FileReader(dataPedidoCA_PropertyFilePath));
			properties_massa_PedidoCA = new Properties();
			try {
				properties_massa_PedidoCA.load(readerProperties_massa_PedidoCA);
				readerProperties_massa_PedidoCA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataPedidoCA_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_AgenteVendedor = new BufferedReader(
					new FileReader(dataAgenteVendedor_PropertyFilePath));
			properties_massa_AgenteVendedor = new Properties();
			try {
				properties_massa_AgenteVendedor.load(readerProperties_massa_AgenteVendedor);
				readerProperties_massa_AgenteVendedor.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataAgenteVendedor_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_AlterarInterlocutor = new BufferedReader(
					new FileReader(dataAlterarInterlocutor_PropertyFilePath));
			properties_massa_AlterarInterlocutor = new Properties();
			try {
				properties_massa_AlterarInterlocutor.load(readerProperties_massa_AlterarInterlocutor);
				readerProperties_massa_AlterarInterlocutor.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataAlterarInterlocutor_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_ConsultarBoletoCA = new BufferedReader(
					new FileReader(dataConsultarBoletoCA_PropertyFilePath));
			properties_massa_ConsultarBoletoCA = new Properties();
			try {
				properties_massa_ConsultarBoletoCA.load(readerProperties_massa_ConsultarBoletoCA);
				readerProperties_massa_ConsultarBoletoCA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataConsultarBoletoCA_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_ConsultarBoleto = new BufferedReader(
					new FileReader(dataConsultarBoleto_PropertyFilePath));
			properties_massa_ConsultarBoleto = new Properties();
			try {
				properties_massa_ConsultarBoleto.load(readerProperties_massa_ConsultarBoleto);
				readerProperties_massa_ConsultarBoleto.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataConsultarBoleto_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_ManterFuncoes = new BufferedReader(
					new FileReader(dataManterFuncoes_PropertyFilePath));
			properties_massa_ManterFuncoes = new Properties();
			try {
				properties_massa_ManterFuncoes.load(readerProperties_massa_ManterFuncoes);
				readerProperties_massa_ManterFuncoes.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataManterFuncoes_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_ManterCartao = new BufferedReader(
					new FileReader(dataManterCartao_PropertyFilePath));
			properties_massa_ManterCartao = new Properties();
			try {
				properties_massa_ManterCartao.load(readerProperties_massa_ManterCartao);
				readerProperties_massa_ManterCartao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataManterCartao_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamento01 = new BufferedReader(
					new FileReader(dataCTCancelamento01_PropertyFilePath));
			properties_massa_CTCancelamento01 = new Properties();
			try {
				properties_massa_CTCancelamento01.load(readerProperties_massa_CTCancelamento01);
				readerProperties_massa_CTCancelamento01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamento01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamento02 = new BufferedReader(
					new FileReader(dataCTCancelamento02_PropertyFilePath));
			properties_massa_CTCancelamento02 = new Properties();
			try {
				properties_massa_CTCancelamento02.load(readerProperties_massa_CTCancelamento02);
				readerProperties_massa_CTCancelamento02.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamento02_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamento03 = new BufferedReader(
					new FileReader(dataCTCancelamento03_PropertyFilePath));
			properties_massa_CTCancelamento03 = new Properties();
			try {
				properties_massa_CTCancelamento03.load(readerProperties_massa_CTCancelamento03);
				readerProperties_massa_CTCancelamento03.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamento03_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamento04 = new BufferedReader(
					new FileReader(dataCTCancelamento04_PropertyFilePath));
			properties_massa_CTCancelamento04 = new Properties();
			try {
				properties_massa_CTCancelamento04.load(readerProperties_massa_CTCancelamento04);
				readerProperties_massa_CTCancelamento04.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamento04_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamento05 = new BufferedReader(
					new FileReader(dataCTCancelamento05_PropertyFilePath));
			properties_massa_CTCancelamento05 = new Properties();
			try {
				properties_massa_CTCancelamento05.load(readerProperties_massa_CTCancelamento05);
				readerProperties_massa_CTCancelamento05.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamento05_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamento06 = new BufferedReader(
					new FileReader(dataCTCancelamento06_PropertyFilePath));
			properties_massa_CTCancelamento06 = new Properties();
			try {
				properties_massa_CTCancelamento06.load(readerProperties_massa_CTCancelamento06);
				readerProperties_massa_CTCancelamento06.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamento06_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTBloqueioCartaoCA = new BufferedReader(
					new FileReader(dataCTBloqueioCartaoCA_PropertyFilePath));
			properties_massa_CTBloqueioCartaoCA = new Properties();
			try {
				properties_massa_CTBloqueioCartaoCA.load(readerProperties_massa_CTBloqueioCartaoCA);
				readerProperties_massa_CTBloqueioCartaoCA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTBloqueioCartaoCA_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTAjusteManual = new BufferedReader(
					new FileReader(dataCTAjusteManual_PropertyFilePath));
			properties_massa_CTAjusteManual = new Properties();
			try {
				properties_massa_CTAjusteManual.load(readerProperties_massa_CTAjusteManual);
				readerProperties_massa_CTAjusteManual.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTAjusteManual_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTAlterarDataDisponibilizacao = new BufferedReader(
					new FileReader(dataCTAlterarDataDisponibilizacao_PropertyFilePath));
			properties_massa_CTAlterarDataDisponibilizacao = new Properties();
			try {
				properties_massa_CTAlterarDataDisponibilizacao
						.load(readerProperties_massa_CTAlterarDataDisponibilizacao);
				readerProperties_massa_CTAlterarDataDisponibilizacao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTAlterarDataDisponibilizacao_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTConsultaPerfil = new BufferedReader(
					new FileReader(dataCTConsultaPerfil_PropertyFilePath));
			properties_massa_CTConsultaPerfil = new Properties();
			try {
				properties_massa_CTConsultaPerfil.load(readerProperties_massa_CTConsultaPerfil);
				readerProperties_massa_CTConsultaPerfil.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTConsultaPerfil_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTAlterarDataDisponibilizacao_pedido = new BufferedReader(
					new FileReader(dataCTAlterarDataDisponibilizacao_pedidoPropertyFilePath));
			properties_massa_CTAlterarDataDisponibilizacao_pedido = new Properties();
			try {
				properties_massa_CTAlterarDataDisponibilizacao_pedido
						.load(readerProperties_massa_CTAlterarDataDisponibilizacao_pedido);
				readerProperties_massa_CTAlterarDataDisponibilizacao_pedido.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTAlterarDataDisponibilizacao_pedidoPropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTDesbloqueioCartaoLoteCA = new BufferedReader(
					new FileReader(dataCTDesbloqueioCartaoLoteCAPropertyFilePath));
			properties_massa_CTDesbloqueioCartaoLoteCA = new Properties();
			try {
				properties_massa_CTDesbloqueioCartaoLoteCA.load(readerProperties_massa_CTDesbloqueioCartaoLoteCA);
				readerProperties_massa_CTDesbloqueioCartaoLoteCA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTDesbloqueioCartaoLoteCAPropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTLiberarPedido = new BufferedReader(
					new FileReader(dataCTLiberarPedidoPropertyFilePath));
			properties_massa_CTLiberarPedido = new Properties();
			try {
				properties_massa_CTLiberarPedido.load(readerProperties_massa_CTLiberarPedido);
				readerProperties_massa_CTLiberarPedido.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTLiberarPedidoPropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTCancelamentoTransacao = new BufferedReader(
					new FileReader(dataCTCancelamentoTransacaoPropertyFilePath));
			properties_massa_CTCancelamentoTransacao = new Properties();
			try {
				properties_massa_CTCancelamentoTransacao.load(readerProperties_massa_CTCancelamentoTransacao);
				readerProperties_massa_CTCancelamentoTransacao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCTCancelamentoTransacaoPropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CancelamentoContrato01 = new BufferedReader(
					new FileReader(dataCancelamentoContrato01_PropertyFilePath));
			properties_massa_CancelamentoContrato01 = new Properties();
			try {
				properties_massa_CancelamentoContrato01.load(readerProperties_massa_CancelamentoContrato01);
				readerProperties_massa_CancelamentoContrato01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataCancelamentoContrato01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTReemissaoCartaoContratoAlterado = new BufferedReader(
					new FileReader(CTReemissaoCartaoContratoAlterado_PropertyFilePath));
			properties_massa_CTReemissaoCartaoContratoAlterado = new Properties();
			try {
				properties_massa_CTReemissaoCartaoContratoAlterado
						.load(readerProperties_massa_CTReemissaoCartaoContratoAlterado);
				readerProperties_massa_CTReemissaoCartaoContratoAlterado.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ CTReemissaoCartaoContratoAlterado_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_CTEvento01 = new BufferedReader(
					new FileReader(CTEvento01_PropertyFilePath));
			properties_massa_CTEvento01 = new Properties();
			try {
				properties_massa_CTEvento01.load(readerProperties_massa_CTEvento01);
				readerProperties_massa_CTEvento01.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ CTEvento01_PropertyFilePath);
		}

		try {
			BufferedReader readerProperties_massa_NovoContrato = new BufferedReader(
					new FileReader(dataNovoContrato_PropertyFilePath));
			properties_massa_NovoContrato = new Properties();
			try {
				properties_massa_NovoContrato.load(readerProperties_massa_NovoContrato);
				readerProperties_massa_NovoContrato.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataNovoContrato_PropertyFilePath);
		}
		
		try {
			BufferedReader readerProperties_massa_AlterarEmpresa = new BufferedReader(
					new FileReader(dataAlterarEmpresa_PropertyFilePath));
			properties_massa_AlterarEmpresa = new Properties();
			try {
				properties_massa_AlterarEmpresa.load(readerProperties_massa_AlterarEmpresa);
				readerProperties_massa_AlterarEmpresa.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataAlterarEmpresa_PropertyFilePath);
		}
		
		try {
			BufferedReader readerProperties_massa_AjusteTransacao = new BufferedReader(
					new FileReader(dataAjusteTransacao_PropertyFilePath));
			properties_massa_AjusteTransacao = new Properties();
			try {
				properties_massa_AjusteTransacao.load(readerProperties_massa_AjusteTransacao);
				readerProperties_massa_AjusteTransacao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataAjusteTransacao_PropertyFilePath);
		}
		
		try {
			BufferedReader readerProperties_massa_IncluirTransacao = new BufferedReader(
					new FileReader(dataIncluirTransacao_PropertyFilePath));
			properties_massa_IncluirTransacao = new Properties();
			try {
				properties_massa_IncluirTransacao.load(readerProperties_massa_IncluirTransacao);
				readerProperties_massa_IncluirTransacao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataIncluirTransacao_PropertyFilePath);
		}
		
		
		

		try {
			BufferedReader readerProperties_massa_PedidoAN = new BufferedReader(
					new FileReader(CTPedidoAnalitico_PropertyFilePath));
			properties_massa_PedidoAN = new Properties();
			try {
				properties_massa_PedidoAN.load(readerProperties_massa_PedidoAN);
				readerProperties_massa_PedidoAN.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ CTPedidoAnalitico_PropertyFilePath);
		}
		
		try {
			BufferedReader readerProperties_massa_IncluirLimiteCredito = new BufferedReader(
					new FileReader(dataIncluirLimiteCredito_PropertyFilePath));
			properties_massa_IncluirLimiteCredito = new Properties();
			try {
				properties_massa_IncluirLimiteCredito.load(readerProperties_massa_IncluirLimiteCredito);
				readerProperties_massa_IncluirLimiteCredito.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: "
					+ dataIncluirLimiteCredito_PropertyFilePath);
		}
		

	}

	public String getReportConfigPath() {
		String caminho = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "extent-config.xml";
		new ConfigFileReader();
		return caminho;
	}

	public Properties massaCorretaParaTeste() {
		String teste = BaseTest.testName;

		switch (teste) {
		case "C36019370 Consulta de Empresa":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "CTInterlocutor01 Inclusão de Interlocutor":
			properties_massa = properties_massa_CTInterlocutor01;
			break;
		case "CTInterlocutor02 Consulta de Interlocutor":
			properties_massa = properties_massa_CTInterlocutor02;
			break;
		case "C33097845 Incluir Limite de Crédito Empresa - PAT":
			properties_massa = properties_massa_IncluirLimiteCredito;
			break;
		case "CT52 Incluir saldo em um cartão no FVS":
			properties_massa = properties_massa_CT52;
			break;
		case "C36013422 Consulta de Contrato":
			properties_massa = properties_massa_CTContrato01;
			break;
		case "C36018832 Alteração de Contrato":
			properties_massa = properties_massa_CTContrato02;
			break;
		case "C35900901 Consulta de Cobrança":
			properties_massa = properties_massa_CTCobranca01;
			break;
		case "C35900952 Consultar Cartão":
			properties_massa = properties_massa_CTCartao01;
			break;
		case "C36013196 Consultar Extrato":
			properties_massa = properties_massa_CTExtrato01;
			break;
		case "C34412165 Consultar Extrato - Excel - PAT":
			properties_massa = properties_massa_CTExtrato01;
			break;
		case "Consultar Filial Posto de Trabalho":
			properties_massa = properties_massa_CTFilial;
			break;
		case "Associar Filiais ao Contrato":
			properties_massa = properties_massa_CTFilial;
			break;
		case "Incluir Filial Posto de Trabalho":
			properties_massa = properties_massa_CTEmpresa01;
			break;
		case "C14832237 Criação de Filial para Empresa no FVS":
			properties_massa = properties_massa_CTIncluirFilial;
			break;
		case "Pesquisar Ajustes Financeiros":
			properties_massa = properties_massa_CTPesquisaAjusteFinanceiro;
			break;
		case "CTAtender01 Atender Cliente - CAE":
			properties_massa = properties_massa_CTAtender01;
			break;
		case "CTAtender02 Atender Cliente - CAU":
			properties_massa = properties_massa_CTAtender02;
			break;
		case "CTAtender03 Atender Cliente - Premium":
			properties_massa = properties_massa_CTAtender03;
			break;
		case "C36045566 Consultar Manter Limite de Crédito":
			properties_massa = properties_massa_IncluirLimiteCredito;
			break;
		case "CTFPTarifa01 Faturar Tarifa de um Contrato":
			properties_massa = properties_massa_CTFPTarifa01;
			break;
		case "CTFPTarifa02 Perdoar Tarifa de um Contrato":
			properties_massa = properties_massa_CTFPTarifa02;
			break;
		case "C36045579 Validar informações na tela Acompanhamento de pedido no sistema FVS":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "Cancelamento Total de Pedido (Devolução)":
			properties_massa = properties_massa_CTCancelamentoTotalPedido;
			break;
		case "CT55 Reemissão de Cartão/Lote":
			properties_massa = properties_massa_CT55;
			break;
		case "C36013234 Consulta de Nota Fiscal-RPS - PAT - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "C33097791 Consulta de Nota Fiscal-RPS - Transporte - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "C33097798 Consulta de Nota Fiscal-RPS - PJ - Contexto Atendimento":
			properties_massa = properties_massa_CT62;
			break;
		case "C33097836 Alteração de Contrato - PAT - Contexto de Atendimento":
			properties_massa = properties_massa_AlterarContratoCA;
			break;
		case "C33097835 Alteração de Contrato - Transporte - Contexto de Atendimento":
			properties_massa = properties_massa_AlterarContratoCA;
			break;
		case "C33097829 Alteração de Contrato - PJ - Contexto de Atendimento":
			properties_massa = properties_massa_AlterarContratoCA;
			break;
		case "C33097801 Consulta de Contrato - PAT - Contexto de Atendimento":
			properties_massa = properties_massa_ConsultarContratoCA;
			break;
		case "C33097799 Consulta de Contrato - Transporte - Contexto de Atendimento":
			properties_massa = properties_massa_ConsultarContratoCA;
			break;
		case "C33097800 Consulta de Contrato - PJ - Contexto de Atendimento":
			properties_massa = properties_massa_ConsultarContratoCA;
			break;
		case "C35900899 Consultar cobrança - PAT - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "C35900900 Consultar cobrança - Transporte - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "CT65 Consultar cobrança - PJ - Contexto Atendimento":
			properties_massa = properties_massa_ConsultarContratoCA;
			break;
		case "C33097489 Pesquisar Ajustes Financeiros - PAT - Contexto Atendimento":
			properties_massa = properties_massa_CTPesquisaAjusteFinanceiro;
			break;
		case "C33097487 Pesquisar Ajustes Financeiros - Transporte - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "CTBoleto012 Consulta de Boleto - PAT - Contexto de Atendimento":
			properties_massa = properties_massa_ConsultarBoletoCA;
			break;
		case "CTBoleto012 Consulta de Boleto - Transporte - Contexto de Atendimento":
			properties_massa = properties_massa_ConsultarBoletoCA;
			break;
		case "CTBoleto012 Consulta de Boleto - PJ - Contexto de Atendimento":
			properties_massa = properties_massa_ConsultarBoletoCA;
			break;
		case "C33097477 Alterar Interlocutor - PAT":
			properties_massa = properties_massa_AlterarInterlocutor;
			break;
		case "C33097475 Alterar Interlocutor - Transporte":
			properties_massa = properties_massa_AlterarInterlocutor;
			break;
		case "C33097476 Alterar Interlocutor - PJ":
			properties_massa = properties_massa_AlterarInterlocutor;
			break;
		case "C33097451 Consulta de Boleto - PAT":
			properties_massa = properties_massa_ConsultarBoleto;
			break;
		case "C33097450 Consulta de Boleto - Transporte":
			properties_massa = properties_massa_ConsultarBoleto;
			break;
		case "C33097449 Consulta de Boleto - PJ":
			properties_massa = properties_massa_ConsultarBoleto;
			break;
		case "CTInterlocutor06 Manter Funções Interlocutor - PAT":
			properties_massa = properties_massa_ManterFuncoes;
			break;
		case "CTInterlocutor07 Manter Funções Interlocutor - Transporte":
			properties_massa = properties_massa_ManterFuncoes;
			break;
		case "CTInterlocutor08 Manter Funções Interlocutor - PJ":
			properties_massa = properties_massa_ManterFuncoes;
			break;
		case "C33097485 Pesquisar Ajustes Financeiros - PJ - Contexto Atendimento":
			properties_massa = properties_massa_CTPesquisaAjusteFinanceiro;
			break;
		case "C33097447 Manter Cartão - Desbloquear Cartão - PAT":
			properties_massa = properties_massa_ManterCartao;
			break;
		case "C33097445 Manter Cartão - Desbloquear Cartão - Transporte":
			properties_massa = properties_massa_ManterCartao;
			break;
		case "C33097446 Manter Cartão - Desbloquear Cartão - PJ":
			properties_massa = properties_massa_ManterCartao;
			break;
		case "C33097480 Bloqueio de cartão - Ação imediata - PAT - Contexto de Atendimento":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "C33097479 Bloqueio de cartão - Ação imediata - Transporte - Contexto de Atendimento":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "C33097478 Bloqueio de cartão - Ação imediata - PJ - Contexto de Atendimento":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "C33097825 Cancelamento Benefício Parcial - PAT":
			properties_massa = properties_massa_CTCancelamento01;
			break;
		case "C33097826 Cancelamento Benefício Parcial - Transporte":
			properties_massa = properties_massa_CTCancelamento02;
			break;
		case "C33097827 Cancelamento Benefício Parcial - PJ":
			properties_massa = properties_massa_CTCancelamento03;
			break;
		case "C33097807 Cancelamento Benefício Total - PAT":
			properties_massa = properties_massa_CTCancelamento04;
			break;
		case "C33097806 Cancelamento Benefício Total - Transporte":
			properties_massa = properties_massa_CTCancelamento05;
			break;
		case "C33097804 Cancelamento Benefício Total - PJ":
			properties_massa = properties_massa_CTCancelamento06;
			break;
		case "C33097431 Gerar Ajuste Manual para Empresa - Transporte":
			properties_massa = properties_massa_CTAjusteManual;
			break;
		case "C33097432 Consultar Perfil de Conta - Central de Atendimento - Transporte":
			properties_massa = properties_massa_CTConsultaPerfil;
			break;
		case "Alterar Data Disponibilização (Contexto de Atendimento) e Disponibilização OnLine - PAT":
			properties_massa = properties_massa_CTAlterarDataDisponibilizacao_pedido;
			break;
		case "Alterar Data Disponibilização (Contexto de Atendimento) e Disponibilização OnLine - Transporte":
			properties_massa = properties_massa_CTAlterarDataDisponibilizacao_pedido;
			break;
		case "T541563217 Alterar Data Disponibilização (Contexto de Atendimento) e Disponibilização OnLine - PJ":
			properties_massa = properties_massa_CTAlterarDataDisponibilizacao_pedido;
			break;
		case "C33097492 Desbloqueio do Cartão-Lote (Contexto de Atendimento) - PAT":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "C33097491 Desbloqueio do Cartão-Lote (Contexto de Atendimento) - Transporte":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "C33097490 Desbloqueio do Cartão-Lote (Contexto de Atendimento) - PJ":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "C33097526 Exportar Relatório de Empresa - Crédito de um Pedido - PAT - PDF":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C36020617 Exportar Relatório de Empresa - Crédito de um Pedido - PAT - EXCEL":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097493 Exportar Relatório de Empresa - Crédito de um Pedido - Transporte - PDF":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097525 Exportar Relatório de Empresa - Crédito de um Pedido - Transporte - EXCEL":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097482 Gerar Relatório Ajustes Financeiros - Transporte":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097481 Gerar Relatório Ajustes Financeiros - PAT":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C36045679 Gerar Relatório Ajustes Financeiros - PJ":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097789 Gerar Relatório de Apuração de ISS e IRRF - Transporte - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "Liberar Pedido - PAT":
			properties_massa = properties_massa_CTLiberarPedido;
			break;
		case "Liberar Pedido - Transporte":
			properties_massa = properties_massa_CTLiberarPedido;
			break;
		case "Liberar Pedido - PJ":
			properties_massa = properties_massa_CTLiberarPedido;
			break;
		case "Cancelamento da Transação - PAT":
			properties_massa = properties_massa_CTCancelamentoTransacao;
			break;
		case "CT69 Converter ajustes que estão para desconto em próxima fatura para carta de crédito - PAT":
			properties_massa = properties_massa_CTAjusteManual;
			break;
		case "CT70 Converter ajustes que estão para desconto em próxima fatura para carta de crédito - Transporte":
			properties_massa = properties_massa_CTAjusteManual;
			break;
		case "CT71 Converter ajustes que estão para desconto em próxima fatura para carta de crédito - PJ":
			properties_massa = properties_massa_CTAjusteManual;
			break;
		case "C33097790 Gerar Relatório de Apuração de ISS e IRRF - PAT - Contexto Atendimento":
			properties_massa = properties_massa_CTEmpresa02;
			break;
		case "C33097444 Incluir Agente Vendedor - PAT":
			properties_massa = properties_massa_AgenteVendedor;
			break;
		case "C33097443 Incluir Agente Vendedor - Transporte":
			properties_massa = properties_massa_AgenteVendedor;
			break;
		case "C33097442 Incluir Agente Vendedor - PJ":
			properties_massa = properties_massa_AgenteVendedor;
			break;
		case "C33097583 Consultar Pedido - PAT - Contexto de Atendimento":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097582 Consultar Pedido - Transporte - Contexto de Atendimento":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097581 Consultar Pedido - PJ - Contexto de Atendimento":
			properties_massa = properties_massa_PedidoCA;
			break;
		case "C33097437 Desbloqueio de Cartão - Ação Imediata - PJ":
			properties_massa = properties_massa_CTBloqueioCartaoCA;
			break;
		case "Cancelamento de Contrato - Contexto de Atendimento - Transporte":
			properties_massa = properties_massa_CancelamentoContrato01;
			break;
		case "C34412174 Reemissão de Cartão Contrato Alterado - Alimentação - PAT":
			properties_massa = properties_massa_CTReemissaoCartaoContratoAlterado;
			break;
		case "C34412176 Reemissão de Cartão Contrato Alterado - Refeição - PAT":
			properties_massa = properties_massa_CTReemissaoCartaoContratoAlterado;
			break;
		case "C34412175 Reemissão de Cartão Contrato Alterado - Multibenefícios - PAT":
			properties_massa = properties_massa_CTReemissaoCartaoContratoAlterado;
			break;
		case "C36045680 Inclusão de Evento via FVS - PJ":
			properties_massa = properties_massa_CTEvento01;
			break;
		case "C36019389 Novo Contrato e Pedido Refeição (Multiuso) CBSS - CPF Já Possui Alimentação (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "C36045654 Gerar Relatório de Empresa - Pedidos Analítico - PAT - PDF":
			properties_massa = properties_massa_PedidoAN;
		    break;
		case "C36045655 Gerar Relatório de Empresa - Pedidos Analítico - PAT - EXCEL":
			properties_massa = properties_massa_PedidoAN;
		    break;
		case "C36045656 Gerar Relatório de Empresa - Pedidos Analítico - PAT - HTML":
			properties_massa = properties_massa_PedidoAN;
		    break;
		case "C12785151 Alterar Empresa - PAT":
			properties_massa = properties_massa_AlterarEmpresa;
			break;
		case "C33097840 Inclusão de Interlocutor - PAT":
			properties_massa = properties_massa_AlterarEmpresa;
			break;
		case "T541563191 Consulta de Empresa - PJ":
			properties_massa = properties_massa_AlterarEmpresa;
			break;
		case "C36045683 Gerar Ajuste Manual para Empresa - PAT":
			properties_massa = properties_massa_CTAjusteManual;
			break;
		case "T541563163 Incluir ajuste de transação - PAT":
			properties_massa = properties_massa_AjusteTransacao;
			break;
		case "T541563166 Incluir transação - PAT":
			properties_massa = properties_massa_IncluirTransacao;
			break;
		case "C35900342 Novo Contrato e Pedido Refeição (Multiuso) CBSS - CPF Já Possui Alimentação e Multibenefícios (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "CTNovoContrato03 Novo Contrato e Pedido Refeição (Multiuso) CBSS - CPF Já Possui Multibenefícios (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "C35900344 Novo Contrato e Pedido Multibenefícios (Multiuso) Bradesco - CPF Já Possui Refeição (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "C35900360 Novo Contrato e Pedido Alimentação (Multiuso) Banco do Brasil - CPF Já Possui Refeição (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "C34412177 Novo Contrato e Pedido Alimentação (Multiuso) Banco do Brasil - CPF Já Possui Multibenefícios (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "C35900361 Novo Contrato e Pedido Alimentação (Multiuso) Banco do Brasil - CPF Já Possui Refeição e Multibenefícios (Mesmo Vendedor) - PAT":
			properties_massa = properties_massa_NovoContrato;
			break;
		case "C34412168 Consultar Extrato - Pdf - PAT":
			properties_massa = properties_massa_CTExtrato01;
			break;
		}

		return properties_massa;
	}

	public String getBrowserToRun() {
		String browser = properties.getProperty("browser");
		new ConfigFileReader();
		return browser;
	}

	public String getloginUAT() {
		String loginUAT = properties.getProperty("loginFVSUAT");
		new ConfigFileReader();
		return loginUAT;
	}

	public String getsenhaUAT() {
		String senhaUAT = properties.getProperty("senhaFVSUAT");
		new ConfigFileReader();
		return senhaUAT;
	}

	public String getAmbiente() {
		String ambiente = properties.getProperty("ambiente");
		new ConfigFileReader();
		return ambiente;
	}

	public String getPlataforma() {
		String plataforma = properties.getProperty("plataforma");
		new ConfigFileReader();
		return plataforma;
	}

	public String getHost_PP_FCS() {
		String host_PP = properties.getProperty("host_PP");
		new ConfigFileReader();
		return host_PP;
	}

	public String getHost_SIT_FCS() {
		String host_SIT = properties.getProperty("host_SIT");
		new ConfigFileReader();
		return host_SIT;
	}

	public String getPort_FCS() {
		String port = properties.getProperty("port");
		new ConfigFileReader();
		return port;
	}

	public String getUser_DB_FCS() {
		String user_DB = properties.getProperty("user_DB");
		new ConfigFileReader();
		return user_DB;
	}

	public String getPassword_DB_FCS() {
		String password_DB = properties.getProperty("password_DB");
		new ConfigFileReader();
		return password_DB;
	}

	public String getDB_PP_FCS() {
		String db_PP = properties.getProperty("db_PP");
		new ConfigFileReader();
		return db_PP;
	}

	public String getDB_SIT_FCS() {
		String db_SIT = properties.getProperty("db_SIT");
		new ConfigFileReader();
		return db_SIT;
	}

	public String getPP_FVS_ALELO() {
		String ppFVS_ALELO = properties.getProperty("PP_FVS_ALELO");
		new ConfigFileReader();
		return ppFVS_ALELO;
	}

	public String getSIT_FVS_ALELO() {
		String sitFVS_ALELO = properties.getProperty("SIT_FVS_ALELO");
		new ConfigFileReader();
		return sitFVS_ALELO;
	}

	public String getUAT_FVS_ALELO() {
		String UATFVS_ALELO = properties.getProperty("UAT_FVS_ALELO");
		new ConfigFileReader();
		return UATFVS_ALELO;
	}

	public String getTeste() {
		String teste = properties_massa.getProperty("teste");
		new ConfigFileReader();
		return teste;
	}

	public String getloginSIT() {
		String loginSIT = properties.getProperty("loginFVSSIT");
		new ConfigFileReader();
		return loginSIT;
	}

	public String getsenhaSIT() {
		String senhaSIT = properties.getProperty("senhaFVSSIT");
		new ConfigFileReader();
		return senhaSIT;
	}

	public String getloginPP() {
		String loginUAT = properties.getProperty("loginFVSPP");
		new ConfigFileReader();
		return loginUAT;
	}

	public String getsenhaPP() {
		String senhaPP = properties.getProperty("senhaFVSPP");
		new ConfigFileReader();
		return senhaPP;
	}

	public String getTemNamespace() {
		String temNamespace = properties.getProperty("temNamespace");
		new ConfigFileReader();
		return temNamespace;
	}

	public String getTemURI() {
		String temURI = properties.getProperty("temNamespaceURI");
		new ConfigFileReader();
		return temURI;
	}

	public String getTeste_config() {
		String teste_config = properties.getProperty("teste_config");
		new ConfigFileReader();
		return teste_config;
	}

	public String getProduto() {
		String produto = properties.getProperty("produto");
		new ConfigFileReader();
		return produto;
	}

	// TESTE
	public String getNumero_cartao() {
		String num_cartao = properties_massa.getProperty("numero_cartao");
		new ConfigFileReader();
		return num_cartao;
	}

	public String getCpf() {
		String cpf = properties_massa.getProperty("cpf");
		new ConfigFileReader();
		return cpf;
	}

	public String getNome_completo() {
		String nome = properties_massa.getProperty("nome_completo");
		new ConfigFileReader();
		return nome;
	}

	public String getConta_pagamento() {
		String conta = properties_massa.getProperty("conta_pagamento");
		new ConfigFileReader();
		return conta;
	}

	public String getAgencia() {
		String agencia = properties_massa.getProperty("agencia");
		new ConfigFileReader();
		return agencia;
	}

	public String getConta() {
		String conta = properties_massa.getProperty("conta");
		new ConfigFileReader();
		return conta;
	}

	public String getDigito() {
		String digito = properties_massa.getProperty("digito");
		new ConfigFileReader();
		return digito;
	}

	public String getContrato() {
		String contrato = properties_massa.getProperty("contrato");
		new ConfigFileReader();
		return contrato;
	}

	public String getNumero_lote() {
		String num_lote = properties_massa.getProperty("numero_lote");
		new ConfigFileReader();
		return num_lote;
	}

	public String getSaldo() {
		String saldo = properties_massa.getProperty("saldo");
		new ConfigFileReader();
		return saldo;
	}

	public String getData_pedido() {
		String data_pedido = properties_massa.getProperty("data_pedido");
		new ConfigFileReader();
		return data_pedido;
	}

	public String getStatus() {
		String status = properties_massa.getProperty("status");
		new ConfigFileReader();
		return status;
	}

	public String getProxy() {
		String proxy = properties_massa.getProperty("proxy");
		new ConfigFileReader();
		return proxy;
	}

	public String getValorCargaTela() {
		String valor = properties_massa.getProperty("valorCargaTela");
		new ConfigFileReader();
		return valor;
	}

	public String getValorCargaServico() {
		String valor = properties_massa.getProperty("valorCargaServico");
		new ConfigFileReader();
		return valor;
	}

	public String getCpfFavorecido() {
		String cpfFav = properties_massa.getProperty("cpf_favorecido");
		new ConfigFileReader();
		return cpfFav;
	}

	public String getIdBulk() {
		String id = properties_massa.getProperty("id_bulk");
		new ConfigFileReader();
		return id;
	}

	public String getCNPJFilial() {
		String cnpj = properties_massa.getProperty("radical_cnpj");
		new ConfigFileReader();
		return cnpj;
	}

	public String getCNPJEmpresa() {
		String cnpj = properties_massa.getProperty("cnpj_empresa");
		new ConfigFileReader();
		return cnpj;
	}

	public String getCNPJIncluirFilial() {
		String cnpjFilial = properties_massa.getProperty("cnpj_filial");
		new ConfigFileReader();
		return cnpjFilial;
	}

	public String getSenhaLogin() {
		String senha = properties_massa.getProperty("senha_login");
		new ConfigFileReader();
		return senha;
	}

	public String getAmbiente_FCS() {
		String ambiente_fcs = properties.getProperty("ambiente_FCS");
		new ConfigFileReader();
		return ambiente_fcs;
	}

	public String getValorLctoFVS() {
		String tela = properties_massa.getProperty("valor_lancamento_FVS");
		new ConfigFileReader();
		return tela;
	}

	public String getValorLctoEmReais() {
		String reais = properties_massa.getProperty("valor_lancamento_reais");
		new ConfigFileReader();
		return reais;
	}

	public String getCanalComunicacao() {
		String canalComunicacao = properties.getProperty("canal_comunicacao");
		new ConfigFileReader();
		return canalComunicacao;
	}

	public String getCanalEntrada() {
		String canalEntrada = properties.getProperty("canal_entrada");
		new ConfigFileReader();
		return canalEntrada;
	}

	public String getInstituicao() {
		String instituicao = properties.getProperty("instituicao");
		new ConfigFileReader();
		return instituicao;
	}

	public String getProdutoGondola() {
		String produto = properties.getProperty("produto_gondola");
		new ConfigFileReader();
		return produto;
	}

	public String getValorParcialChargeback() {
		String valor = properties_massa.getProperty("valor_parcial");
		new ConfigFileReader();
		return valor;
	}

	public String getDataInicio() {
		String inicio = properties_massa.getProperty("data_inicio");
		new ConfigFileReader();
		return inicio;
	}

	public String getDataFim() {
		String fim = properties_massa.getProperty("data_fim");
		new ConfigFileReader();
		return fim;
	}

	public String getStatusEvento() {
		String status = properties_massa.getProperty("status");
		new ConfigFileReader();
		return status;
	}

	public String getClasseEvento() {
		String classe = properties_massa.getProperty("classe");
		new ConfigFileReader();
		return classe;
	}

	public String getPrioridadeEvento() {
		String prioridade = properties_massa.getProperty("prioridade");
		new ConfigFileReader();
		return prioridade;
	}

	public String getPrazoSolucaoEvento() {
		String prazo_solucao = properties_massa.getProperty("prazo_solucao");
		new ConfigFileReader();
		return prazo_solucao;
	}

	public String getPrazoGuardaEvento() {
		String prazo_guarda = properties_massa.getProperty("prazo_guarda");
		new ConfigFileReader();
		return prazo_guarda;
	}

	public String getMacroProcessoEvento() {
		String macroProcesso = properties_massa.getProperty("macro_processo");
		new ConfigFileReader();
		return macroProcesso;
	}

	public String getDependenciaEvento() {
		String dependencia = properties_massa.getProperty("dependencia");
		new ConfigFileReader();
		return dependencia;
	}

	public String getFollowUpEvento() {
		String follow_up = properties_massa.getProperty("follow_up");
		new ConfigFileReader();
		return follow_up;
	}

	public String getCartao() { // ALELO
		String cartao = properties_massa.getProperty("cartao");
		new ConfigFileReader();
		return cartao;
	}

	public String getCartaoPat() { // ALELO
		String cartao = properties_massa.getProperty("cartao_pat");
		new ConfigFileReader();
		return cartao;
	}

	public String getCartaoTransporte() { // ALELO
		String cartao = properties_massa.getProperty("cartao_transporte");
		new ConfigFileReader();
		return cartao;
	}

	public String getCartaoPJ() { // ALELO
		String cartao = properties_massa.getProperty("cartao_pj");
		new ConfigFileReader();
		return cartao;
	}

	public String getArLote() {
		String arLote = properties_massa.getProperty("ar_lote");
		new ConfigFileReader();
		return arLote;
	}

	public String getArMestre() {
		String arMestre = properties_massa.getProperty("ar_mestre");
		new ConfigFileReader();
		return arMestre;
	}

	public String getBanco() {
		String banco = properties_massa.getProperty("banco");
		new ConfigFileReader();
		return banco;
	}

	public String getValor() {
		String valor = properties_massa.getProperty("valor");
		new ConfigFileReader();
		return valor;
	}

	public String getContratoPAT() {
		String contrato = properties_massa.getProperty("contrato_pat");
		new ConfigFileReader();
		return contrato;
	}

	public String getContratoTransporte() {
		String contrato = properties_massa.getProperty("contrato_transporte");
		new ConfigFileReader();
		return contrato;
	}

	public String getContratoPJ() {
		String contrato = properties_massa.getProperty("contrato_pj");
		new ConfigFileReader();
		return contrato;
	}

	public String getContratoRefeicao() {
		String contrato = properties_massa.getProperty("contrato_refeicao");
		new ConfigFileReader();
		return contrato;
	}

	public String getContratoMultibeneficio() {
		String contrato = properties_massa.getProperty("contrato_multibeneficio");
		new ConfigFileReader();
		return contrato;
	}

	public String getCpfInterlocutorAuto() {
		String cpf = properties_massa.getProperty("cpf_transporte");
		new ConfigFileReader();
		return cpf;
	}

	public String getCpfInterlocutorPJ() {
		String cpf = properties_massa.getProperty("cpf_pj");
		new ConfigFileReader();
		return cpf;
	}

	public String getCpfInterlocutorPAT() {
		String cpf = properties_massa.getProperty("cpf_pat");
		new ConfigFileReader();
		return cpf;
	}

	public String getCNPJEmpresaPAT() {
		String cnpj = properties_massa.getProperty("cnpj_pat");
		new ConfigFileReader();
		return cnpj;
	}

	public String getCNPJEmpresaTransporte() {
		String cnpj = properties_massa.getProperty("cnpj_transporte");
		new ConfigFileReader();
		return cnpj;
	}

	public String getCNPJEmpresaPJ() {
		String cnpj = properties_massa.getProperty("cnpj_pj");
		new ConfigFileReader();
		return cnpj;
	}

	public String getPsNamespace() {
		String psNamespace = properties.getProperty("psNamespace");
		new ConfigFileReader();
		return psNamespace;
	}
	
	public String getPsNamespace_MaintenanceBranch() {
		String psNamespace_MaintenanceBranch = properties.getProperty("psNamespace_MaintenanceBranch");
		new ConfigFileReader();
		return psNamespace_MaintenanceBranch;
	}

	public String getPsURI() {
		String psURI = properties.getProperty("psNamespaceURI");
		new ConfigFileReader();
		return psURI;
	}
	
	public String getPsURI_MaintenanceBranch() {
		String psURI_MaintenanceBranch = properties.getProperty("psNamespaceURI_MaintenanceBranch");
		new ConfigFileReader();
		return psURI_MaintenanceBranch;
	}

	public String getPs1Namespace() {
		String psNamespace = properties.getProperty("ps1Namespace");
		new ConfigFileReader();
		return psNamespace;
	}

	public String getPs1URI() {
		String ps1URI = properties.getProperty("ps1NamespaceURI");
		new ConfigFileReader();
		return ps1URI;
	}

	public String getPsURI_GetBranches() {
		String psURI_GetBranches = properties.getProperty("psNamespaceURI_GetBranches");
		new ConfigFileReader();
		return psURI_GetBranches;
	}	

	public String getEndpointPPPJ() {
		String endpoint = properties.getProperty("endpoint_PP_PJ");
		new ConfigFileReader();
		return endpoint;
	}
	
	public String getEndpointUATPJ() {
		String endpoint = properties.getProperty("endpoint_UAT_PJ");
		new ConfigFileReader();
		return endpoint;
	}

	public String getPedido() {
		String pedido = properties_massa.getProperty("pedido");
		new ConfigFileReader();
		return pedido;
	}

	public String getPedidoPJ() {
		String pedido = properties_massa.getProperty("pedido_pj");
		new ConfigFileReader();
		return pedido;
	}

	public String getDataDisponibilizacao() {
		String dataDisponibilizacao = properties_massa.getProperty("dataDisponibilizacao");
		new ConfigFileReader();
		return dataDisponibilizacao;
	}

	public String getURA() {
		String sitURA = properties.getProperty("URA");
		new ConfigFileReader();
		return sitURA;
	}

	public String getDataDisp() {
		String dataDisp = properties_massa.getProperty("dataDisp");
		new ConfigFileReader();
		return dataDisp;
	}

	public String getMesAno() {
		String mesAno = properties_massa.getProperty("mesAno");
		new ConfigFileReader();
		return mesAno;
	}

	public String getUsuario() {
		String usuario = properties_massa.getProperty("usuario");
		new ConfigFileReader();
		return usuario;
	}

	public String getNomeEmbossing() {
		String nomeEmbossing = properties_massa.getProperty("nomeEmbossing");
		new ConfigFileReader();
		return nomeEmbossing;
	}

	public String getDataNascimento() {
		String dataNascimento = properties_massa.getProperty("dataNascimento");
		new ConfigFileReader();
		return dataNascimento;
	}

	public String getValorDisp() {
		String valorDisp = properties_massa.getProperty("valorDisp");
		new ConfigFileReader();
		return valorDisp;
	}

	public String getEmpDest() {
		String empDestino = properties_massa.getProperty("empDestino");
		new ConfigFileReader();
		return empDestino;
	}

	public String getQuantidadeFiliais() {
		String qtdadeFiliais = properties_massa.getProperty("quantidadeFiliais");
		new ConfigFileReader();
		return qtdadeFiliais;
	}

	public String getQuantidadeFuncionarios() {
		String qtdadeFuncionarios = properties_massa.getProperty("quantidadeFuncionarios");
		new ConfigFileReader();
		return qtdadeFuncionarios;
	}

	public String getValorMedioBeneficios() {
		String valorMedioBeneficios = properties_massa.getProperty("valorMedioBeneficios");
		new ConfigFileReader();
		return valorMedioBeneficios;
	}

	public String getInterlocutor() {
		String interlocutor = properties_massa.getProperty("interlocutor");
		new ConfigFileReader();
		return interlocutor;
	}

	public String getCnpjFilial() {
		String cnpjCompleto_pat = properties_massa.getProperty("cnpjCompleto_pat");
		new ConfigFileReader();
		return cnpjCompleto_pat;
	}

	public String getEmbossing() {
		String embossing = properties_massa.getProperty("nomeEmbossing");
		new ConfigFileReader();
		return embossing;
	}

	public String getPayNamespace() {
		String payNamespace = properties.getProperty("payNamespace");
		new ConfigFileReader();
		return payNamespace;
	}

	public String getPayURI() {
		String payURI = properties.getProperty("payURI");
		new ConfigFileReader();
		return payURI;
	}

	public String getEndpointPPTransporte() {
		String endpoint = properties.getProperty("endpoint_PP_Transporte");
		new ConfigFileReader();
		return endpoint;
	}
	
	public String getContaPAT() {
		String conta = properties_massa.getProperty("numero_conta_pat");
		new ConfigFileReader();
		return conta;
	}
	
	public String getContaTransporte() {
		String conta = properties_massa.getProperty("numero_conta_transporte");
		new ConfigFileReader();
		return conta;
	}
	
	public String getContaPJ() {
		String conta = properties_massa.getProperty("numero_conta_pj");
		new ConfigFileReader();
		return conta;
	}
	
	public String getNumeroEstabelecimentoPAT() {
		String num_estab = properties_massa.getProperty("numero_estabelecimento_pat");
		new ConfigFileReader();
		return num_estab;
	}
	
	public String getNumeroEstabelecimentoTransporte() {
		String num_estab = properties_massa.getProperty("numero_estabelecimento_transporte");
		new ConfigFileReader();
		return num_estab;
	}
	
	public String getNumeroEstabelecimentoPJ() {
		String num_estab = properties_massa.getProperty("numero_estabelecimento_pj");
		new ConfigFileReader();
		return num_estab;
	}
	
	public String getEndpointPPPAT() {
		String endpoint = properties.getProperty("endpoint_PP_PAT");
		new ConfigFileReader();
		return endpoint;
	}
	
	public String getEndpointUATPAT() {
		String endpoint = properties.getProperty("endpoint_UAT_PAT");
		new ConfigFileReader();
		return endpoint;
	}
	
	public String getEndpointUATTransporte() {
		String endpoint = properties.getProperty("endpoint_UAT_Transporte");
		new ConfigFileReader();
		return endpoint;
	}
	
	public String getPsNamespaceURI_LegalPersonWebServices_Request() {
		String psNamespaceURI_LegalPersonWebServices_Request = properties.getProperty("psNamespaceURI_LegalPersonWebServices_Request");
		new ConfigFileReader();
		return psNamespaceURI_LegalPersonWebServices_Request;
	}
	
	public String getEndpointCelcoin() {
		String endpoint = properties.getProperty("endpoint_Celcoin");
		new ConfigFileReader();
		return endpoint;
	}
	
	
}