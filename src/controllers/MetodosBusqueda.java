package controllers;

import models.Person;
import views.ShowConsole;

public class MetodosBusqueda{

    int arreglo[];

    private Person[] people;

    private ShowConsole sc;

    public MetodosBusqueda(Person[] persons){
        sc = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int arreglo[], int valor){

        int n = arreglo.length;

        for (int i = 0; i < n; i++) {
            if (arreglo[i] == valor) 
            return i;
        
        }
        return -1;
    }

    /* CON FOR EACH:
    
    public int findPersonByCode(int code){
        
        int cont = 0;
        for (Person p : people) {
            if(p.getCode()==code){
                return cont;
            }
            cont++;
        }

        return -1;
    }*/ 

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = sc.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            sc.showMessage("Persona encontrada");
            // el show message no acepta mostrar una clase porque solo muestra string sc.showMessage(people[indexPerson]);
            //Mientras que el sout si puede mostrar
            System.out.println(people[indexPerson].toString());
        }else{
            sc.showMessage("Persona con codigo " + codeToFind + " no encontrada");
        }
    }
    
}