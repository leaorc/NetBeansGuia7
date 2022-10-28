/*
6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

public class Ahorcado {
    private int jugadasMax, letrasEnc;
    private char [] buscarPalabra;
    private char [] letrasGuiones;

    public Ahorcado() {
    }

    public Ahorcado(int jugadasMax, int letrasEnc, char[] buscarPalabra) {
        this.jugadasMax = jugadasMax;
        this.letrasEnc = letrasEnc;
        this.buscarPalabra = buscarPalabra;
    }

    public char[] getLetrasGuiones() {
        return letrasGuiones;
    }

    public void setLetrasGuiones(char[] letrasGuiones) {
        this.letrasGuiones = letrasGuiones;
    }
    
    

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getLetrasEnc() {
        return letrasEnc;
    }

    public void setLetrasEnc(int letrasEnc) {
        this.letrasEnc = letrasEnc;
    }

    public char[] getBuscarPalabra() {
        return buscarPalabra;
    }

    public void setBuscarPalabra(char[] buscarPalabra) {
        this.buscarPalabra = buscarPalabra;
    }

   
    
}
