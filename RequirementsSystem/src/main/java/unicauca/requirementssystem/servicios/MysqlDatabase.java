// Unicauca.RequirementsSystem.servicio.MysqlDatabase.java
package Unicauca.RequirementsSystem.servicios;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import Unicauca.RequirementsSystem.util.Database;

/**
 * Implementación de la conexión a una base de datos MySQL.
 * Creado por Andrés Fabian Pino y Pedro Gómez.
 */
public class MysqlDatabase  {
    private static final String PROPERTIES_FILE = "database.properties";

    public Connection getConnection() throws SQLException, IOException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) {
            properties.load(fis);
        }
        
        String url = properties.getProperty("mysql.url");
        String user = properties.getProperty("mysql.user");
        String password = properties.getProperty("mysql.password");

        return DriverManager.getConnection(url, user, password);
    }

    // Otros métodos para realizar operaciones específicas de MySQL
}

