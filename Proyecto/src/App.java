import java.util.Scanner;
import model.Administrador;
import model.Cliente;
import model.Producto;
import model.Tienda;


public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner leer = new Scanner(System.in);
         Tienda miTienda = new Tienda();

int opcionPrincipal = 1; 
while(opcionPrincipal != 0){
System.out.println("Bienvenido a Reposteria Yuma");
System.out.println("Por ingrese que desea hacer"); 
System.out.println("1. usuarios");
System.out.println("2. productos");   
opcionPrincipal =leer.nextInt();        

switch (opcionPrincipal) {
    case 1:

int opcionUsuario = 1;
while(opcionUsuario !=0){
System.out.println("Bienvenido escoge tu rol ");
System.out.println("1. registrar cliente");
System.out.println("2.registrar administrador");
System.out.println("0.salirr");
opcionUsuario = leer.nextInt();

switch (opcionUsuario) {
        case 1:
        // usuario--CLIENTE
        System.out.println("Registro de cliente");

        System.out.println("Ingrese el ID del cliente:");
        int idCliente = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el nombre:");
        String nombreCliente = leer.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellidoCliente = leer.nextLine();

        System.out.println("Ingrese el email:");
        String emailCliente = leer.nextLine();

        System.out.println("Ingrese el telefono:");
        int telefonoCliente = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la direccion:");
        String direccionCliente = leer.nextLine();

        System.out.println("Ingrese la contraseña:");
        String contrasenaCliente = leer.nextLine();

        System.out.println("ingrese tipo de cliente");
        String tipoCliente = leer.next();

        //herencia
        Cliente cliente = new Cliente(
                idCliente,
                nombreCliente,
                apellidoCliente,
                emailCliente,
                telefonoCliente,
                direccionCliente,
                contrasenaCliente
        );
        //polimorfismo
        miTienda.registrarUsuario(cliente);
break;

        case 2:
        // usuario--aDMINISTRADOR       
        System.out.println("Registro de administrador");

        System.out.println("Ingrese el ID del administrador:");
        int idAdministrador = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el nombre:");
        String nombreAdministrador = leer.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellidoAdministrador = leer.nextLine();

        System.out.println("Ingrese el email:");
        String emailAdministrador = leer.nextLine();

        System.out.println("Ingrese el telefono:");
        int telefonoAdministrador = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la direccion:");
        String direccionAdministrador = leer.nextLine();

        System.out.println("Ingrese la contraseña:");
        String contrasenaAdministrador = leer.nextLine();

        // herencia 
        Administrador admin = new Administrador(
                idAdministrador,
                nombreAdministrador,
                apellidoAdministrador,
                emailAdministrador,
                telefonoAdministrador,
                direccionAdministrador,
                contrasenaAdministrador
        );
        //polimorfismo
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


        default:
        System.out.println("opcion invalida");
                break;
}



}
        break;
    default:
       
}













        break;
}

}
// interfazde producto
miTienda.guardar(productoTienda);
miTienda.buscar(idProductoTienda);
miTienda.eliminar(idProductoTienda);




// Mostrar lo que se guardó
System.out.println("usuarios:");
miTienda.listarUsuarios(); 

System.out.println("productos");
miTienda.mostrarProductos();
    }


