/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._uas_anandaadhitamaa_4b;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */
public class Database {
    public static int id = 0;
    public static Connection conn;
    
    public static Connection Konek(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://adhitinvest.my.id/pemkom", "publik", "123");
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
            conn =  null;
        }
        
        return conn;
    }
    
    public static Connection KoneksiAktif(){
        return conn;
    }
}
