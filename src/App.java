import java.util.Scanner;

public class BusquedaLineal {
    public static void main(String[] args) {
        // Definir productos y sus tamaños
        String[] productos = {"Camisa", "Pantalón", "Zapatos", "Sombrero"};
        int[] tamanos = {40, 42, 8, 7};
        
        // Mostrar lista de productos al usuario
        System.out.println("Lista de productos disponibles:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1) + ". " + productos[i]);
        }
        
        // Solicitar al usuario que elija un producto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elija el número del producto: ");
        int indiceProducto = scanner.nextInt() - 1;
        
        // Verificar si el índice del producto es válido
        if (indiceProducto < 0 || indiceProducto >= productos.length) {
            System.out.println("Número de producto no válido.");
            return;
        }
        
        // Obtener el tamaño correspondiente al producto elegido
        int tamanoProducto = tamanos[indiceProducto];
        
        // Solicitar al usuario que ingrese el tamaño deseado
        System.out.print("Ingrese el tamaño del producto " + productos[indiceProducto] + ": ");
        int tamanoBuscado = scanner.nextInt();
        
        // Realizar la búsqueda lineal
        if (tamanoBuscado == tamanoProducto) {
            System.out.println("¡El tamaño coincide con el producto " + productos[indiceProducto] + "!");
        } else {
            System.out.println("El tamaño no coincide con el producto " + productos[indiceProducto] + ".");
        }
    }
}