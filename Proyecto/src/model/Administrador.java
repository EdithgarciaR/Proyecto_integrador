package model;

public class Administrador extends Usuario {

    private String rol;

    public Administrador(String rol){
       super();
        this.rol = rol ;
    }

    public Administrador (int IdUsuario, String Nombre, String Apellido, String Email,
    int Telefono, String Direccion, String Contrasena){
    super(IdUsuario, Nombre,Apellido,Email, Telefono,Direccion,Contrasena);
    }

       public void gestionar(){
        System.out.println("El administrador gestiona la tienda");}

    public String getRol() {
        return rol;}

    // polimorfismo
     @Override
    public void mostrarRol() {
    System.out.println("Soy administrador");}


}


