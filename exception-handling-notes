///
Exception Handling in Java is a mechanism to handle runtime errors so that the normal flow of the program can be maintained.

/// Causes of exceptions:

1. by zero
2.Accessing invalid array index
3.Null pointer access
4.File not found

///Type of exceptions - 1. Checked exception , 2. Runtime exception

''' basic try catch method example 

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

Output:
Cannot divide by zero

'''The following example shows how java java catch multiple example 

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[10] = 50 / 0; // Arithmatic exception , arr[10]= ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }

    }
}

Output:
Arithmetic Exception
