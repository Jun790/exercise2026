/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W07;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class W07L02 {
    public static void multiPrint(int n, char c){
        for (int i = 0; i < n; i++){
            System.out.print(c);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        System.out.println("Triangle:");
        for (int i = 1; i <= num; i++){
            multiPrint(i,'*');
            System.out.println();
        }
        
        System.out.println("Diamond:");
        
        for (int i = 1; i <= num; i++){
            multiPrint(num - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        
        for (int i = num - 1; i >= 1; i--){
            multiPrint(num - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        
        
        
    }
    
}
