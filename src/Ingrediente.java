abstract class Ingrediente extends Verificador{
    protected String nombre;

    public String describir() {
        return nombre;
    }

    public abstract void mostrar();  
}
