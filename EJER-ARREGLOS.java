import java.util.*;

class ventas{
    static String[] departamentos = {"ropa", "deportes", "jugueteria"};
    static String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
                             "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    static int[][] ventas = new int[12][3];

    public static void insertarVenta(String mes, String departamento, int cantidad) {
        mes = mes.toLowerCase().replace(" ", "");
        departamento = departamento.toLowerCase().replace(" ", "");
        int indiceMes = Arrays.asList(meses).indexOf(mes);
        int indiceDepto = Arrays.asList(departamentos).indexOf(departamento);

        if (indiceMes != -1 && indiceDepto != -1) {
            ventas[indiceMes][indiceDepto] = cantidad;
            System.out.println("Venta insertada con éxito");
        } else {
            System.out.println("Mes o departamento inválido");
        }
    }

    public static String buscarVenta(String mes, String departamento) {
        mes = mes.toLowerCase().replace(" ", "");
        departamento = departamento.toLowerCase().replace(" ", "");
        int indiceMes = Arrays.asList(meses).indexOf(mes);
        int indiceDepto = Arrays.asList(departamentos).indexOf(departamento);

        if (indiceMes != -1 && indiceDepto != -1) {
            return "La venta del mes " + mes + " para el departamento " + departamento +
                   " es: " + ventas[indiceMes][indiceDepto];
        } else {
            return "Mes o departamento inválido";
        }
    }

    public static void eliminarVenta(String mes, String departamento) {
        mes = mes.toLowerCase().replace(" ", "");
        departamento = departamento.toLowerCase().replace(" ", "");
        int indiceMes = Arrays.asList(meses).indexOf(mes);
        int indiceDepto = Arrays.asList(departamentos).indexOf(departamento);

        if (indiceMes != -1 && indiceDepto != -1) {
            ventas[indiceMes][indiceDepto] = 0;
            System.out.println("Venta eliminada con éxito");
        } else {
            System.out.println("Mes o departamento inválido");
        }
    }

    public static void main(String[] args) {
        insertarVenta("Enero", "Ropa", 1500);
        System.out.println(buscarVenta("Enero", "Ropa"));
        insertarVenta("Febrero", "Deportes", 2000);
        insertarVenta("Febrero", "Ropa", 2000);
        insertarVenta("Febrero", "Jugueteria", 2000);
        insertarVenta("Marzo", "Jugueteria", 3000);
        insertarVenta("Abril", "Ropa", 2500);
        System.out.println("\nMatriz de ventas:");
        for (int[] filaVentas : ventas) {
            System.out.println(Arrays.toString(filaVentas));
        }
    }
}
