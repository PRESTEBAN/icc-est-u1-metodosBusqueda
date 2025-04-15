import controllers.MetodosBusqueda;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {3, 7, 2, 9, 4, 10};

        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda mB = new MetodosBusqueda();

        System.out.println("Ingresa el valor a encontrar en el arreglo: ");
        int valor = scanner.nextInt();
        mB.busquedaLineal(arreglo, valor);

    }
}
