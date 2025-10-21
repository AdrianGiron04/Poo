class guitarra extends instrumento {
int cuerdas;

public guitarra(String nombre, int cuerdas) {
super(nombre);
this.cuerdas = cuerdas;
}
}
public void afinar() {
 System.out.println("Afinando la poderosa guitarra...");
}
@override
public void mostrarinfo();
System.out.println("Instrumento: " + nombre + " con " + cuerdas + " cuerdas.");