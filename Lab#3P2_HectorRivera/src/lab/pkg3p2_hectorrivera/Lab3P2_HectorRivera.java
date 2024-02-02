
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
                    while(tipo> 3 || tipo <1){
                        System.out.println("Ingrese valor valido");
                        tipo = sc.nextInt();
                    }
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
                    while(tipo> 3 || tipo <1){
                        System.out.println("Ingrese valor valido");
                        tipo = sc.nextInt();
                    }
                    switch(tipo){
                        case 1:{
                            for (int i = 0; i < Pokemons.size(); i++) {
                                if (Pokemons.get(i) instanceof FireType) {
                                    System.out.println(i+"."+Pokemons.get(i));
                                }
                            }
                            System.out.println("Cual desea borrar?");
                            int delete = sc.nextInt();
                            if (Pokemons.get(delete) instanceof FireType ) {
                                Pokemons.remove(delete);
                            }else{
                                System.out.println("No es parte de la lista");
                            }
                        }break;
                        case 2:{
                            for (int i = 0; i < Pokemons.size(); i++) {
                                if (Pokemons.get(i) instanceof WaterType) {
                                    System.out.println(i+"."+Pokemons.get(i));
                                }
                            }
                            System.out.println("Cual desea borrar?");
                            int delete = sc.nextInt();
                            if (Pokemons.get(delete) instanceof WaterType ) {
                                Pokemons.remove(delete);
                            }else{
                                System.out.println("No es parte de la lista");
                            }
                        }break;
                        case 3:{
                            for (int i = 0; i < Pokemons.size(); i++) {
                                if (Pokemons.get(i) instanceof GrassType) {
                                    System.out.println(i+"."+Pokemons.get(i));
                                }
                            }
                            System.out.println("Cual desea borrar?");
                            int delete = sc.nextInt();
                            if (Pokemons.get(delete) instanceof GrassType ) {
                                Pokemons.remove(delete);
                            }else{
                                System.out.println("No es parte de la lista");
                            }
                            System.out.println("\nBorrado\n");
                        }break;
                    }
                }break;
                case 5:{
                    
                }break;
                case 6:{
                    System.out.println("Que tipo de pokemon desea modificar\n1.Tipo fuego\n2.Tipo Agua\n3.Tipo grama");
                    int tipo = sc.nextInt();
                    while(tipo> 3 || tipo <1){
                        System.out.println("Ingrese valor valido");
                        tipo = sc.nextInt();
                    }
                    System.out.println("Ingrese el pokemon a modificar");
                    int mod = sc.nextInt();
                    if (Pokemons.get(mod).isCaptured()==true) {
                            if (tipo == 1 && Pokemons.get(mod) instanceof FireType) {


                                System.out.println("Que desea modificar");
                                System.out.println("1.Nombre\n2.Numero de entrada\n3.potencia llamas");
                                int Modificar = sc.nextInt();

                                while(Modificar> 3 || Modificar <1){
                                System.out.println("Ingrese valor valido");
                                Modificar = sc.nextInt();
                                }

                                switch(Modificar){
                                    case 1:{
                                        sc.nextLine();
                                        System.out.println("ingrese nuevo nombre");
                                        Pokemons.get(mod).setName(sc.nextLine());
                                    }break;
                                    case 2:{
                                        System.out.println("ingrese nuevo numero de entrada");
                                        Pokemons.get(mod).setNumEntry(sc.nextInt());
                                    }break;
                                    case 3:{
                                        System.out.println("Ingrese nueva potencia de llamas");
                                        ((FireType)Pokemons.get(mod)).setPower(sc.nextInt());
                                    }break;

                                }
                        }else{
                            System.out.println("el pokemon no es del tipo que elgio");
                        }//fin 1

                        if (tipo == 2 && Pokemons.get(mod) instanceof WaterType) {

                            System.out.println("Que desea modificar");
                            System.out.println("1.Nombre\n2.Numero de entrada\n3.Puede vivir fuera de agua");
                            int Modificar = sc.nextInt();

                            while(Modificar> 3 || Modificar <1){
                            System.out.println("Ingrese valor valido");
                            Modificar = sc.nextInt();
                            }

                            switch(Modificar){
                                case 1:{
                                    sc.nextLine();
                                    System.out.println("ingrese nuevo nombre");
                                    Pokemons.get(mod).setName(sc.nextLine());
                                }break;
                                case 2:{
                                    System.out.println("ingrese nuevo numero de entrada");
                                    Pokemons.get(mod).setNumEntry(sc.nextInt());
                                }break;
                                case 3:{
                                    System.out.println("Puede vivir fuera del agua(si o no)");
                                    String fueraDeAgua = sc.nextLine(); 
                                    while( (fueraDeAgua.equalsIgnoreCase("si") || fueraDeAgua.equalsIgnoreCase("no")) == false){
                                        System.out.println("Ingrese opcion valida");
                                        System.out.println("Puede vivir fuera del agua(si o no)");
                                        fueraDeAgua = sc.nextLine(); 
                                    }
                                    if (fueraDeAgua.equalsIgnoreCase("si")) {
                                        ((WaterType)Pokemons.get(mod)).setOutOfWater(true);
                                    }else if (fueraDeAgua.equalsIgnoreCase("no")){
                                        ((WaterType)Pokemons.get(mod)).setOutOfWater(false);
                                    }
                                }break;

                            }
                        }else{
                            System.out.println("el pokemon no es del tipo que elgio");
                        }//fin 2

                        if (tipo == 3 && Pokemons.get(mod) instanceof GrassType) {

                                System.out.println("Que desea modificar");
                                System.out.println("1.Nombre\n2.Numero de entrada\n3.habitat");
                                int Modificar = sc.nextInt();

                                while(Modificar> 3 || Modificar <1){
                                System.out.println("Ingrese valor valido");
                                Modificar = sc.nextInt();
                                }

                                switch(Modificar){
                                    case 1:{
                                        sc.nextLine();
                                        System.out.println("ingrese nuevo nombre");
                                        Pokemons.get(mod).setName(sc.nextLine());
                                    }break;
                                    case 2:{
                                        System.out.println("ingrese nuevo numero de entrada");
                                        Pokemons.get(mod).setNumEntry(sc.nextInt());
                                    }break;
                                    case 3:{
                                        sc.nextLine();
                                        System.out.println("Ingrese nuevo habitat");
                                        ((GrassType)Pokemons.get(mod)).setHabitat(sc.nextLine());
                                    }break;

                                }
                            System.out.println("\nMOdificado correctamente\n");    
                        }else{
                            System.out.println("el pokemon no es del tipo que elgio");
                        }//fin 3
                    }else{
                        System.out.println("No se puede modificar");
                    }//fin if
                    
                }break;//fin opc 6
                
                case 7:break;
                default:
                    System.out.println("Ingrese un valor valido");
            }//fin switch
        }//fin while
    }//fin main
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
