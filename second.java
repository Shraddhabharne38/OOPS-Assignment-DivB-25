import java.io.*;
public class second {
    public static void main(String[] args) throws IOException{
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Jar of Money");
  System.out.println("Enter the Number of Quarters :");
  double quarter = Integer.parseInt(br.readLine());
  System.out.println("Enter the Number of Dimes :");
  double dime = Integer.parseInt(br.readLine());
  System.out.println("Enter the Number of Nickels :");
  int nickel = Integer.parseInt(br.readLine());
  System.out.println("Enter the Number of Pennies :");
  int pennie = Integer.parseInt(br.readLine());
  
      double quarters = quarter * .25;
      double dimes = dime * .1;
      double nickels = nickel * .05;
      double pennies = pennie * 0.01;
  
  
      double sum =  quarters +  dimes +  nickels +  pennies;
int total = (int)sum;

      double cent_conv = (sum%1)*100;
      int cent = (int) cent_conv;
      System.out.println(total+" dollars and "+cent+" cents");
  
    }
  }