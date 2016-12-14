
package proyectoelectrodomesticos;
import java.util.Scanner;
public class ProyectoElectrodomesticos {

    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner (System.in);
   
        Televisor tv1 = new Televisor (70, 45, "Sony", "120VAC");
        System.out.println( tv1 + "Las pulgadas del TV son: " + tv1.calcularDiagonal()+"\"" );
        System.out.println("");
         int encender;
         do {
        System.out.println("Digite 1 para encender el televisor");
        encender = read.nextInt();
        tv1.encender(encender);
            System.out.println("");
        } while (encender!=1);
        System.out.println(tv1);
        
   
        int opcion=0;
        do {
            System.out.println("Ingrese la opción de su preferencia");
            System.out.println("------------------------------------");
            System.out.println("1. Encender/Apagar Televisor");
            System.out.println("2. Subir volumen");
            System.out.println("3. Bajar volumen");
            System.out.println("4. Subir canal");
            System.out.println("5. Bajar canal");
            System.out.println("6. Silenciar");
            System.out.println("7. Cambiar Canal");            
            System.out.println("------------------------------------");
            opcion = read.nextInt();
            read.nextLine();
            
            if (opcion == 2) {
                tv1.subirVol();
                System.out.println(tv1);
            }
            if (opcion == 3) {
                tv1.bajarVol();
                System.out.println(tv1);
            }
            if (opcion == 4) {
                tv1.subirCanal();
                System.out.println(tv1);
            }
            if (opcion == 5) {
                tv1.bajarCanal();
                System.out.println(tv1);
            }
            if (opcion == 6) {
                System.out.println(tv1.silenciar(opcion));
            }
            
            if (opcion == 7) {
                System.out.println("Ingrese el número del canal");
                int numerocanal = read.nextInt();
                tv1.cambiarCanal(numerocanal);
                System.out.println(tv1);                
            }
            
        } while (opcion != 1);
        if (opcion == 1) {
            System.out.println("|-------------------------------|");
            System.out.println("|El televisor está apagado |");
            System.out.println("|-------------------------------|");
            System.out.println("\n");
        }
        
//        ----PROYECTO GRABADORA----
        
            Grabadora gb1 = new Grabadora ("LG", "120VAC", "KW345CS");
            System.out.println( gb1 + "\nMarca: " + gb1.getMarca() + "\nEntrada eléctrica: " + gb1.getEntradaElectrica() + "\n");
            int op;
            do {
                System.out.println("Por favor, para encender la grabadora, presione 1");
                op = read.nextInt();
                gb1.encender(op);
                System.out.println(gb1);
                System.out.println("Emisora: " + gb1.getEmisoras() + "\nFrecuencia " + gb1.getFrecuencia());
                System.out.println("");
            
        } while (op !=1);
         
            do {             
                System.out.println("");
                System.out.println("Ingrese la opción de su preferencia");
                System.out.println("------------------------------------");
                System.out.println("1. Apagar/Encender Grabadora");
                System.out.println("2. Subir Frecuencia");
                System.out.println("3. Bajar Frecuencia");
                System.out.println("4. Subir volumen");
                System.out.println("5. Bajar volumen");
                System.out.println("6. Silenciar");
                System.out.println("7. Cambiar la frecuencia por nombre de la emisora");                
                System.out.println("8. Cambiar la frecuencia por dial de la emisora");                
                System.out.println("------------------------------------");
                opcion = read.nextInt();
                read.nextLine();
                
                if (opcion==2) {
                    System.out.println(gb1.subirFrecuencia(1));                    
                }
                
                if (opcion == 3) {
                    System.out.println(gb1.bajarFrecuencia(1));                                       
                }
                
                if (opcion == 4) {
                    gb1.subirVolumen();              
                }
                
                if (opcion == 5) {
                    gb1.bajarVolumen();                 
                }
                
                if (opcion == 6) {             
                    System.out.println(gb1.silenciar(opcion));
                }
                
                if (opcion == 7) {
                    System.out.println("ingrese el nombre de la emisora");
                    String emisora = read.nextLine();
                    System.out.println(gb1.setFrecuencia(emisora));                             
                }
                
                if (opcion == 8) {
                    System.out.println("ingrese el dial de la emisora");
                    String dial = read.nextLine();
                    System.out.println(gb1.setDial(dial));             
                }
                
        } while (opcion != 1);
            
            if (opcion == 1) {
            System.out.println("|--------------------------------|");
            System.out.println("|La grabadora está apagada|");
            System.out.println("|--------------------------------|");
                System.out.println("\n");
        }
            
  //         ----PROYECTO MICROONDAS----
  
            Microwave mw1 = new Microwave("LG", "120VAC", "MP3015");
            System.out.println(mw1);
            
            do {
                System.out.println("Para encender el Microondas, presione 1");
                op = read.nextInt();
                mw1.encender(op);
                System.out.println(mw1);
            
        } while (op !=1);
            
           do {
               System.out.println("Ingrese la opción de su preferencia");
                System.out.println("------------------------------------");
                System.out.println("1. Apagar/Encender");
                System.out.println("2. Calentar alimentos opción segundos");
                System.out.println("3. Calentar alimentos opción minutos");          
                System.out.println("------------------------------------");
                opcion = read.nextInt();
                read.nextLine();
                
                if (opcion == 2) {
                    System.out.println("Ingrese el tiempo en segundos");
                    int segundos = read.nextInt();
                    mw1.segundosCoccion(segundos);                   
               }
                
                if (opcion == 3) {
                    System.out.println("Ingrese el tiempo en minutos");
                    int minutos = read.nextInt();
                    mw1.minutosCoccion(minutos);                   
               }
                
        } while (opcion != 1);
           
           if (opcion == 1) {
              System.out.println("|----------------------------------|");
            System.out.println("|El Microondas está apagado|");
            System.out.println("|----------------------------------|");
        }
        
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//          for (int i = segundos; i >= 0; i--) {
//              
//              System.out.println(i);
//              Thread.sleep(1000);
//              if (i==0) {
//              System.out.println("Abra la puerta. Los alimentos están listos");
//            
//        }
//        }
          
            
    }
    
}

