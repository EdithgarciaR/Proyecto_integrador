package model;

public class Producto {
private  int IdProducto;
private  String Nombre;
private String  Descripcion;
private float Precio;
private String Categoria; 
private  int Stock; 


public Producto (){}

public Producto (int IdProducto, String Nombre, String Descripcion, 
float Precio, String Categoria, int Stock){
this.IdProducto = IdProducto;
this.Nombre = Nombre;
this.Descripcion = Descripcion;
this.Precio = Precio;
this.Categoria = Categoria;
this.Stock = Stock;
}

    // idProducto
    public int getIdProducto(){ return IdProducto; }
    public void setIdProducto(int IdProducto){
        if(IdProducto > 0){
        this.IdProducto = IdProducto;} 
        else {System.out.println("Error: el idProducto debe ser mayor a 0");}}

    // nombre
    public String getNombre(){ return Nombre;}
    public void setNombre(String Nombre){
        if(Nombre != null && Nombre.matches("[a-zA-Z]+")){
        this.Nombre = Nombre;}
         else {System.out.println("Error: el nombre no puede estar vacio y solo debe contener letras.");}}

    // descripcion
    public String getDescripcion(){ return Descripcion;}
    public void setDescripcion(String Descripcion){
    if(Descripcion != null && Descripcion.matches("[a-zA-Z]+")){
    this.Descripcion = Descripcion;}
     else {System.out.println("Error: la descripcion no puede estar vacia");}}

    // precio
    public float getPrecio(){ return Precio;}
    public void setPrecio(float Precio){
    if(Precio > 0){
    this.Precio = Precio;} 
    else {System.out.println("Error: el precio debe ser mayor a 0");}}

    // categoria
    public String getCategoria(){ return Categoria; }
    public void setCategoria(String Categoria){
    if(Categoria != null && Categoria.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
    this.Categoria = Categoria;} 
    else {System.out.println("Error: la categoria no puede estar vacia");}}

    // stock
    public int getStock(){ return Stock;}
    public void setStock(int Stock){
    if(Stock >= 0){
    this.Stock = Stock;} 
    else {System.out.println("Error: el stock no puede ser negativo");}}
}