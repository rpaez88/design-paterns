package com.mycompany.connectbd;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OMAR HC
 */
public class factory 
{
    public static IDbOperation getDBoperation(String name){
      if(Objects.equals(name,"mysql"))
        return new mysql();       
      else if (Objects.equals(name,"oracle"))
        return new oracle();
      else
        return new bdfail();
    }
}
       

