/**
 * 
 */
package singleton;

/**
 * 
 */
public class TesteConfigManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Obter instância única do gerenciador
		ConfigManager config = ConfigManager.getInstance();
		System.out.println(config.getProperties());
	}

}
