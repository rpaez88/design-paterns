package prototype;

/**
 *
 * @author OMAR HC
 */
public class Circulo implements Figura, Prototype<Figura> {
    private String nombre;
    private String color;
    private Integer radio;
    private Material material;

    public Circulo (){}
   
//nombre
    @Override
    public void setNombre (String n){
        this.nombre = n;
    }

    @Override
    public String getNombre() {
        return this.nombre;        
    }
//color
    @Override
    public void setColor (String c){
        this.color = c;
    }
       
    @Override
    public String getColor(){
        return this.color;
    }
    
    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }
       
    @Override
    public Figura clonar() {
        Figura figura = new Circulo();  
        figura.setNombre(this.nombre);
        figura.setColor(this.color);
        
        //sin hacer el clonar, se hace la referencia
        //figura.setMaterial(this.material);
        
        //haciendo el clonar, no se hace la referencia
        figura.setMaterial(this.material.clonar());
        
        return figura;
    }
    
 
}
