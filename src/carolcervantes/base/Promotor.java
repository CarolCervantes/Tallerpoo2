/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carolcervantes.base;

import java.util.List;

/**
 *
 * @author HP
 */
public class Promotor extends Empleado {
    private List<Proyecto>listaDeProyectos;
    
    public Promotor (){
        super();
    }
    public Promotor (String n, String a){
        super(n,a);
        
    }
}
