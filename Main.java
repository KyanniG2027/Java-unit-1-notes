// Every Java file is a CLASS
public class Main {
       //main method is the ENTREWAY to the program
   public static void main(String []args) {
      System.out.println("Welcome to Java!");
      System.out.println("hiiii");
 
      // 1. DECLARE a new variable
      int score; 
      // 2. ASSIGN a value to the variable
      score = 13;
      // 3. INITIALIZE combines declaring + assigning in one step
      String pokemon = "Pikachu";
      double healthPercent = 0.75; 
      boolean isAlive = true;


   // use the plus sign to CONCATENATE (combine) Strings
   String greeting = "Hello " + "World";
   System.out.println(greeting);
   //Quotation marks contain STRING LITERALS
   

      //OUTPUT: diffrence between.print & .println
      System.out.print("Hi");
      System.out.println("there");
      System.out.print("!");
      //.oprintln displays the message THEN goes to next line

      //ESCAPE: use\ (backslash) to include specidal characters, use \n for line break
      String message = "\nI woke up and said, \"HELLO WORLD\"";
      System.out.println(message);

      // ARITHMETIC expressions with operators
      System.out.println(4+3);
      System.out.println(4-1);
      System.out.println(6*7);
      System.out.println(5/3); //TRUNCATED! 
      // Integer division results in TRUNCATION, which is basically throwing away the decimal places 
      System.out.println(5.0/3); //double  

      // COMPOUND expressions follow PEMDAS 
      double result = 2+(3*2-6);
      System.out.println(result);
      
      //REMAINDER % operator 
      int remain = 23 % 2; //1 -> means ODD number 
      System.out.println(remain);
      System.out.println(628 % 2); //0-> means EVEN

      // Watch out for the plus sign! 
      System.out.println(3+"3");

   }
}

