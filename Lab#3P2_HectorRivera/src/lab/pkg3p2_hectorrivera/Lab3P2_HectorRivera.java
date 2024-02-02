
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
            System.out.println("1.Crear Pokemon\n2.Crear Pokebola\n3.Listar pokemon\n4.Eliminar pokemon \n5.capturar pokemon \n 6.Modificar Pokemon\n 7.Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("--------------------------------");
                    System.out.println("Que tipo de pokemon desea crear\n1.Tipo fuego\n2.Tipo Agua\n3.Tipo grama");
                    int tipo = sc.nextInt();
                    build(tipo);1
                            
                    System.out.println("--------------------------------");
                    print();
                }break;
                case 2:{
                    
                }break;
                case 3:{
                    
                }break;
                case 4:{
                    
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
        for (int i = 0; i < Pokemons.size(); i++) {
            System.out.println(Pokemons.get(i));
        }
    }
    public static void build(int tipo){
        sc.nextLine();
        System.out.println("Ingrese nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese la naturaleza(Timido, Energetico, Misterioso)");
        String nature = sc.nextLine();
        if (nature.equalsIgnoreCase("timido") || nature.equalsIgnoreCase("energetico")|| nature.equalsIgnoreCase("misterioso")) {
            
        }
        while(nature.toLowerCase() != "timido" || nature.toLowerCase() != "energetico" || nature.toLowerCase() != "misterioso"){
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
                
            
            }break;
            case 3:{

            }break;
        }

    }
}
