package model;

public class Cliente extends Usuario {

    private  String tipoCliente;

    //constructor solito
    public Cliente (String tipoCliente){
        super();
        this.tipoCliente = tipoCliente;}

    public Cliente(int IdUsuario, String Nombre, String Apellido, String Email,
    int Telefono, String Direccion, String Contrasena, String tipoCliente){
    super(IdUsuario, Nombre,Apellido,Email, Telefono,Direccion,Contrasena);
    this.tipoCliente = tipoCliente; }

        //metodo
    public void comprar(){
        System.out.println("El cliente va a comprar");
    }

    public String getTipoCliente(){
        return tipoCliente;}
        
    // polimorfismo
     @Override
    public void mostrarRol() {
    System.out.println("Soy cliente" +tipoCliente);}
        
}

