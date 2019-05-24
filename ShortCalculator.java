 


public class ShortCalculator {
    //get user
    
        /*public short claculator(short num1, short num2, String operator) {
            short result = 0;
            switch (operator) {
                case "+": 
                    result = (short)(num1 + num2);
                    break;
                case "-":
                    result = (short)(num1 - num2);
                    break;
                case "/":
                    result = (short)(num1 - num2);
                    break;
                case "*":
                    result = (short)(num1 - num2);
                    break;    
                case "%": 
                    result = (short)(num1 % num2);
                    break;
                default: 
                    System.out.println("Please enter a valid operator");
                }    
            return result;
        }  
       */
      
      public short add (short num1, short num2) {
         return (short)(Math.abs(num1 + num2));
        }
        
      public short subtract (short num1, short num2) {
          return (short)(Math.abs(num1 - num2));
        }
      
      public short multiply (short num1, short num2) {
          return (short)(Math.abs(num1 * num2));
        }
        
      public short divide (short num1, short num2) {
          return (short)(Math.abs(num1 / num2));
        }
        
      public short modulus (short num1, short num2) {
          return (short)(num1 % num2);
        }  
}
