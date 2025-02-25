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
public class documento {
  private String codigo;
  private String descripcion;
  private String tipo;
  private Tarea tarea;
  private List<Version>listaDeVersiones;
  
  public documento(){
  }
  public documento (String codigo, String desc){
      this.codigo=codigo;
      this.descripcion=desc;
      
  }
  }
