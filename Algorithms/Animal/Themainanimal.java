
package Animal;

public class Themainanimal {

    public static void main(String[] args) {

        // I create a Animal object named genericAnimal

        Animal genericAnimal = new Animal();
        //System.out.println(genericAnimal.getName());
        //System.out.println(genericAnimal.favFood);
        //genericAnimal.walkAround();


        // I create a Cat class like any other
        Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

        // Print out the name, favFood and favToy
        System.out.println(morris.getName());
        //System.out.println(morris.favFood);
        //System.out.println(morris.favToy);

        // You can also create classes based on the super class

        Animal tabby = new Cat("Tabby", "Salmon", "Ball");
        System.out.println(tabby.getName());

    }
}