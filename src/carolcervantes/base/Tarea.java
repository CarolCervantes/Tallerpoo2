/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carolcervantes.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class Tarea {
  private String descripción;
  private String tipo;
  private Date fechaInicioEstimado;
  private Date fechaInicioReal;
  private int duraciónEstimada;
  private int duraciónReal;
  private List<Empleado>listaDeEmpleados;
  private Proyecto proyecto;
  private List<Documento>listDeDocumentos;

    private static class Documento {

        public Documento() {
        }
    }
    public Tarea (){
        
    }
    public Tarea(String d, String t){
      String descripcion = d;
      String tipo=t;
    }
}
