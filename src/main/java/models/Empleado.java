/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Table;

/**
 *
 * @author Sebastian
 */
@Entity
@Table(name="empleado")
public class Empleado 
{
   @Id
   @GeneratedValue( strategy= GenerationType.AUTO ) 
   private int eid;
   private String ename;
   private double salary;
   private String deg;
   
   //@ManyToMany
   //List <Departamento> departamento;
    //@OneToOne
   //Departamento departamento;
   @OneToOne
   Departamento departamento;

    
   
   
}