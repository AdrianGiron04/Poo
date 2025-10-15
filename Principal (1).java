public class Principal {
ppublic static void main (string[] args) {
CuentaBancaria cuenta1 = new CuentaBancaria("Wilmer Giron", "123456", 2000);
}
CuentaBancaria cuenta2 = new CuentaBancaria("", "123", -100);
System.out.println("=== Cuenta válida ===");
System.out.println("=== Cuenta válida ===");

System.out.println("\n=== Cuenta inválida ===");
System.out.println(cuenta2.toString());
cuenta1.depositar(500);
cuenta1.retirar(300);
System.out.println("\n=== Después de operaciones ===");
System.out.println(cuenta1.toString());
}
}