package core;

import static core.DriverFactory.driverActions;
import static core.DriverFactory.getDriver;
import static core.DriverFactory.getDriverPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

	public void escrevePorId(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void escrevePorXpath(String xpath_campo, String texto) {
		getDriver().findElement(By.xpath(xpath_campo)).sendKeys(texto);
	}

	public void escrevePorName(String name_campo, String texto) {
		getDriver().findElement(By.name(name_campo)).sendKeys(texto);
	}

	public void selecionarElementoComboBoxPorName(String name_campo, String textoElemento) {
		getDriver().findElement(By.name(name_campo)).sendKeys(textoElemento);
		pressionaTeclaENTER();
	}
	
	public void selecionarElementoComboBoxPorXPath(String xpath, String textoElemento) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(textoElemento);
		pressionaTeclaENTER();
	}

	public void escrevePorCss(String css_campo, String texto) {
		getDriver().findElement(By.cssSelector(css_campo)).sendKeys(texto);
	}

	public String obterValorCampoPorId(String id_campo) {

		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	public String obterValorCampoPorXpath(String xpath_campo) {

		return getDriver().findElement(By.xpath(xpath_campo)).getAttribute("value");
	}

	public String obterValorCampoPorCss(String css_campo) {

		return getDriver().findElement(By.cssSelector(css_campo)).getAttribute("value");
	}

	public String obterTextoPorCss(String css_campo) {

		return getDriver().findElement(By.cssSelector(css_campo)).getText();
	}

	public String obterTextoPorXpath(String xpath_campo) {

		return getDriver().findElement(By.xpath(xpath_campo)).getText();
	}

	public void clicarPorId(String id_campo) {
		getDriver().findElement(By.id(id_campo)).click();
	}

	public void clicarPorXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	public void clicarPorCss(String css) {
		getDriver().findElement(By.cssSelector(css)).click();
	}

	public void clicarPorName(String name) {
		getDriver().findElement(By.name(name)).click();
	}

	public void clicarPorLinkText(String link_text) {
		getDriver().findElement(By.linkText(link_text)).click();
	}

	public void clicarPorParcialText(String text) {
		getDriver().findElement(By.partialLinkText(text)).click();
	}

	public void limparPorXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).clear();
	}

	/*
	 * Acessar iframe pelo index do iframe
	 * 
	 * variables int index
	 */
	public void acessarIframePorIndex(int index) {
		getDriver().switchTo().frame(index);
	}

	/*
	 * Acessar iframe por nome ou ID
	 * 
	 * variables String nameOrId
	 */
	public void acessarIframePorId(String nameOrId) {
		getDriver().switchTo().frame(nameOrId);
	}

	/*
	 * Abrir URL
	 * 
	 * variables String url
	 */
	public void abrirUrl(String url) {
		getDriver().get(url);
	}

	/*
	 * Esperar n segundos
	 * 
	 * variables int n
	 */
	public void esperar(int n) throws Exception {
		getDriver().wait(n);
	}

	/*
	 * Esperar por elemento por ID
	 * 
	 * variables String id
	 */
	public void esperarElementoPorId(String id, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
		System.out.println(myDynamicElement);
	}

	/*
	 * Esperar por elemento por CSS
	 * 
	 * variables String css
	 */
	public void esperarElementoPorCss(String css, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
		System.out.println(myDynamicElement);
	}

	/*
	 * Epathsperar por elemento por Xpath
	 * 
	 * variables String xpath
	 */
	public void esperarElementoPorXpath(String xpath, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		System.out.println(myDynamicElement);
	}

	/*
	 * Epathsperar por elemento por Name
	 * 
	 * variables String name
	 */
	public void esperarElementoPorName(String name, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
		System.out.println(myDynamicElement);
	}

	/*
	 * Scroll to element by id
	 * 
	 * variables String id
	 */
	public void scrollToElementById(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		((JavascriptExecutor) getDriver()).executeScript(id, element);
	}

	public void selecionarComboPorXpath(String xpath_campo, String texto_combo) {
		Select combo = new Select(getDriver().findElement(By.xpath(xpath_campo)));
		combo.selectByVisibleText(texto_combo);
	}

	public void selecionarComboPorId(String xpath_campo, String texto_combo) {
		Select combo = new Select(getDriver().findElement(By.id(xpath_campo)));
		combo.selectByVisibleText(texto_combo);
	}

	public void clicarPorXpathAction(String xpathSTR) {
//		WebElement xpath22 = getDriver().findElement(By.xpath(xpathSTR));
//		driverActions().moveToElement(xpath22, 109, 16).click().build().perform();

		WebElement xpath22 = getDriver().findElement(By.xpath(xpathSTR));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", xpath22);
		int getTopLeftY = ((xpath22.getSize().getHeight() / 2));
		int getTopLeftX = ((xpath22.getSize().getWidth() / 6));
		driverActions().moveToElement(xpath22, getTopLeftX, getTopLeftY).click().build().perform();

	}

	public void esperarElementoClicavelPorXpath(String xpath, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		System.out.println(myDynamicElement);
	}

	/**
	 * Verificar se elemento é exibido na tela.
	 * 
	 * @param xpath
	 * @return
	 */
	public boolean verificarSeElementoEstaPresenteXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).isDisplayed();
	}

	public int qtdeElementosRetornadosXpath(String xpath) {
		return getDriver().findElements(By.xpath(xpath)).size();
	}

	public void mouseOver(String xpath) {

		Actions acao = new Actions(getDriver());
		WebElement moverMouse = getDriver().findElement(By.xpath(xpath));
		acao.moveToElement(moverMouse).build().perform();
		// acao.perform();

	}

	public void pressionaTeclaTAB() {

		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.TAB).build().perform();

	}

	public void limparCampoPorXpath(String xpath_campo) {
		getDriver().findElement(By.xpath(xpath_campo)).clear();
	}

	public String obterAtributoElementoPorXpath(String xpath_campo, String atributo) {

		return getDriver().findElement(By.xpath(xpath_campo)).getAttribute(atributo);
	}

	public WebElement encontrarElementoPorXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath));

	}

	public void salvarImagemPorXpathAction(String xpathSTR) {
		WebElement xpath22 = getDriver().findElement(By.xpath(xpathSTR));
		driverActions().contextClick(xpath22).build().perform();

	}

	public boolean validarPresencaDePopup() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(4));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alerta Asprise exibido!");
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

	public Robot robot() throws AWTException {
		Robot bot = new Robot();

		return bot;
	}

	public void visibilidadeElementoPorXpath(String xpath, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xpath))));
		System.out.println(myDynamicElement);
	}

	public void dismissAlertPopup() throws InterruptedException {

		// JavascriptExecutor js = (JavascriptExecutor) getDriver();
		// js.executeScript("window.confirm.click();");
		// js.executeScript("return window.confirm('confirmação')");

		// js.executeScript("arguments[0].click();", button);

		Alert alerta = getDriver().switchTo().alert();
		alerta.dismiss();

	}

	public void selecionarPorIndexComboPorId(String id_campo, int index) {
		Select combo = new Select(getDriver().findElement(By.id(id_campo)));
		combo.selectByIndex(index);
	}

	public boolean verificaCheckbox(String id_campo) {
		WebElement checkbox = getDriver().findElement(By.id(id_campo));

		return checkbox.isSelected();
	}

	public void acceptAlertPopup() throws InterruptedException {
		Alert alerta = getDriverPopup().switchTo().alert();
		alerta.accept();

	}

	public String obterTextoPorId(String id_campo) {

		return getDriver().findElement(By.id(id_campo)).getText();
	}

	public String obterTextoPorName(String id_campo) {

		return getDriver().findElement(By.name(id_campo)).getAttribute("value");
	}

	public void visibilidadeElementoPorId(String id, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.visibilityOfElementLocated((By.id(id))));
		System.out.println(myDynamicElement);
	}

	public void botApertarSetaEsquerda() throws Exception {
		int i;
		for (i = 0; i < 14; i++) {
			robot().keyPress(KeyEvent.VK_LEFT);
			robot().keyRelease(KeyEvent.VK_LEFT);
		}
		Thread.sleep(3000);
	}

	public void botApertarSetaAbaixo() throws Exception {
		int i;
		for (i = 0; i < 14; i++) {
			robot().keyPress(KeyEvent.VK_DOWN);
			robot().keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
	}

	public double obterNumeroPorId(String id_campo) {
		String strSaldo = getDriver().findElement(By.id(id_campo)).getAttribute("value");
		double sss = Double.parseDouble(strSaldo);

		return sss;
	}

	public void botApertarPageDown() throws Exception {
		int i;
		for (i = 0; i < 5; i++) {
			robot().keyPress(KeyEvent.VK_PAGE_DOWN);
			robot().keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
	}

	public void limparCampoPorId(String id_campo) {
		getDriver().findElement(By.id(id_campo)).clear();
	}

	public void aguardarAlert() throws Exception {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void alternarParaNovaAbaAbertaBrowser() throws Exception {
//		List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
//		for (i = 1; i < abas.size(); i++) {
//			List<String> abas2 = new ArrayList<>(getDriver().getWindowHandles());
//			abas = abas2;
//			getDriver().switchTo().window(abas.get(i));
//		}
		List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(abas.get(1));

	}

	public void alternarParaAbaAnteriorBrowser() throws Exception {
		List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(abas.get(0));

	}

	public void fecharAbaAtualBrowser() throws Exception {
		getDriver().close();
		Thread.sleep(5000);
	}

	public void visibilidadeElementoPorName(String xpath, int tempo) {
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.visibilityOfElementLocated((By.name(xpath))));
		System.out.println(myDynamicElement);
	}

	public void botPressionarEnter() throws Exception {
		Thread.sleep(2000);
		robot().keyPress(KeyEvent.VK_ENTER);
		robot().keyRelease(KeyEvent.VK_ENTER);

	}

	public void sendKeysJavaScriptById(String id, String texto) {
//		WebElement element = getDriver().findElement(By.id(id));
		((JavascriptExecutor) getDriver()).executeScript("$('#" + id + "').val('" + texto + "');");
	}

	public void escreverJSPorID(String id, String texto) {
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("window.document.getElementById('" + id + "').setAttribute('value', '" + texto + "')");
		System.out.println("Id do objeto: " + id + ", Texto: " + texto);
	}

	public void pressionaTeclaHOME() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.HOME).build().perform();
	}

	public String getTextAlertPopup() throws InterruptedException {
		Alert alerta = getDriver().switchTo().alert();
		String txt = alerta.getText();
		return txt;

	}

	public void pressionaCtrlA() {

		Actions acao = new Actions(getDriver());
		acao.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).keyUp(Keys.CONTROL).build().perform();
	}

	public void pressionaCtrlX() {

		Actions acao = new Actions(getDriver());
		acao.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0058')).keyUp(Keys.CONTROL).build().perform();
	}

	public void selecaoMenuMultiplo(String... itens) {

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

		Actions acao = new Actions(getDriver());

		for (String menu : itens) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(menu)));
			acao.moveToElement(getDriver().findElement(By.id(menu))).click().perform();
		}

		acao.build();
	}

	public void esperarLoadingDesaparecerPorId(String id, int tempo) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}

	public void scrollToElementByXpath(String xpath) {
		WebElement element = getDriver().findElement(By.xpath(xpath));
		((JavascriptExecutor) getDriver()).executeScript(xpath, element);
	}

	public void scrollToElementByText(String text) {

		WebElement element = getDriver().findElement(By.xpath("//*[text() = '" + text + "']"));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void scrollToElementAndClickByXpath(String xpath) {
		WebElement element = getDriver().findElement(By.xpath(xpath));
		((JavascriptExecutor) getDriver()).executeScript(xpath, element);
		element.click();
	}

	public void visibilidadeTextoPorXpath(String xpath, int tempo, String text) {
		Boolean myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath), text));
		System.out.println(myDynamicElement);
	}

	public void limpaCampoMascaradoPorId(String id_campo) {
		clicarPorId(id_campo);
		pressionaCtrlA();
		pressionaCtrlX();
	}

	public void esperarElementoClicavel(String id, int tempo) {
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), Duration.ofSeconds(tempo)))
				.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		System.out.println(myDynamicElement);
	}

	public void pressionaTeclaSPACE() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.SPACE).build().perform();
	}

	public void scrollToBottom() {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void doubleClickByXpath(String xpath) {

		Actions acao = new Actions(getDriver());
		WebElement doubleClick = getDriver().findElement(By.xpath(xpath));
		acao.doubleClick(doubleClick).perform();

	}

	public void pressionaTeclaEND() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.END).build().perform();
	}

	public void pressionaTeclaPAGE_DOWN() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public void pressionaTeclaPAGE_UP() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.PAGE_UP).build().perform();
	}

	public void voltarParaIframeDefault() {
		getDriver().switchTo().defaultContent();
	}

	public void pressionaTeclaUP() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.UP).build().perform();
	}

	public void pressionaTeclaENTER() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.ENTER).build().perform();
	}

	public String obterSrcPorId(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("src");
	}

	public void pressionaTeclaLeft() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.ARROW_LEFT).build().perform();
	}

	public void pressionaTeclaDown() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.ARROW_DOWN).build().perform();
	}

	public void pressionaTeclaUp() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.ARROW_UP).build().perform();
	}

	public void pressionaTeclaRight() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.ARROW_RIGHT).build().perform();
	}

	public void invisibilidadeElementoPorId(String id) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}

	public void aguardarAlertDriverPopup() throws Exception {
		WebDriverWait wait = new WebDriverWait(getDriverPopup(), Duration.ofSeconds(180));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void limpaCampoMascaradoPorXpath(String xpath) {
		clicarPorXpath(xpath);
		pressionaCtrlA();
		pressionaCtrlX();
	}

	public boolean isAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public void acceptAlert() {

		if (isAlertPresent()) {
			System.out.println(isAlertPresent());
			getDriver().switchTo().alert().accept();
		}
	}

	public void sairAllert() throws AWTException {
		getDriver().switchTo().alert();
		// invoke Robot class
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);

//		rb.KeyPress(KeyRelease.VK_ENTER);
	}

	public void clicarPorJavascriptPorId(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
	}

//	public void dismissAlertPopup() throws InterruptedException {
//
//		// JavascriptExecutor js = (JavascriptExecutor) getDriver();
//		// js.executeScript("window.confirm.click();");
//		// js.executeScript("return window.confirm('confirmação')");
//
//		// js.executeScript("arguments[0].click();", button);
//
//		Alert alerta = getDriver().switchTo().alert();
//		alerta.dismiss();
//	}
}
