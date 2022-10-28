
package Entidades;


public class Operacion {
    //Crear una clase llamada Operacion que tenga como atributos privados numero1 y
    //numero2.
    private int numero1, numero2;

    
    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // b) Metodo constructor sin los atributos pasados por parámetro.

    public Operacion() {
    }
    
    //c) Métodos get y set.

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.
    
    public void crearOperacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        
        
    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public int sumar(){
        int suma = this.numero1 + this.numero2;
        return suma;
    }
    
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public int restar(){
        int resta = this.numero1 - this.numero2;
        return resta;
    }
    /**
     * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
     * @return 
     */
    
    public int multiplicar(){
       int multiplicacion = this.numero1 * this.numero2;
        
        if (this.numero1==0 || this.numero2==0) {
            System.out.println("ERROR: "+"La multiplicación x 0 es = 0");
            return 0;
        }else{
            return multiplicacion;
        }
    }
    
    /*
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    */
    public double dividir(){
       double division = (double)this.numero1 / (double)this.numero2;
         if (this.numero1==0 || this.numero2==0) {
            System.out.println("ERROR: "+"La division x 0 es = 0");
            return 0;
        }else{
            return division;
    }
    }
}

