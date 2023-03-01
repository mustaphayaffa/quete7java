public abstract class Vehicle {

    // Ajoute les attributs String brand et int kilometers
    private String brand;
    private int kilometers;

    // Crée un constructeur permettant d'initialiser brand et kilometers
    public Vehicle(String brand){
        this.brand = brand;
        this.kilometers = 0;
    }

    // Ajoute des getters et setters pour tous les attributs, en respectant les conventions
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }
    public void setKilometers(int kilometers){
        this.kilometers = kilometers;
    }

    // ajoute dans Vehicle la méthode abstraite public String doStuff()
    public abstract String doStuff();


}