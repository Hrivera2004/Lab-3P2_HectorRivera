
package lab.pkg3p2_hectorrivera;
import java.util.ArrayList;
    import java.util.Scanner;
/**
 *
 * @author hrolriverav
 */
public class Lab3P2_HectorRivera {
    static ArrayList<Pokeball> Inventory= new ArrayList<Pokeball>();
    static ArrayList<Pokemon> Pokemons= new ArrayList<Pokemon>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int opcion = 0;
        while(opcion!=7){
            System.out.println("----------Menu----------");
            System.out.println("1.Crear Pokemon\n2.Crear Pokebola\n3.Listar pokemon\n4.Eliminar pokemon \n5.capturar pokemon \n6.Modificar Pokemon\n7.Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("--------------------------------");
                    System.out.println("Que tipo de pokemon desea crear\n1.Tipo fuego\n2.Tipo Agua\n3.Tipo grama");
                    int tipo = sc.nextInt();
                    build(tipo);     

                    System.out.println("\nPokemon agregado");
                }break;
                case 2:{
                    sc.nextLine();
                    System.out.println("Ingrese el color de su pokebola");
                    String color = sc.nextLine();
                    System.out.println("Ingrese la efficiencia de captura");
                    int efective = sc.nextInt();
                    while(efective>3 || efective<1){
                        System.out.println("Ingrese valor valido");
                        efective = sc.nextInt();
                    }   
                    System.out.println("Ingrese la seria de la pokebola");
                    int serie = sc.nextInt();
                    Inventory.add(new Pokeball(color,serie,efective));
                }break;
                case 3:{
                    String watertype = "";
                    String firetype = "";
                    String greentype = "";
                    
                    for (Pokemon p : Pokemons) {
                        if (p instanceof WaterType) {
                            watertype+= p+"\n";
                        } else if (p instanceof FireType) {
                            firetype+= p+"\n";
                        } else if (p instanceof GrassType) {
                            greentype+= p+"\n";
                        }
                    }
                    System.out.println("---FireType---\n"+firetype);
                    System.out.println("---watertype---\n"+watertype);
                    System.out.println("---greenType---\n"+greentype);
                    
                }break;
                case 4:{
                    System.out.println("Que tipo de pokemon desea borrar\n1.Tipo fuego\n2.Tipo Agua\n3.Tipo grama");
                    int tipo = sc.nextInt();
                    switch(tipo){
                        
                    }
                }break;
                case 5:{
                    
                }break;
                case 6:{
                    
                }break;
                case 7:break;
                default:
                    System.out.println("Ingrese un valor valido");
            }
        }
    }
    public static void print(){
        for (int i = 0; i < Inventory.size(); i++) {
            System.out.println(Inventory.get(i));
        }
    }
    public static void build(int tipo){
        sc.nextLine();
        System.out.println("Ingrese nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese la naturaleza(Timido, Energetico, Misterioso)");
        String nature = sc.nextLine();
        while((nature.equalsIgnoreCase("timido") || nature.equalsIgnoreCase("energetico")|| nature.equalsIgnoreCase("misterioso"))==false){
            System.out.println("\nIngrese naturaleza valida");
            System.out.println("Ingrese la naturaleza(Timido, Energetico, Misterioso)");
            nature = sc.nextLine();
        }
        
        System.out.println("Ingrese el numero de entrada");
        int numEntry = sc.nextInt();
        
        switch(tipo){
            case 1:{
                System.out.println("Ingrese la potencia del fuego");
                int potencia = sc.nextInt();
                Pokemons.add(new FireType(potencia, name, numEntry, nature));
            }break;
            case 2:{
                System.out.println("Ingrse la velocidad dentro del agua");
                int speed = sc.nextInt();
                
                sc.nextLine();
                System.out.println("Puede vivir fuera del agua(si o no)");
                String fueraDeAgua = sc.nextLine(); 
                while( (fueraDeAgua.equalsIgnoreCase("si") || fueraDeAgua.equalsIgnoreCase("no")) == false){
                    System.out.println("Ingrese opcion valida");
                    System.out.println("Puede vivir fuera del agua(si o no)");
                    fueraDeAgua = sc.nextLine(); 
                }
                if (fueraDeAgua.equalsIgnoreCase("si")) {
                    Pokemons.add(new WaterType(true, speed, name, numEntry, nature));
                }else if (fueraDeAgua.equalsIgnoreCase("no")){
                    Pokemons.add(new WaterType(false, speed, name, numEntry, nature));
                }
                
            }break;
            case 3:{
                System.out.println("Ingrese el dominio que tiene sobre las plantas");
                int dom = sc.nextInt();
                while(dom<1 || dom>100){
                    System.out.println("Ingrese velocidad valida 1-100");
                    dom = sc.nextInt();
                }
                sc.nextLine();
                System.out.println("Ingrese habitat");
                String habitat = sc.nextLine();
                Pokemons.add(new GrassType(habitat, dom, name, numEntry, nature));
            }break;
        }

    }
}
