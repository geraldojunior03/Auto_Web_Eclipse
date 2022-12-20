package stepsDefinition;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import core.BaseTest;
import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static Collection<String> cenarioTag = null;

//	GravarVideo gravarVideo = new GravarVideo();

	String carimbo_teste = BaseTest.getCarimboData("yyyyMMdd");
	String carimbo_dataHora = BaseTest.getCarimboData();

	@Before
	public void inicializa(Scenario cenario) throws Throwable {

		// extent.setGherkinDialect("pt");

		cenarioTag = cenario.getSourceTagNames();
		BaseTest.testName = cenario.getName();

		if (!cenarioTag.contains("@webservice")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/Driver/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
			System.setProperty("webdriver.ie.driver", "src/test/resources/Driver/IEDriverServer.exe");

//			ChromeOptions chromeOptions = new ChromeOptions();
//			chromeOptions.addArguments("--headless");

			BaseTest.execucao = carimbo_dataHora;
			System.out.println("nome da pasta da evidencia: " + carimbo_teste);
			BaseTest.caminho_evidencia = BaseTest
					.criaDiretorio(carimbo_teste + "/" + BaseTest.testName + "/" + BaseTest.execucao);

			String caminho = System.getProperty("user.dir") + File.separator + BaseTest.caminho_completo
					+ File.separator;
			DriverFactory.caminhoDownload = caminho.replace("/", File.separator);

//			File dir3 = new File("C:\\Users\\lc5585739\\Documents\\testando22");
//			dir3.mkdir();

//			Document doc = BaseTest.CriarPDF(dir3);

//			gravarVideo.startRecording(BaseTest.caminho_evidencia);
		} else {
			String caminho = System.getProperty("user.dir") + File.separator + BaseTest.caminho_completo
					+ File.separator;
			DriverFactory.caminhoDownload = caminho.replace("/", File.separator);
		}

	}

	@After(order = 1)
	public void aposCenario(Scenario cenario) {
//		try {
//			gravarVideo.FinalizarGravacao();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		if (cenario.isFailed() && !cenarioTag.contains("@webservice")) {
			BaseTest.testName = cenario.getName();
			BaseTest.caminho_evidencia = BaseTest
					.criaDiretorio(carimbo_teste + "/" + BaseTest.testName + "/" + BaseTest.execucao) + "/erros";
			try {
				BaseTest.takeScreenshot("Failed");
				String diretorio = System.getProperty("user.dir");
				String caminhoEvidenciaErro = BaseTest.caminhoEvidenciaCompletoErros;
				caminhoEvidenciaErro = caminhoEvidenciaErro.replace('/', '\\');
				String caminhoEmbed = diretorio + "\\" + caminhoEvidenciaErro;
				// Reporter.addScreenCaptureFromPath(caminhoEmbed);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	@After(order = 0)
	public void finalizaDriver() {
		DriverFactory.killDriver();
	}
}
