import Controladores.ConexionController;
import Modelos.Conexion;
import Vistas.*;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal principal = new frmPrincipal();
        frmLogin login = new frmLogin();
        Conexion conexion = new Conexion();
        ConexionController controlador = new ConexionController(login,principal,conexion);
        
    }
    
}
