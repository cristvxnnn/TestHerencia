/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Controlador.nominaController;
import Modelo.Gerente;
import Modelo.Empleado;

/**
 *
 * @author crstc
 */
public class Herencia10 {
    public static void main(String[] args){
        System.out.println("Aprendiendo Herencia");
        nominaController control = new nominaController();
        //polimorfismo
        control.registrarEmpleados(new Empleado("Cristian", 1000));
        control.registrarEmpleados(new Gerente("Cristian 2",5000,5000));
        //listado de pagos
        System.out.println("====Listado de Pagos====");
        for (Empleado emp:control.obtenerLista()){
            //aqui actual el polimorfismo; cada objeto sabe como calcular su pago
            System.out.println("Nombre:  "+emp.getNombre());
            System.out.println("Pago:  "+emp.calcularPago());
            System.out.println("====================");
            //sobrecarga
            System.out.println("Prueba de Sobrecarga");
            Empleado busqueda1=control.buscar("Cristian");
            Empleado busqueda2=control.buscar(1);
            System.out.println("=Prueba de sobrecarga busqueda por nombre: "+(busqueda1 != null? busqueda1.getNombre():"No existe"));
            System.out.println("=Prueba de sobrecarga busqueda por indice: "+(busqueda2 != null? busqueda1.getNombre():"No existe"));
        }
        
        
        
        
        
    }
    
}
