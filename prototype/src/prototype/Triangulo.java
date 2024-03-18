package prototype;

public class Triangulo implements Figura, Prototype<Figura> {
    private String nombre;
    private String color;
    private Material material;

    
    public Triangulo(){} //contructor vacio
    
    //nombre metodo
    @Override
    public void setNombre (String n){
        this.nombre = n;
    }

    @Override
    public String getNombre() {
    return this.nombre;        
    }
    
    //color metodo
        @Override
    public void setColor (String c){
        this.color = c;
    }

    @Override
    public String getColor() {
    return this.color;        
    }

    
    //metodo clonar retorna un objeto tipo Figura
    @Override
    public Figura clonar(){
        Figura figura = new Triangulo();
        figura.setNombre(this.nombre);
        figura.setColor(this.color);
        figura.setMaterial(this.material.clonar());
        
        return figura;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }
}
