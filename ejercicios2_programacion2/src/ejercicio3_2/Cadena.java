package ejercicio3_2;

public class Cadena {
    private String texto;
    public Cadena(String texto) {
        this.texto = texto;
    }
    public int obtenerLongitud() {
        return texto.length();
    }
    public void eliminarEspacios() {
        texto = texto.replaceAll(" ", "");
    }
    public void convertirAMayusculas() {
        texto = texto.toUpperCase();
    }
    public void concatenar12345() {
        texto += "12345";
    }
    public String extraerSubstring() {
        if (texto.length() >= 16) {
            return texto.substring(10, 16);
        }
        return null;
    }
    public void reemplazarLetra() {
        texto = texto.replace("o", "O");
    }
    public boolean compararConProgramacion() {
        return texto.equals("Programación");
    }
    public int contarMayusculas() {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                contador++;
            }
        }
        return contador;
    }
    public int contarOcurrenciasDeLetra(char letra) {
        int contador = 0;
        letra = Character.toLowerCase(letra);
        for (char c : texto.toCharArray()) {
            if (Character.toLowerCase(c) == letra) {
                contador++;
            }
        }
        return contador;
    }
    public void eliminarEspaciosEnBlanco() {
        texto = texto.replaceAll(" ", "");
        System.out.println(texto);
    }
    public String obtenerReverso() {
        StringBuilder reverso = new StringBuilder(texto);
        return reverso.reverse().toString();
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
