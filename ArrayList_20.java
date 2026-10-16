import java.util.ArrayList;

public class RainbowSixOperadores {
    public static void main(String[] args) {
        ArrayList<String> operadores = new ArrayList<>();
        System.out.println("=== 1. MÉTODO .add() ===");
        operadores.add("Ash");     
        operadores.add("Thermite"); 
        operadores.add("Sledge");  
        operadores.add(1, "Thatcher"); 
        System.out.println("Equipo actual: " + operadores);
        System.out.println("\n=== 2. MÉTODO .get() ===");
        String operadorPrincipal = operadores.get(0);
        String segundoOperador = operadores.get(1);
        System.out.println("Operador en la posición 0: " + operadorPrincipal);
        System.out.println("Operador en la posición 1: " + segundoOperador);
        System.out.println("\n=== 3. MÉTODO .set() ===");
        operadores.set(1, "Hibana");
        System.out.println("Equipo tras cambiar la posición 1: " + operadores);
        System.out.println("\n=== 4. MÉTODO .remove() ===");
        operadores.remove(0); 
        System.out.println("Después de eliminar la posición 0: " + operadores);
        operadores.remove("Sledge");
        System.out.println("Después de eliminar a 'Sledge': " + operadores);
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total de operadores restantes (.size()): " + operadores.size());
        System.out.println("Alineación final: " + operadores);
    }
}