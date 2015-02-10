package Zoo;

class Animal{
     int legs = 4;
     boolean veg=false;
     String name= "";
    
    public void setFood(boolean foodType){
        this.veg = foodType;
    }

    public void setLegs(int foodType){
        this.legs = foodType;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    void setValues(String name, int legs, boolean foodType){
        setName(name);
        setFood(foodType);
        setLegs(legs);
    }
}

class Wildanimal extends Animal{
    boolean foodType = true;
    Wildanimal(String name,int legs){
        setValues(name, legs, this.foodType);
    }

}

class Herbivorose extends Animal{
    boolean foodType = false;
    Herbivorose(String name,int legs) {
        setValues(name, legs, this.foodType);
    }
}

class Cage {
    Cage next = null;
    Cage root ;
    Animal animal;

    //Put in wild animal cage
    public void putInWildCage(Wildanimal animal) {
        this.next.animal = this.root.animal;
        this.root.animal = animal;
    }
    //Put in herbivores cage
    public void putInHerbCage(Herbivorose animal){
        this.next.animal = this.root.animal;
        this.root.animal = animal;
        }
}


public class Zoo{
    
    public static void main(String[] args){
        //Create cage for different animal type
        Cage putinWildCage = new Cage();
        Cage putinHerbCage = new Cage();

        //Create some wild animals
        Wildanimal tiger = new Wildanimal("Lisa", 4);
        Wildanimal lion = new Wildanimal("Lina", 4);
        Wildanimal panthor = new Wildanimal("bett", 4);
        
        //Create some herbivorous
        Herbivorose dear = new Herbivorose("teli", 3);
        Herbivorose bear = new Herbivorose("tame", 3);
        Herbivorose monkey = new Herbivorose("tepp", 3);

        //we can not keep wild animals with herbivorous. So
        
        //Put Herbivores in herb cage
        putinHerbCage.putInHerbCage(dear);
        putinHerbCage.putInHerbCage(bear);
        putinHerbCage.putInHerbCage(monkey);
        
        //Put wild animal in wild cage
        putinWildCage.putInWildCage(tiger);
        putinWildCage.putInWildCage(lion);
        putinWildCage.putInWildCage(panthor);
        
        System.out.println(putinHerbCage.next.animal.name);

    }
    }
