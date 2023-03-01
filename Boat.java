// Crée une classe Boat qui étend la classe Vehicle

public class Boat extends Vehicle {

    
    public Boat(String brand){
        super(brand);
    }

// Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff(). Pour Car, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour Boat : "Je suis {brand} et je fais glou glou !"
    public String doStuff(){
        return "Je suis " +getBrand()+ " et je fais glou glou !";
    }
}