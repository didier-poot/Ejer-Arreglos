import java.util.Arrays;

class VentasApp {
    static String[] departamentos = {"ropa", "deportes", "jugueteria"};
    static String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                             "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
    static int[][] ventas = new int[12][3];

    public static boolean validarDatos(String mes, String departamento) {
        mes = mes.toLowerCase().replace(" ", "");
        departamento = departamento.toLowerCase().replace(" ", "");
        boolean mesValido = Arrays.asList(meses).contains(mes);
        boolean deptoValido = Arrays.asList(departamentos).contains(departamento);
        return mesValido && deptoValido;
    }

    public static void insertarVenta(String mes, String departamento, int cantidad) {
        if (validarDatos(mes, departamento)) {
            int indiceMes = Arrays.asList(meses).indexOf(mes.toLowerCase().replace(" ", ""));
            int indiceDepto = Arrays.asList(departamentos).indexOf(departamento.toLowerCase().replace(" ", ""));
            ventas[indiceMes][indiceDepto] += cantidad;
        } else {
            System.out.println("Datos inválidos");
        }
    }

    public static String buscarVenta(String mes, String departamento) {
        if (validarDatos(mes, departamento)) {
            int indiceMes = Arrays.asList(meses).indexOf(mes.toLowerCase().replace(" ", ""));
            int indiceDepto = Arrays.asList(departamentos).indexOf(departamento.toLowerCase().replace(" ", ""));
            return "La venta de " + departamento + " en " + mes + " es: " + ventas[indiceMes][indiceDepto];
        } else {
            return "Datos inválidos";
        }
    }

    public static void eliminarVenta(String mes, String departamento) {
        if (validarDatos(mes, departamento)) {
            int indiceMes = Arrays.asList(meses).indexOf(mes.toLowerCase().replace(" ", ""));
            int indiceDepto = Arrays.asList(departamentos).indexOf(departamento.toLowerCase().replace(" ", ""));
            ventas[indiceMes][indiceDepto] = 0;
        } else {
            System.out.println("Datos inválidos");
        }
    }

    public static void main(String[] args) {
        insertarVenta("Enero", "Ropa", 1500);
        insertarVenta("Enero", "Deportes", 2000);
        insertarVenta("Febrero", "Jugueteria", 3000);

        System.out.println(buscarVenta("Enero", "Ropa"));

        // Mostrar toda la matriz de ventas
        System.out.println("\nMatriz de ventas:");
        for (int[] filaVentas : ventas) {
            System.out.println(Arrays.toString(filaVentas));
        }
    }
}
