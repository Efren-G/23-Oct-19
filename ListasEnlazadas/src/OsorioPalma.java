
public class OsorioPalma {

    public static void main(String[] args) {

        ListaDeObjetos lista = new ListaDeObjetos();
        Productos sabritas = new Productos(2, 30, "Sabritas");
        Productos refresco = new Productos(4, 10, "Coca-Cola");
        Productos papas = new Productos(2, 15, "Papas Barcel");
        Productos bubulubu = new Productos(3, 30, "Mini-Bubulubu");

        lista.agregarAlFinal(sabritas);
        lista.agregarAlFinal(refresco);
        lista.agregarAlFinal(papas);
        lista.agregarAlFinal(bubulubu);

        lista.mostrarDer_Izq();

        calcularTotalPagar(lista);
    }

    private static void calcularTotalPagar(ListaDeObjetos lista) {
        int tamaño = lista.getTamaño();
        if (tamaño != 0) {
            Nodo temporal = lista.primerNodo;
            double totalPagar = 0;
            for (int i = 0; i < tamaño; i++) {
                Productos p = (Productos) temporal.dato;
                totalPagar = totalPagar + (p.precio * p.cantidad);
                temporal = temporal.nodoDere;
            }
            System.out.println(totalPagar);
        }
    }

}
