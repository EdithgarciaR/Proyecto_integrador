package model;
import java.util.ArrayList;

public class Tienda {
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Producto> listaProductos;

    public Tienda() {
        listaUsuarios = new ArrayList<>();
        listaProductos = new ArrayList<>();
    }

    // crud
    public void registrarUsuario(Usuario usuario) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(usuario.getEmail())) {
                System.out.println("Error: el correo " + usuario.getEmail() + " ya está registrado.");
                return;
            }
        }
        listaUsuarios.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " registrado.");
    }

    public void listarUsuarios() {
        System.out.println("\nLista de usuarios:");
        if (listaUsuarios.size() == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            System.out.println(u.getIdUsuario() + " - " + u.getNombre() + " " + u.getApellido() +
                               " | Email: " + u.getEmail());

            // polimorfismo
            u.mostrarRol();
        }
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            if (u.getIdUsuario() == id) {
                return u;
            }
        }
        System.out.println("No se encontró usuario con ID " + id);
        return null;
    }

    // crud productos
    public void agregarProducto(Producto producto) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getIdProducto() == producto.getIdProducto()) {
                System.out.println("Error: ya existe un producto con ID " + producto.getIdProducto());
                return;
            }
        }
        listaProductos.add(producto);
        System.out.println("Producto '" + producto.getNombre() + "' agregado.");
    }

    public void mostrarProductos() {
        System.out.println("\nInventario de productos:");
        if (listaProductos.size() == 0) {
            System.out.println("No hay productos registrados.");
            return;
        }
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            System.out.println(p.getIdProducto() + " - " + p.getNombre() +
                               " | Precio: $" + p.getPrecio() +
                               " | Stock: " + p.getStock());
        }
    }

    public void eliminarProducto(int id) {
        Producto productoEliminar = null;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getIdProducto() == id) {
                productoEliminar = p;
                break;
            }
        }

        if (productoEliminar != null) {
            listaProductos.remove(productoEliminar);
            System.out.println("Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("No se encontró producto con ID " + id);
        }
    }
}