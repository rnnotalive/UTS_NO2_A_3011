package com.mycompany.uts_no3_a_3011;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ProjectPlanner extends Perusahaan{
    int gajiPokok;
    int totalHasilProyek;
    int komisi;
    
    public void totalGaji(double gajian){
        gaji = gajiPokok + (komisi * totalHasilProyek) - (0,05 * gajiPokok);
        System.out.println(gajian);
    }
    
    public void tampilDataProjectPlanner(){
        String nip_3011 = null;
        System.out.println("NIP             : " + nip_3011);
        String nama_3011 = null;
        System.out.println("Nama            : " + nama_3011);
        String gaji_3011 = null;
        System.out.println("Gaji            : " + gaji_3011);
        String komisi_3011 = null;
        System.out.println("Komisi          : " + komisi_3011);
        String totalProyek_3011 = null;
        System.out.println("Total Proyek    : " + totalProyek_3011);
    }
}
