public class Productos {
  

    public Productos(int cantidad, double precio, String nombre) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String nombre = "";
    public int cantidad = 0;
    public double precio = 0;

    double subtotal() {
        return cantidad * precio;
    }
    
    @Override
    public String toString(){
        return "Nombre:" + nombre + "\n Cantidad:" + cantidad + "\n Precio:" + precio;
    }

}
