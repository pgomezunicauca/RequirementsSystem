// Unicauca.RequirementsSystem.servicio.DatabaseFactory.java
package Unicauca.RequirementsSystem.servicios;

import Unicauca.RequirementsSystem.util.Database;
import Unicauca.RequirementsSystem.servicios.interfaces.IConnectionFactory;

/**
 * Implementación del Factory Method para la conexión a la base de datos.
 * Creado por Andrés Fabian Pino y Pedro Gómez.
 * Patrón de diseño: Factory Method.
 */
public class DatabaseFactory implements IConnectionFactory {
    @Override
    public Database getDatabase(DatabaseType type) {
        switch (type) {
            case MYSQL:
 //               return new MysqlDatabase();
            case SQL_LIKE:
  //              return new SqlLikeDatabase();
            case POSTGRES:
 //               return new PostgresDatabase();
            case ORACLE:
//                return new OracleDatabase();
            case TXT_FILE:
 //               return new TxtFileDatabase();
            default:
                throw new IllegalArgumentException("Tipo de base de datos no soportado: " + type);
        }
    }
}