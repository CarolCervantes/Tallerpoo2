/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carolcervantes.base;

/**
 *
 * @author HP
 */
public class Empresa {
  private String nit;
  private String nombre;
  private String telefono;
  private String email;
  private String tipo;
  private String web;
  private String direccion;
  //private List<Empleado>listaDeEmpleados;
  //private List<Proyecto>listaDeProyectos;
  public Empresa(){
}
  public Empresa(String nit, String nombre){
       this.nit=nit;
       this.nombre=nombre;
   }
}

