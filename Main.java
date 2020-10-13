/**
 * method that divides parameter equally 
 * @author Darian
 */
public class Main {
  // method factors
  public static void factors(int num){
    // this will check every number to see if it is divisible by num
    for (int i = 1; i <= num; i++){
      // if the number is divisble, print it to screen
      if (num % i == 0){
        System.out.println(i);
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // call out the method
    factors(30);
    
  }
}
