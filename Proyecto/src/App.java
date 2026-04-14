import java.util.Scanner;
import model.Administrador;
import model.Cliente;
import model.Producto;
import model.Tienda;


public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner leer = new Scanner(System.in);
         Tienda miTienda = new Tienda();
// usuario--CLIENTE
System.out.println("Registro de cliente");

System.out.println("Ingrese el ID del usuario:");
int idUsuario = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese el nombre:");
String nombreUsuario = leer.nextLine();

System.out.println("Ingrese el apellido:");
String apellidoUsuario = leer.nextLine();

System.out.println("Ingrese el email:");
String emailUsuario = leer.nextLine();

System.out.println("Ingrese el telefono:");
int telefonoUsuario = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese la direccion:");
String direccionUsuario = leer.nextLine();

System.out.println("Ingrese la contraseña:");
String contrasenaUsuario = leer.nextLine();

//polimorfismo
System.out.println("ingrese tipo de cliente");
String tipoCliente = leer.next();

Cliente cliente = new Cliente(
        idUsuario,
        nombreUsuario,
        apellidoUsuario,
        emailUsuario,
        telefonoUsuario,
        direccionUsuario,
        contrasenaUsuario
);
miTienda.registrarUsuario(cliente);

// usuario--aDMINISTRADOR       
System.out.println("Registro de administrador");

System.out.println("Ingrese el ID del usuario:");
int idAdmin = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese el nombre:");
String nombreAdmin = leer.nextLine();

System.out.println("Ingrese el apellido:");
String apellidoAdmin = leer.nextLine();

System.out.println("Ingrese el email:");
String emailAdmin = leer.nextLine();

System.out.println("Ingrese el telefono:");
int telefonoAdmin = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese la direccion:");
String direccionAdmin = leer.nextLine();

System.out.println("Ingrese la contraseña:");
String contrasenaAdmino = leer.nextLine();

Administrador admin = new Administrador(
        idUsuario,
        nombreUsuario,
        apellidoUsuario,
        emailUsuario,
        telefonoUsuario,
        direccionUsuario,
        contrasenaUsuario
);
miTienda.registrarUsuario(admin);



// productos

System.out.println("\nIngrese el ID del producto:");
int idProductoTienda = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese el nombre del producto:");
String nombreProductoTienda = leer.nextLine();

System.out.println("Ingrese la descripcion:");
String descripcionProductoTienda = leer.nextLine();

System.out.println("Ingrese el precio:");
double precioProductoTienda = leer.nextDouble();

System.out.println("Ingrese la categoria:");
leer.nextLine();
String categoriaProductoTienda = leer.nextLine();

System.out.println("Ingrese el stock:");
int stockProductoTienda = leer.nextInt();

Producto productoTienda = new Producto(
        idProductoTienda,nombreProductoTienda,descripcionProductoTienda,precioProductoTienda,
        categoriaProductoTienda, stockProductoTienda
);

miTienda.agregarProducto(productoTienda);

// Mostrar lo que se guardó
System.out.println("usuarios:");
miTienda.listarUsuarios(); //polimorfismo
System.out.println("productos");
miTienda.mostrarProductos();
    }}