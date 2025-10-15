public class principal {
public static void main(string[] args) {
producto 1 = new producto("A101", "cuaderno", 2, 3500);
producto 2 = new producto("", "", 0, -10);
 System.out.println("=== Producto válido ===");
 System.out.println(p1.toString());

 System.out.println("\n=== Producto inválido ===");
 System.out.println(p2.toString());

p1.incrementarCantidad(3);   
 p1.aplicarDescuento(10);   

 System.out.println("\n=== Después de operaciones ===");
 System.out.println(p1.toString()); }
}

