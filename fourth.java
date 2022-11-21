import java.lang.Math;
class fourth{
    public static void main(String args[]){
        int i;
        double ans=0;
        double sum=0;
        
        // using for loop
        
        for(i=0;i<=(100-4);i++){
            // the pattern showed in the question is 
                //  cos(1 + (2) / ( (3)*(5) ) ) );
                //  cos(2 + (3) / ( (4)*(6) ) ) );
                //  cos(3 + (4) / ( (5)*(7) ) ) );
                // .       .       .   .
                // .       .       .   .
                // .       .       .   .
                // .       .       .   .
                // cos(96 + (97) / ( (98)*(100) ) ) );
            //  this can be deduced as follows 

            ans= Math.cos(i + (i+1) / ( (i+2)*(i+4) ) );
            sum+=ans;
        }
        System.out.println(sum);

        // Similarly, using while loop

        while(i <= (100-4) ){
            ans= Math.cos(i + (i+1) / ( (i+2)*(i+4) ) );
            sum+=ans;
            i++;
        }
        System.out.println(sum);

    }
}
