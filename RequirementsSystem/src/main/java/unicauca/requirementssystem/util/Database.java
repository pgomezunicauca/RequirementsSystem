// Unicauca.RequirementsSystem.util.Database.java
package Unicauca.RequirementsSystem.util;

/**
 * Clase Singleton para manejar la conexión a la base de datos.
 * Creado por Andrés Fabian Pino y Pedro Gómez.
 * Patrón de diseño: Singleton.
 */
public class Database {
    private static Database instancia;

    private Database() {
        // Constructor privado para evitar la instanciación directa
    }

    /**
     * Obtiene la instancia única de la conexión a la base de datos.
     * @return La instancia de DatabaseConnection.
     */
    public static Database getInstancia() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }

    // Métodos para la conexión a la base de datos
}
