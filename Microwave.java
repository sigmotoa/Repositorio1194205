
package proyectoelectrodomesticos;

public class Microwave extends Electrodomestico {
    boolean encendido;
    String marca;
    String modelo;
    int validaencendido;
    int inicio;
      
    public Microwave (String marca, String entradaelectrica, String modelo){
        super(marca, entradaelectrica);
        this.modelo = modelo;    
}
    
    @Override
    String encender (int encendido) {
        validaencendido = encendido;
        if (validaencendido==1) {            
           return "Su Microondas está encendido";
        }
//        else if (validaencendido==7) {       
//            return "Su Microondas está apagado";           
//        }
        return "Su Microondas está apagado";
    }
    
    @Override
    public String toString(){
       return  encender(validaencendido) +  "\nLa entrada eléctica es: 120VAC \n" ;
   }
    
    public void segundosCoccion(int segundos) throws InterruptedException{

        for (int i = segundos; i >= 0; i--) {

            System.out.println(i);
            Thread.sleep(1000);
            if (i == 0) {
                System.out.println("Abra la puerta. Los alimentos están listos \n");

            }
        }
    }
    
    public void minutosCoccion(int minutos) throws InterruptedException{
            minutos = minutos*60;
        for (int i = minutos; i >= 0; i--) {

            System.out.println(i);
            Thread.sleep(1000);
            if (i == 0) {
                System.out.println("Abra la puerta. Los alimentos están listos \n");

            }
        }
    }
    
}

