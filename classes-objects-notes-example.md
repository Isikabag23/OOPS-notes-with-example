# Classes and objects 


#What is class ? 
Classes are like blueprint of objects it defines what properties and behaviours (Object) an object will have.
example - Car is a class it has can properties like - speed, brand, color 

#Functions that are defines under class called as methods
--like start()
stop()

## what is an object?
An object is specific instance created from that blueprint.
Example- Car1= BMW
Car2= Audi

'''Exmple Java 

class Pen {
String color;
String type;

void write() {
System.out.println("writing with the Pen");
}
}
public class Main {

    public static void main(String[] args) {

        Pen pen1 = new Pen();

        pen1.color = "Blue";
        pen1.type = "Gel";

        System.out.println("Pen color: " + pen1.color);
        System.out.println("Pen type: " + pen1.type);

        pen1.write();
    }
}
'''

