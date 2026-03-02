import model.Producto;
import model.Usuario;

public class MainApp {
    public static void main(String[] args) {

        // Crear la tienda
        Tienda miTienda = new Tienda();

    
        Usuario u1 = new Usuario(1, "Ana", "Lopez", "ana@gmail.com", 123456, "Medellin", "12345678");
        Usuario u2 = new Usuario(2, "Luis", "Perez", "luis@gmail.com", 654321, "Bogota", "abcdefgh");

        miTienda.registrarUsuario(u1);
        miTienda.registrarUsuario(u2);

        // Listar usuarios
        miTienda.listarUsuarios();

        // Anadir productos
        Producto p1 = new Producto(1, "Torta", "Chocolate", 25000, "Repostería", 10);
        Producto p2 = new Producto(2, "Pan", "Integral", 5000, "Panadería", 20);

        miTienda.agregarProducto(p1);
        miTienda.agregarProducto(p2);

        // Mostrar productos
        miTienda.mostrarProductos();

        //buscar usuario 
        System.out.println("\nBuscando usuario con ID 2:");
        Usuario buscado = miTienda.buscarUsuarioPorId(2);
        if (buscado != null) {
            System.out.println("Usuario encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
        }

        // eliminar productos
        System.out.println("\nEliminando producto con ID 1:");
        miTienda.eliminarProducto(1);

        //despues de eliminar
        System.out.println("\nInventario actualizado:");
        miTienda.mostrarProductos();
    }
}