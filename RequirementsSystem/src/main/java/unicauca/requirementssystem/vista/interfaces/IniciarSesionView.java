// Unicauca.RequirementsSystem.vista.interfaces.IniciarSesionView.java
package Unicauca.RequirementsSystem.vista.interfaces;

/**
 * Interfaz que define el comportamiento de la vista para iniciar sesión en el sistema.
 * Creado por Andrés Fabian Pino y Pedro Gómez.
 * Aplica el principio de interfaz única (SOLID).
 * Patrón de diseño: Interfaz.
 */
public interface IniciarSesionView {
    /**
     * Muestra la interfaz de inicio de sesión.
     * Atributos de calidad: Usabilidad.
     */
    void mostrar();

    /**
     * Obtiene el nombre de usuario ingresado por el usuario.
     * @return El nombre de usuario ingresado.
     */
    String obtenerUsuario();

    /**
     * Obtiene la contraseña ingresada por el usuario.
     * @return La contraseña ingresada.
     */
    String obtenerContraseña();

    /**
     * Muestra un mensaje de error en la vista.
     * @param mensaje El mensaje de error a mostrar.
     */
    void mostrarMensajeError(String mensaje);
}