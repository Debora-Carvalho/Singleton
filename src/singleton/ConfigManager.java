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
	private String properties = "\napp.name=Sistema Empresarial"
			+ "\napp.version=1.0 \napp.language=pt-BR \n"
			+ "currency=BRL \ntimeout=300 segundos";
	
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
