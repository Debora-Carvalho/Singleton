/**
 * 
 */
package singleton;

/**
 * 
 */
public class ConfigManager {
    //Instância única do Singleton - atributo privado estático
	private static ConfigManager instance;
	
	//Atributo para armazenar as configurações
	private String properties = "\\n app.name=Sistema \r\n"
			+ "Empresarial \\n app.version=1.0 \\n app.language=pt-BR \\n \r\n"
			+ "currency=BRL \\n timeout=300 segundos";
	
	//Construtor privado
	private ConfigManager() {
		//Inserir a operação - código necessário
	}
	//Método público para obter a instância única - getInstance
	public static ConfigManager getInstance() {		
		if(instance == null) {
			instance = new ConfigManager();
		}
		return instance;
	}
	
	//Método para obter um valor da configuração
	public String getProperties() {
		return properties;
	}
}
