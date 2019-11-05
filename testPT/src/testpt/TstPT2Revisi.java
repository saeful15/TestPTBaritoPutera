/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpt;

/**
 *
 * @author ASUS
 */
public class TstPT2Revisi {
     public static void main(String[] args) {
        int[] angka ={10,15,8,7,14};
        int saham=0;
        for(int x=0;x<angka.length;x++){
            for(int y=0; y<angka.length;y++){
                if(saham<angka[y]-angka[x] && x<y){
                    saham=angka[y]-angka[x];
                }
            }
        }
        System.out.println("hasilnya adalah :"+saham);
        
    }
}
