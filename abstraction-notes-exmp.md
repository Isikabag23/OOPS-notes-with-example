// Abstraction

// Abstraction is the process of hiding the details(Properties and methods) and showing the only the essentials features of the object. 
Example- Like if i see a DVD we use that to listen music / movie but in under of that there is so much complex components that functioned
to hide that complex components there is a outer layer.

**Abstraction is achieved by abstract class and interfaces.**
// Can provide 100 % abstraction while interface provides patrtial abstraction 

'''Example file name- TVS.java
abstract class Bike
{
abstract void run ();
}
class TVS extends Bike 
{
 void run()
{
System.out.println("Running safely");
}
public static void main(String args[])
{
Bike obj=new TVS();
obj.run();
}
}
