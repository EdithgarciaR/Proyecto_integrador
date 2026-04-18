package model;

public interface  Inter_Productos {
    void guardar(Producto producto);
    Producto buscar(int id );
    void eliminar (int id);
    

    default void mostrar(){
        System.out.println("mostrando informacion del producto");
    }
}
