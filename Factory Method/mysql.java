package com.mycompany.connectbd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OMAR HC
 */
public class mysql implements IDbOperation {
    public mysql() { }
    
    @Override
    public String getconect(){
        return "Conexión a MySQL ....";
    }
    @Override
    public String getdisconect(){
        return "Cerrando MySQL .. .. .";
    }
    
}
