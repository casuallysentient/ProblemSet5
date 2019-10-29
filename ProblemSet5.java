/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
  public static void main(String[] args) {
    ProblemSet5 ps = new ProblemSet5();

    System.out.println(ps.surroundMe("il", "Rely"));
  }

  /*
  * Exercise 1.
  *
  * Given two strings, return a new string built by surrounding in with the first
  * and last two characters of out.
  */

  public String surroundMe(String in, String out) {
    if (!in.equals(null) & !out.equals(null) && out.length() == 4) {
      String outHalf1 = out.substring(0, 2);
      String outHalf2 = out.substring(2);
      String rearrangedString = outHalf1 + in + outHalf2;
      return rearrangedString;
    } else {
      return in;
    }
  }

  /*
  * Exercise 2.
  *
  * Given a string and an integer, return a new string that represents the first
  * and last n characters of text.
  */

  public String endsMeet(String text, int n) {
    return("placeholder");
  }

  /*
  * Exercise 3.
  *
  * Given a string, return a new string using the middle three characters of text.
  */

  public String middleMan(String text) {
    return("placeholder");
  }

  /*
  * Exercise 4.
  *
  * Given two strings, determine whether or not target is equivalent to the middle
  * three characters of text.
  */

  public boolean isCentered(String text, String target) {
    return(true);
  }

  /*
  * Exercise 5.
  *
  * Given a string and a character, compute the number of words that end in suffix.
  */

  public int countMe(String text, char suffix) {
    return(5);
  }

  /*
  * Exercise 6.
  *
  * Given a string, compute the number of triplets in text.
  */

  public int triplets(String text) {
    return(5);
  }

  /*
  * Exercise 7.
  *
  * Given a string, compute the sum of the digits in text.
  */

  public long addMe(String text) {
    return(5);
  }

  /*
  * Exercise 8.
  *
  * Given a string, compute the length of the longest sequence.
  */

  public long sequence(String text) {
    return(5);
  }

  /*
  * Exercise 9.
  *
  * Given two strings, return a new string built by intertwining each of the
  * characters of a and b.
  */

  public String intertwine(String a, String b) {
    return("placeholder");
  }

  /*
  * Exercise 10.
  *
  * Given a string, determine whether or not it is a palindrome.
  */

  public boolean isPalindrome(String text) {
    return(true);
  }
}