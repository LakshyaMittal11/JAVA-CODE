import java.util.Scanner;
 class Months {
  public static void main(String K[] ) {
    Scanner ob = new Scanner(System.in);

    int month = 0;
    int days;

    System.out.print("Enter month number: ");
    month = ob.nextInt();

    switch (month) {
    case 4:
    case 6:
    case 9:
    case 11:
      days = 30;
      break;

    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      days = 31;
      break;

    case 2:
      days = 28;
      break;

    default:
      days = 0;
      break;
    }

    if (days != 0)
    System.out.println("valid");
    else
      System.out.println("You have entered an invalid month");
  }
}