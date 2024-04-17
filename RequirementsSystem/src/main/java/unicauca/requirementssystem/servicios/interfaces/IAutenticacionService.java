// Unicauca.RequirementsSystem.servicio.interfaces.IAutenticacionService.java
package Unicauca.RequirementsSystem.servicios.interfaces;

/**
 * Interfaz que define el comportamiento del servicio de autenticación en el sistema.
 * Creado por Andrés Fabian Pino y Pedro Gómez.
 * Aplica el principio de interfaz única (SOLID).
 * Patrón de diseño: Interfaz.
 */
public interface IAutenticacionService {
    /**
     * Autentica al usuario en el sistema.
     * @param usuario El nombre de usuario.
     * @param contraseña La contraseña del usuario.
     * @return true si la autenticación es exitosa, false de lo contrario.
     */
    boolean autenticarUsuario(String usuario, String contraseña);
}
