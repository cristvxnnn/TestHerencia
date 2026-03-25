/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Controlador;

import Modelo.Empleado;
import Modelo.Gerente;
import java.util.ArrayList;

/**
 *
 * @author crstc
 */
public class nominaController {

    private ArrayList<Empleado> listaEmpleados;
//crear atributos
    public nominaController(){
        this.listaEmpleados= new ArrayList<>();
    }
    //registro de empleados:
    public void registrarEmpleados(Empleado e){
        listaEmpleados.add(e);//se registra la lista de empleados, se llena de esta forma
        
    }
    //sobrecarga:
    public Empleado buscar(String nombre){
        for (Empleado e:listaEmpleados){//for para recorrer listas, desde el objeto e hasta el tamaño de la listaEmpleados
            if (e.getNombre().equalsIgnoreCase(nombre)){ //equalsIgnoreCase, significa que va a buscar esa palabra sin importar si esta en minusculas-mayusculas la letra/palabra
                return e;//retorna el nombre
            }
        }
        return null;//retona nulo
    }
    //sobrecarga: buscar por la posicion de la lists:
    public Empleado buscar(int indice){
        if (indice>=0 && indice<listaEmpleados.size()){
            return listaEmpleados.get(indice);
            
        }
        return null;
    }
    public ArrayList<Empleado>obtenerLista(){
        return listaEmpleados;
    }
}
