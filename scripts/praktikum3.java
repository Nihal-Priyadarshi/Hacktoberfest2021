package scripts;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class praktikum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBatas;
        //menentukan batas array
        System.out.print("Masukan jumlah matkul uas :");
        jumlahBatas=in.nextInt();
        int [] dataArray = new int[jumlahBatas];
        int [] nilaiUas = new int [jumlahBatas];
        //input data array
        for(int i =0 ; i < nilaiUas.length ; i++){   
            System.out.print("Masukan nilai uas ke "+i+"=");
            nilaiUas[i]=in.nextInt();
        }
        //do loop for showing data
        for(int i =0 ; i < nilaiUas.length; i++){
            if(nilaiUas[i] >= 70){
            System.out.println("mahasiswa ke "+i +"dengan nilai "+nilaiUas[i]+" Graduated!");  
            }else{
            System.out.println("mahasiswa ke "+i+" dengan nilai "+nilaiUas[i]+" not pass!");
            }
        }   
    }
}
