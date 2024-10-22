package calculadora.controller;

public class ConversionUnidades {
    public static double convertir(int origen, int destino, double cantidad) {
        // Factor de conversión de cada unidad a metros
        double[] aMetro = {1.0, 0.01, 1000.0, 0.9144, 0.3048, 0.0254};
        double cantidadEnMetros;

        // Validar opciones
        if (origen < 1 || origen > 6 || destino < 1 || destino > 6) {
            return -1; // Opción inválida
        }

        // Convertir la cantidad a metros (unidad base)
        cantidadEnMetros = cantidad * aMetro[origen - 1];

        // Factor de conversión de metros a la unidad destino
        double[] deMetro = {1.0, 100.0, 0.001, 1.09361, 3.28084, 39.3701};

        // Convertir de metros a la unidad destino
        return cantidadEnMetros * deMetro[destino - 1];
    }
}
