package calculadora.controller;

public class Conversiones {

    // Conversión de Binario a Decimal
    public static int binarioADecimal(String numeroBinario) {
        int decimal = 0;
        int potencia = 0;

        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            if (numeroBinario.charAt(i) == '1') {
                decimal += Math.pow(2, potencia);
            }
            potencia++;
        }
        return decimal;
    }

    // Conversión de Octal a Decimal
    public static int octalADecimal(String numeroOctal) {
        int decimal = 0;
        int potencia = 0;

        for (int i = numeroOctal.length() - 1; i >= 0; i--) {
            int digito = numeroOctal.charAt(i) - '0';
            decimal += digito * Math.pow(8, potencia);
            potencia++;
        }
        return decimal;
    }

    // Conversión de Hexadecimal a Decimal
    public static int hexadecimalADecimal(String numeroHex) {
        int decimal = 0;
        int potencia = 0;

        for (int i = numeroHex.length() - 1; i >= 0; i--) {
            char digito = numeroHex.charAt(i);
            int valor;

            if (digito >= '0' && digito <= '9') {
                valor = digito - '0';
            } else {
                valor = digito - 'A' + 10;
            }

            decimal += valor * Math.pow(16, potencia);
            potencia++;
        }
        return decimal;
    }

    // Conversión de Decimal a Binario
    public static String decimalABinario(int numeroDecimal) {
        StringBuilder binario = new StringBuilder();

        while (numeroDecimal > 0) {
            binario.insert(0, numeroDecimal % 2);
            numeroDecimal /= 2;
        }

        return binario.length() > 0 ? binario.toString() : "0";
    }

    // Conversión de Decimal a Octal
    public static String decimalAOctal(int numeroDecimal) {
        StringBuilder octal = new StringBuilder();

        while (numeroDecimal > 0) {
            octal.insert(0, numeroDecimal % 8);
            numeroDecimal /= 8;
        }

        return octal.length() > 0 ? octal.toString() : "0";
    }

    // Conversión de Decimal a Hexadecimal
    public static String decimalAHexadecimal(int numeroDecimal) {
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexDigits = "0123456789ABCDEF".toCharArray();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 16;
            hexadecimal.insert(0, hexDigits[residuo]);
            numeroDecimal /= 16;
        }

        return hexadecimal.length() > 0 ? hexadecimal.toString() : "0";
    }
}
