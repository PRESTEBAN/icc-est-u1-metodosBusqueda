import controllers.MetodosBusqueda;
import java.util.Scanner;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {3, 7, 2, 9, 4, 10};

        Scanner scanner = new Scanner(System.in);

        Person[] personas = new Person[7];        

        personas[0] = new Person(101, "Juan");
        personas[1] = new Person(102, "Maria");
        personas[2] = new Person(103, "Carlos");
        personas[3] = new Person(104, "Ana");
        personas[4] = new Person(105, "Luis");
        personas[5] = new Person(106, "Sofia");
        personas[6] = new Person(107, "Pedro");
        MetodosBusqueda mB = new MetodosBusqueda(personas);

        System.out.println("Ingresa el valor a encontrar en el arreglo: ");
        int valor = scanner.nextInt();
        mB.busquedaLineal(arreglo, valor);

    }
}
