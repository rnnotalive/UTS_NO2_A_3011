/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class SalariedEmployee extends Perusahaan{
    int gajiPokok;
    
    public void totalGaji(double gajian){
        gaji = gajiPokok;
        System.out.println(gajian);
    }
    
    public void tampilDataSalariedEmployee(){
        System.out.println("NIP             : " + nip_3011);
        System.out.println("Nama            : " + nama_3011);
        System.out.println("Gaji            : " + gaji_3011);
    }
}
