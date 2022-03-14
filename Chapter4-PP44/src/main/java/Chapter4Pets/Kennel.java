package Chapter4Pets;

public class Kennel {

    public static void main(String[] args) {
        Dog d1 = new Dog("Spots", 4, "brown", "German-Sheppard", "Male");
        Dog d2 = new Dog("Honey", 2, "blonde", "Golden-Retriever", "Female");
        Dog d3 = new Dog("Blue", 6, "black", "Border-Collie", "Male");
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        System.out.println("Setting up new age to Honey");
        d2.setAge(d2.getAge()+1);
        System.out.println("Happy Birthday " + d2.getName() +":" +
                                d2.getAge() + ". ");
        System.out.println("You are now " + d2.personYears() 
                            + " years old in person-years"); // 5.1, 5.2, 5.4, 5.5
        
        
    }

}
