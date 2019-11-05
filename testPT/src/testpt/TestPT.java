/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpt;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kata,pertama="",obj="",tengah;
        int index=0;
        char[] perbandingan;
       
        Scanner keyboard = new Scanner(System.in);
        String[] Lis={"hit","dot","dog","lot","log"};
        System.out.print("masukan kata: ");
        kata = keyboard.nextLine();
        perbandingan=kata.toCharArray();
        for(int x=0;x<perbandingan.length;x++){
            if(perbandingan[x]==' '){
                obj=kata.substring(x+1,kata.length());
                pertama=kata.substring(0,x);
                break;
            }
        }
        System.out.println(pertama+ " ");
        for(int x=0;x<Lis.length;x++){
            if(obj.equals(Lis[x])){
                index=x-1;
            }
        }
        tengah=Lis[index];
        if(index==0){
            tengah="hot";
        }
        System.out.println(pertama+" "+tengah+" "+obj);
        
    }
    
}
