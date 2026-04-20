package model;

public abstract class Usuario {
    private int IdUsuario; 
    private String Nombre;
    private String Apellido;
    private String Email;
    private int Telefono;
    private String Direccion;
    private String Contrasena;


    public  Usuario (){}
public Usuario (int IdUsuario, String Nombre, String Apellido, String Email,
int Telefono, String Direccion, String Contrasena) {
    setIdUsuario(IdUsuario);
    setNombre(Nombre);
    setApellido(Apellido);
    setEmail(Email);        // ← ahora sí valida el @
    setTelefono(Telefono);
    setDireccion(Direccion);
    setContrasena(Contrasena);
}


  // para el polimorfismo y mostrar el abstract
    public abstract void mostrarRol();
    

    //idusuario
    public int getIdUsuario() { return IdUsuario; }
    public void setIdUsuario(int IdUsuario) {
    if (IdUsuario > 0) {
        this.IdUsuario = IdUsuario;}
         else {System.out.println("Error: El ID debe ser mayor a 0.");}}

    //nombre
    public String getNombre(){ return Nombre;}
    public void setNombre( String Nombre){
    if (Nombre != null && Nombre.matches("[a-zA-Z]+")) {
        this.Nombre = Nombre;}
         else {System.out.println("Error: el nombre no puede estar vacio y solo debe contener letras.");}}

    //apellido
    public String getApellido(){ return Apellido;}
    public void setApellido(String Apellido){
        if(Apellido != null && Apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")){
        this.Apellido = Apellido;}
        else {System.out.println("Error: el apellido no puede estar vacio y solo debe contener letras.");}}
        
    //email
    public String getEmail (){ return Email;}
     public void setEmail(String Email){
        if(Email != null && Email.contains("@")) {
        this.Email = Email;}
        else{System.out.println("Error: el email no puede estar vacio");}}

    // telefono
    public int getTelefono(){ return Telefono;}
    public void setTelefono(int Telefono){
        if (Telefono >0) {
        this.Telefono = Telefono;}
         else {System.out.println("Error: telefono invalido, no puede estar vacio");}}

    //direccion
    public String getDireccion(){return Direccion;}
    public void setDireccion(String Direccion){
        if(Direccion != null && !Direccion.isBlank() && Direccion.length() > 10){
        this.Direccion = Direccion;}
        else{System.out.println("Error: la direccion no puede estar vacia");}}

    //contraseña
    public String getContrasena(){ return Contrasena; }
    public void setContrasena(String Contrasena){
    if(Contrasena != null && Contrasena.length() >= 8 && !Contrasena.contains(" ")) {   
        this.Contrasena = Contrasena;} else {
        System.out.println("Error: la contraseña no puede estar vacía");}}

   
}

