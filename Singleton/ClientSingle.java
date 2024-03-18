package com.mycompany.clientsingle;

/**
 *
 * @author OMAR HC
 */
public class ClientSingle {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
      Singleton single1 = Singleton.getInstance();
      Singleton single2 = Singleton.getInstance();
      System.out.println("This is de hashcode1: "+single1.hashCode());
      System.out.println("This is de hashcode2: "+single2.hashCode());
      
      //acceso los metodos
      single1.opensesion();
      single1.closesesion();
      single2.opensesion();
      single2.closesesion();
      
    }
}

