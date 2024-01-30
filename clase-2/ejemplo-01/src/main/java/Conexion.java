public class Conexion {
    private static Conexion instancia;
    
    private Conexion() {
        System.out.println("Creando instancia de Conexion");
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conectando a la base de datos");
    }

}
