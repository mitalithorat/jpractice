public class JavaCharacterToTitleCaseExample1 {  
    public static void main(String[] args) {  
      // Create four char primitives ch1, ch2, ch3 and ch4.  
      char ch1, ch2, ch3, ch4;  
      // Assign  the values to ch1 and ch2.  
      ch1 = 'b';  
      ch2 = 'm';  
      // Assign the titlecase of ch1 and ch2 to ch3 and ch4 respectively.  
      ch3 = Character.toTitleCase(ch1);  
      ch4 = Character.toTitleCase(ch2);  
      String str1 = "The titlecase of character '" + ch1 + "' is given as: " + ch3;  
      String str2 = "The titlecase of character '" + ch2 + "' is given as: " + ch4;  
      // Print the values of ch3 and ch4.  
      System.out.println( str1 );  
      System.out.println( str2 );  
   }  
}