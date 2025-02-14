/**
 * 
 */
package singleton;

/**
 * 
 */
public class TesteConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Obter uma conexão - instância da classe DatabaseConnection
		DatabaseConnection conexaoRH = DatabaseConnection.getInstance();
		DatabaseConnection conexaoTI = DatabaseConnection.getInstance();
		DatabaseConnection conexaoVendas = DatabaseConnection.getInstance();		
	}

}
