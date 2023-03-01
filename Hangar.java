// Crée une classe Hangar qui possédera une méthode main()

class Hangar {

    public static void main (String... args){

// Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
        Car peugeot = new Car("peugeot");
        Boat zodiac = new Boat("zodiac");
// Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()       
        System.out.println(peugeot.doStuff());
        System.out.println(zodiac.doStuff());
        
    }
}