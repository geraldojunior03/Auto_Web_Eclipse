package managers;

import fileWriter.ConfigFileWriter;

public class FileWriterManager {

	private static FileWriterManager fileWriterManager = new FileWriterManager();
	private static ConfigFileWriter configFileWriter;

	private FileWriterManager() {
	}

	public static FileWriterManager getInstance() {
		return fileWriterManager;
	}

	public ConfigFileWriter getConfigWriterCnpjRadical(String cnpjRadical) throws Exception {
		return (configFileWriter == null) ? new ConfigFileWriter(cnpjRadical) : configFileWriter;
	}
	
	public ConfigFileWriter getConfigWriterBulkCard(String cnpjFilial, String cnpjEmpresa, String cpfInterlocutor,
			String idBulk, String proxy) throws Exception {
		return (configFileWriter == null)
				? new ConfigFileWriter(cnpjFilial, cnpjEmpresa, cpfInterlocutor, idBulk, proxy)
				: configFileWriter;
	}
	
//	public ConfigFileWriter getConfigWriterCpfContratoDesbloquearCartao(String contrato, String cpf) throws Exception {
//		return (configFileWriter == null) ? new ConfigFileWriter(contrato, cpf) : configFileWriter;
//	}

}