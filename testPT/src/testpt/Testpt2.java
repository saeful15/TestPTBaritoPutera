/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpt;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Testpt2 {
    
    
    public static void main(String[] args) {
        String angka;
        int[] koma =new int[100],nilai;
        int idx=0,saham=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("masukan angka penjedanya koma dan 1 spasi: ");
        angka=keyboard.nextLine();
        for(int x=0;x<angka.length();x++){
            if(angka.toCharArray()[x]==','){
                koma[idx]=x;
                idx++;
            }          
        }
        
        nilai =new int[idx+1];
        nilai[0]=Integer.parseInt(angka.substring(0,koma[0]));
        for(int x=1;x<idx;x++){
            nilai[x]=Integer.parseInt( angka.substring(koma[x-1]+2,koma[x]));
        }
        nilai[idx]=Integer.parseInt(angka.substring(koma[idx-1]+2,angka.length()));
        for(int x=0;x<nilai.length;x++){
            for(int y=0; y<nilai.length;y++){
                if(saham<nilai[y]-nilai[x] && x<y){
                    saham=nilai[y]-nilai[x];
                }
            }
        }
        System.out.println("hasilnya adalah :"+saham);
        
    }
}
