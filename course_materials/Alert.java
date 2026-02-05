public class Alert
{
public static void main (String[] args) {
    System.out.println(" An Emergency Broadcast I created my second program");
    System.out.println("by your name");
    }
}

// 1. Change Alert to alert.
// This causes a syntax error: the class name no longer matches the file name.

// 2. Change Emergency to emergency
// This causes a logical error: while the code ran, its output did not meet the requirement of the exercise

// 3. Remove the first quotation mark in the string
// This causes a syntax error: the first quotation mark starts the string. Without it, the compiler does not know where the string starts

// 4. Remove the last quotation mark in the string
// This causes a syntax error: the last quotation mark of the string marks the end of the string. Without it, the compiler does not know where the string ends

// 5. Change main to man.
// This causes a syntax error: the main function is the start of the program. Removing it prevents the program from knowing where to start

// 6. Change println to bogus.
// This causes a syntax error: the println function refers to a specific pre-built function in Java. When it's changed, the compiler is searching for a function called "bogus" and can't find it

// 7. Remove the semicolon at the end of the println statement.
// This causes a syntax error: Java requires a semicolon at the end of each line of code to identify where the code ends.

// 8. Remove the last brace in the program.
// This causes a syntax error: Java requires an end brace for every start brace, as otherwise the compiler wouldn't know where each function or block starts and ends