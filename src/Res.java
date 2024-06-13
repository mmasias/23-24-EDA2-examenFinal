class Res extends Carne {
    public Res(String coccion) {
        super("Res", coccion);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + ":".repeat(12));
    }
    public static void main(String[] args) {
        Carne carne = new Res("Poco hecha");
        carne.mostrar();
        try {
            System.out.println("VER: "+carne.getHash());    
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
}
