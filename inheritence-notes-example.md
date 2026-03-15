// Inheritence propeties allows one class to acquire the fields and methods of another class using *extends* keyword.

// The class being inheritated is a called the Superclass and inherited class is called subclass.

Example - Animal class ->1.Dog class
2.Cat class 
3.Cow class

'''Example Animal.java 
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {   // Dog inherits Animal
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // own method
    }
}

*** Output- This animal eats food 
Dog is barking 



