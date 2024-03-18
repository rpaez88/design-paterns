package prototype;

public class ClientPrototype {

    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        circulo1.setNombre("Circulo de sol");
        circulo1.setColor("Red");
        circulo1.setMaterial(new Material());
        circulo1.getMaterial().setTipo("Metal");
       
        
        System.out.println("Circulo1, name: "+circulo1.getNombre());
        System.out.println("Circulo 1, color: "+circulo1.getColor());
        System.out.println("Circulo 1, material: "+circulo1.getMaterial().getTipo());
        System.out.println("");
        
        Circulo circulo2 = (Circulo)circulo1.clonar();
        circulo2.setNombre("Circulo de fuego");
        circulo2.setColor("Black");
        circulo2.getMaterial().setTipo("Madera");
        
        System.out.println("Circulo 2, name: "+circulo2.getNombre());
        System.out.println("Circulo 2, color: "+circulo2.getColor());
        System.out.println("Circulo 2, material: "+circulo2.getMaterial().getTipo());
        System.out.println("");
        
        System.out.println("Comprobando si se hizo referencia al objeto material del Circulo 1");
        System.out.println("Circulo 1, material: " + circulo1.getMaterial().getTipo());
        
        ////Figura triangulo
//        Triangulo triangulo1 = new Triangulo();
//        triangulo1.setNombre("equilatero");
//        triangulo1.setColor("White");
//        
//        System.out.println("Triangulo 1, name: "+triangulo1.getNombre());
//        System.out.println("Triangulo1, color:: "+triangulo1.getColor());
//        System.out.println("");
    }
}
