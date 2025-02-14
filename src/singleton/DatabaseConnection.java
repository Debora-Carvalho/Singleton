/**
 * 
 */
package singleton;

/**
 * 
 */
public class DatabaseConnection {
//instância única do Singleton - atributo privado estático
	private static DatabaseConnection instance;
	
	//Construtor privado
	private DatabaseConnection() {
		System.out.println("Conexão com banco de dados estabelecida");
	}
	//Método público para obter a instância única
	public static DatabaseConnection getInstance() {
		if(instance ==  null) {
			instance = new DatabaseConnection();
		}
		System.out.println("\n Método getInstance executado");
		return instance;
	}
	//Método que simula uam operação no banco de dados
	public void executeQuery(String query) {
		System.out.println("Executando Query: " + query);
	}
}
