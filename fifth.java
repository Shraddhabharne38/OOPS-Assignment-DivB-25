import java.io.*;

public class fifth {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  input;
        char choice;
        String f = "Student's Name";
        while (true) {
            
            System.out.println("\nINPUT TEXT: " + f+"\n");
            System.out.println("(a) Input a new line of text\n");
            System.out.println("(b) Reverse display the text\n");
            System.out.println("(c) Display the most used characters\n");
            System.out.println("(d) Quit\n \n ");

            System.out.println("Your Choice -> : \n");
            input = br.readLine(); 
            
                choice = input.charAt(0);
        
            switch (choice) {

                case 'a':
                System.out.print("\n");
                    System.out.println("Ener new Text");
                    System.out.print("\n");
                    String newText = br.readLine();
                    f = f.replace("Student's Name", newText);
                    break;

                case 'b':
                    String nstr = "";
                    char ch;

                    System.out.print("Original word: "+f);
                    

                    for (int i = 0; i < f.length(); i++) {
                        ch = f.charAt(i);
                        nstr = ch + nstr;
                    }
                    System.out.println("\nReversed word: " + nstr);

                    break;

                case 'c':

                    int count[] = new int[256];
                    int len = f.length();
                    for (int i = 0; i < len; i++)
                        count[f.charAt(i)]++;

                    int max = -1;
                    char result = ' ';

                    for (int i = 0; i < len; i++) {
                        if (max < count[f.charAt(i)]) {
                            max = count[f.charAt(i)];
                            result = f.charAt(i);
                        }
                    }

                    System.out.println("Max occurring character is "
                            + result);

                    break;

                case 'd':
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
            }
        }
    }
}