import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i =1 ; i< a*b+1; i++) {
            System.out.print("*");
             if(i % a == 0) {
                    System.out.println("");
                   }
                
        } 

       
    }
}