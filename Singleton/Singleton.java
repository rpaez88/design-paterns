package com.mycompany.clientsingle;

/**
 *
 * @author OMAR HC
 */
public class Singleton {
    //Declaración del objeto llamado pSingleton de la clase Singleton
    private static Singleton pSingleton;  //null
    
    //Para evitar instancia mediante operador "new"
    //constructor
    private Singleton(){
    
    }
    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Singleton getInstance(){
        if (pSingleton==null)
            pSingleton = new Singleton();
    return pSingleton;
    }

	//Método de prueba
	public void opensesion() {
		System.out.println("Me conecté");
	}
	
	//Método de prueba
	public void closesesion() {
		System.out.println("Me desconecté");
	}

}
