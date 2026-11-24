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
public class W07L01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        for (int i = 1; i <= 20 ; i++){
            System.out.print(i + " ");
        }
        
        System.out.print("\nTriangular number: "+ triangular(num));
        
    }
    
    public static int triangular (int num){
        int triNum = 0;
        for (int i = 1; i <= num ; i++){
            triNum += i;
        }
        return triNum;
    }
    
}
