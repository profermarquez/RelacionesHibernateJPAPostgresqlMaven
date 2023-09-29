/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian
 */
@Entity
@Table(name="departamento")
public class Departamento 
{
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )
   private int id;
   private String name;

   
   @OneToOne
   Empleado empleado;


}

