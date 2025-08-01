package com.example;

public class Estudiante {
     private String nombre;
     private String apellido;
     private int edad;
     private String id;
     private String curso;
     private int semestre;

     public Estudiante( String nombre, String apellido, int edad, String id, String curso, int semestre) {
         this.nombre = nombre;
         this.apellido = apellido;
         this.edad = edad;
         this.id = id;
         this.curso = curso;
         this.semestre = semestre;
     }

        // Getters and Setters
        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad(){
            return edad;
        }

        public String getId(){
            return id;
        }
        public String getCurso(){
            return curso;
        }


        public int getSemestre(){
            return semestre;
        }

        // Setters

        public void setNombre(String nombre){
            this.nombre=nombre;
        }

        public void setApellido(String apellido){
            this.apellido=apellido;
        }

        public void setEdad(int edad){
            this.edad=edad;
        }

        public void setId(String id){
            this.id=id;
        }

        public void setCurso(String curso){
            this.curso=curso;
        }

        public void setSemestre(int semestre){
            this.semestre=semestre;
        }

    @Override
    public String toString() {
        return String.format("Estudiante [nombre='%s', apellido='%s', edad=%d, id='%s', curso='%s', semestre=%d]", 
                nombre, apellido, edad, id, curso, semestre);
    }

}
