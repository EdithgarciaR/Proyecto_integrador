package model;
import java.util.ArrayList;

public class Tienda implements Inter_Productos {
     private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Tienda() {
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
        if (listaUsuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            System.out.println(u.getIdUsuario() + " - " + u.getNombre() + " " + u.getApellido() +
                               " | Email: " + u.getEmail());

            // polimorfismo de usuario
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

public void actualizarUsuario(int id, String nuevoNombre, String nuevoEmail) {
    Usuario u = buscarUsuarioPorId(id);
    if (u != null) {
        u.setNombre(nuevoNombre);
        u.setEmail(nuevoEmail);
        System.out.println("Usuario actualizado correctamente.");
    }
}
public void eliminarUsuario(int id) {
    Usuario usuarioEliminar = null;

    for (Usuario u : listaUsuarios) {
        if (u.getIdUsuario() == id) {
            usuarioEliminar = u;
            break;
        }
    }

    if (usuarioEliminar != null) {
        listaUsuarios.remove(usuarioEliminar);
        System.out.println("Usuario eliminado correctamente.");
    } else {
        System.out.println("No se encontró usuario con ese ID.");}}
          
        
        
        // crud productos
        //agregar producto
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
    //mostrar producto 
    public void mostrarProductos() {
        System.out.println("\nInventario de productos:");
        if (listaProductos.isEmpty()) {
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

    //actualizarr producto
    public void actualizarProducto(int id, String nuevoNombre){
        Producto producto = buscarProductoPorId(id);

        if (producto != null) {
            producto.setNombre(nuevoNombre);
            System.out.println("Producto actualizado correctamente");
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    public Producto buscarProductoPorId(int id) {
    for (Producto p : listaProductos) {
        if (p.getIdProducto() == id) {
            return p;
        }
    }
    return null;
}

    // eliminar producto
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
        }}

        // overide de mi interfca
        @Override
        public void  guardar(Producto producto){
            agregarProducto(producto);
        }
        @Override
        public Producto buscar(int id){
            return buscarProductoPorId(id);
        }
        @Override
        public void eliminar(int id) {
            eliminarProducto(id);}

        }

    
