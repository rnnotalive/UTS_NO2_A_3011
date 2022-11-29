/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class UTS_NO2_A_3011 {

    public static void main(String[] args) {
        CommissionEmployee ce =new CommissionEmployee();
        SalariedEmployee se =new SalariedEmployee();
        ProjectPlanner pp =new ProjectPlanner();
                
        ce.nip_3011 = "30111";
        ce.nama_3011 = "Esa Mahesa";
        ce.gaji_3011 = "5000000";
        ce.komisi_3011 = "300000";
        ce.totalPenjualan_3011 = "50";
        
        se.nip_3011 = "30112";
        se.nama_3011 = "Danille Shea";
        se.gaji_3011 = "600000";
        
        pp.nip_3011 = "30113";
        pp.nama_3011 = "Jaka Malaka";
        pp.gaji_3011 = "550000";
        pp.komisi_3011 = "250000";
        pp.totalProyek_3011 = "15";
        
        ce.tampilDataCommisionEmployee();
        ce.totalGaji(0);
        se.tampilDataSalariedEmployee();
        se.totalGaji(0);
        pp.tampilDataProjectPlanner();
        pp.totalGaji(0);        
    }
}