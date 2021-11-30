package com.mycompany.herencia;

public class Profesor extends Persona{


    private String IdProfesor;
    
    public Profesor (String nombre, String apellidos, String IdProfesor, int edad)
  
    {
        super(nombre, apellidos, edad);
        this.IdProfesor=IdProfesor;
//        IdProfesor = "";
    }
    
    
    public void setIdProfesor(String setIdProfesor)
    {
        
    }
    public String getIdProfesor()
            
    {
        return IdProfesor;
    }
    public void MostrarDatos()
            
    {
        System.out.println("Nombre del Profesor: " + getNombre()+" " + getApellidos()+"\nCodigo: " + getIdProfesor()+"\nEdad: "+ getEdad());
    }    
}
