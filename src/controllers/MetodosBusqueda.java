package controllers;

import views.ShowConsole;

public class MetodosBusqueda{

    ShowConsole sc = new ShowConsole();

    int arreglo[];
    boolean encontrado = false;

    public int busquedaLineal(int arreglo[], int valor){

        int n = arreglo.length;

        for (int i = 0; i < n; i++) {
            if (arreglo[i] == valor) {
                System.out.println("El valor que buscaste esta en la posición " + i + " y es el valor: " + arreglo[i]);
                encontrado = true;
                break;

            }
        }

        if (!encontrado) {
            System.out.println("El valor no se encuentra en el arreglo");
        }

        return 1;
        
    }


}