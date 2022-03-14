
package Chapter4Pets;


public class Dog {
    
    private String name;
    private int age;
    private String color;
    private String breed;
    private String gender;

    public Dog(String name, int age, String color, String breed, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int personYears()
    {
    return age*7;
    
    
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + 
                ", color=" + color + ", breed=" + breed + 
                ", gender=" + gender + "person-years: " + personYears() + '}';
    }
    
    
    
    
    
    
    
}
