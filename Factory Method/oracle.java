/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connectbd;

/**
 *
 * @author OMAR HC
 */
public class oracle implements IDbOperation {
    public oracle() { }

    @Override
    public String getconect(){
        return "Conexión a oracle ....";
    }
    @Override
    public String getdisconect(){
        return "Cerrando oracle .. .. .";
    }

    
}
