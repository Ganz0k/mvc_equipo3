/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.ControladorEmpleado;
import modelo.Empleado;
import vista.VistaEmpleado;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549
 * Gabriel Francisco Piñuelas Ramos 00000230626
 * Ricardo Pacheco Urias 00000229178
 * Abraham Sered Gómez Martínez 00000228796
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado modelo = recuperarEmpleadoDeBaseDatos();
        
        VistaEmpleado vista = new VistaEmpleado();
        
        ControladorEmpleado controlador = new ControladorEmpleado(modelo, vista);
        
        controlador.actualizarVista();
        
        controlador.setNombreEmpleado("Arturo");
        System.out.println("\nDetalles de Empleado después de actualizar:");
        
        controlador.actualizarVista();
    }
    
    private static Empleado recuperarEmpleadoDeBaseDatos(){
        Empleado empleado = new Empleado();
        empleado.setNombre("Andrés");
        empleado.setId("11");
        empleado.setDepartamento("Recursos Humanos");
        return empleado;
    }
}
