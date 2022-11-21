public class first {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
              String c = " ";
              if (i >= 2 && i <= 9) {
                if (j >= 2 && j <= 13) {
                  if ( j == 2 ||j == 3 ||j == 4 ||  j == 11||  j == 12 ||  j == 13  ) c = "I";
                  if(i == 5 || i == 6){
                    if(j == 5||j == 6||j == 7||j == 8||  j == 9||  j == 10  )c = "I";
                  }
                  
                }
                if(i != 2 || i !=9 ){
                if ( j == 22 || j == 23|| j == 24) c = "H";
                }
                if (i==2 || i== 9){
                    if ( j==18|| j==19||j==20||j==21||j==25|| j==26||j==27||j==28) c = "H";
                }
                
              }
              System.out.print(c);
            }
            System.out.print("\n");
          }
    }
    
}

