package prototype;

public class Material implements Prototype<Material> {
    private String tipo;
    
    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;        
    }
    
    @Override
    public Material clonar() {
        Material clon = new Material();
        clon.setTipo(this.tipo);
        return clon;
    }
    
}
