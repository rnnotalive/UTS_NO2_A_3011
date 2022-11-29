/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class CommissionEmployee extends Perusahaan{
    int gajiPokok;
    int totalPenjualan;
    int komisi;
    
    public void totalGaji(double gajian){
        gaji = gajiPokok + (komisi * totalPenjualan);
        System.out.println(gajian);
    }
    
    public void tampilDataCommisionEmployee(){
        System.out.println("NIP             : " + nip_3011);
        System.out.println("Nama            : " + nama_3011);
        System.out.println("Gaji            : " + gaji_3011);
        System.out.println("Komisi          : " + komisi_3011);
        System.out.println("Total Penjualan : " + totalPenjualan_3011);
    }
}

