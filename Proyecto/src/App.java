import java.util.Scanner;
import model.Administrador;
import model.Cliente;
import model.Producto;
import model.Tienda;
import model.Usuario;


public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner leer = new Scanner(System.in);
         Tienda miTienda = new Tienda();

int opcionPrincipal = -1; 

while(opcionPrincipal != 0){
System.out.println("Bienvenido a Reposteria Yuma");
System.out.println("Por ingrese que desea hacer"); 
System.out.println("1. usuarios");
System.out.println("2. productos");   
System.out.println("0. volver");

opcionPrincipal =leer.nextInt();        

switch (opcionPrincipal) {
case 1:
                int opcionUsuario = -1;
                while(opcionUsuario !=0){
                System.out.println("Bienvenido escoge que deseas hacer ");
                System.out.println("1. registrar usuario ");
                System.out.println("2.mostrar usuario");
                System.out.println("3. actualizar usuario");
                System.out.println("4. eliminar usuario");
                System.out.println("0. volver ");
                opcionUsuario = leer.nextInt();

                switch (opcionUsuario) {
                        case 1:
                        System.out.println("escoge una opcion");
                        System.out.println("1.cliente");
                        System.out.println("2.administrador");
                        int tipoUsuario = leer.nextInt();
                        leer.nextLine();
                        switch (tipoUsuario) {
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

                        System.out.println("Ingrese el tipo de cliente (vip / regular):");
                        String tipoCliente = leer.nextLine();

                        //herencia
                        Cliente cliente = new Cliente(
                                idCliente,
                                nombreCliente,
                                apellidoCliente,
                                emailCliente,
                                telefonoCliente,
                                direccionCliente,
                                contrasenaCliente,
                                tipoCliente   );

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
                        break;

                        default:
                        System.out.println("Tipo de usuario no válido");
                        break;}
                                break;
                                // case del menu segundario
                        case 2: 
                        miTienda.listarUsuarios();
                                break;

                        case 3:
                        System.out.println("ingrese el id usuario ");
                        int idBuscar = leer.nextInt();
                        leer.nextLine();

                        Usuario usuarioEncontrado = miTienda.buscarUsuarioPorId(idBuscar);

                        if(usuarioEncontrado != null){
                        System.out.println("usuario  encontrado ");

                        // usuarios encontrados
                        System.out.println(usuarioEncontrado.getNombre() + " - " + usuarioEncontrado.getEmail());
                
                        // para actualizar
                        System.out.println("desea actualizar usuario 1. si 2. no");
                        int opcionActualizar =  leer.nextInt();
                        leer.nextLine();

                        if(opcionActualizar == 1){
                        System.out.println("Por favor ingrese el nombre nuevo");
                        String nuevoNombre = leer.nextLine();
                        System.out.println("ingrese el nuevo mail");
                        String nuevoEmail = leer.nextLine();


                        usuarioEncontrado.setNombre(nuevoNombre);
                        usuarioEncontrado.setEmail(nuevoEmail);
                        System.out.println("se actualizo el usuario");
                        }
                        }else{
                                        System.out.println(" no se encontro usuario");
                                }
                        break;

                        case 4: 
                                System.out.println("Ingrese el ID del usuario a eliminar:");
                        int idEliminar = leer.nextInt();
                        leer.nextLine();

                        miTienda.eliminarUsuario(idEliminar);
                        break;
                        default:
                                System.out.println("opcion invalida");}
                }break;
case 2:
        int opcionProducto = -1;

        while (opcionProducto !=0) {
        System.out.println("Bienvenido a productos, escoge una opcion");
        System.out.println("1.agregar productos");
        System.out.println("2.mostrar productos");
        System.out.println("3.actualizar productos");
        System.out.println("4.eliminar productos");
        System.out.println("0.volver");
        opcionProducto = leer.nextInt();
        leer.nextLine(); 

        switch (opcionProducto) {
                case 1:

                System.out.println("\nIngrese el ID del producto:");
                int idProductoTienda = leer.nextInt();
                leer.nextLine();

                System.out.println("Ingrese el nombre del producto:");
                String nombreProductoTienda = leer.nextLine();

                System.out.println("Ingrese la descripcion:");
                String descripcionProductoTienda = leer.nextLine();

                System.out.println("Ingrese el precio:");
                double precioProductoTienda = leer.nextDouble();
                leer.nextLine();

                System.out.println("Ingrese la categoria:");
                String categoriaProductoTienda = leer.nextLine();

                System.out.println("Ingrese el stock:");
                int stockProductoTienda = leer.nextInt();
                leer.nextLine();

                Producto productoTienda = new Producto(
                        idProductoTienda,nombreProductoTienda,descripcionProductoTienda,precioProductoTienda,
                        categoriaProductoTienda, stockProductoTienda
                );

                miTienda.agregarProducto(productoTienda);
                break;
                
                case 2: // mostrar productoc
                        miTienda.mostrarProductos();
                        break;
                case 3: // actualizar producto   
                System.out.println("Ingrese el ID del producto:");
                 int idActualizar = leer.nextInt();
                leer.nextLine();

                System.out.println("Ingrese el nuevo nombre:");
                String nuevoNombre = leer.nextLine();

                miTienda.actualizarProducto(idActualizar, nuevoNombre);

                break;

                case 4: // eliminar producto
                 System.out.println("Ingrese el ID del producto:");
                int idEliminar = leer.nextInt();
                leer.nextLine();

                miTienda.eliminarProducto(idEliminar);

                System.out.println("producto eliinado");
              

                break;
                }}
                break;
        }}}}






                        



