import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String s = sc.nextLine();
    int min = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'E') {
        min++;
      } else {
        min--;
        if (min < 1) {
          min = 1;
        }
      }
    }
    System.out.println(min);
    /*
     * input s= "EELEE"
     * output: 3
     * input s= "EL"
     * output: 1
     */
  }
}