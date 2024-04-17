// Unicauca.RequirementsSystem.servicio.interfaces.IConnectionFactory.java
package Unicauca.RequirementsSystem.servicios.interfaces;

import Unicauca.RequirementsSystem.servicios.DatabaseType;
import Unicauca.RequirementsSystem.util.Database;

/**
 * Interfaz que define el comportamiento del Factory Method para la conexión a la base de datos.
 * Creado por Andrés Fabian Pino y Pedro Gómez.
 * Aplica el principio de interfaz única (SOLID).
 * Patrón de diseño: Factory Method.
 */
public interface IConnectionFactory {
    /**
     * Método para obtener una instancia de la base de datos.
     * @param type El tipo de base de datos.
     * @return La instancia de la base de datos.
     */
    Database getDatabase(DatabaseType type);
}

