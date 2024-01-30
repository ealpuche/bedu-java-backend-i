public class Application {
    public static void main(String[] args) {
        System.out.println("Creando la primera instancia de Conexion");
        Conexion conexion = Conexion.getInstancia();
        conexion.conectar();
        System.out.println("Creando la segunda instancia de Conexion");
        Conexion conexion2 = Conexion.getInstancia();
    }
    
}