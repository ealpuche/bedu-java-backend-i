public class VehiculoFactory {

    public Vehiculo getVehiculo(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("BICICLETA")) {
            return new Bicicleta();
        } else if (tipo.equalsIgnoreCase("COCHE")) {
            return new Coche();
        } else if (tipo.equalsIgnoreCase("BARCO")) {
            return new Barco();
        }

        return null;
    }
    
}
