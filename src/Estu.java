public class Estu{
    // Atributos
    public String nombre;
    public int edad;

    public Estu(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("NOMBRE: "+ nombre);
        System.out.println("EDAD: "+ edad);




    }

    public static void main(String[] args){
        Estu estudiante_desarrollo = new Estu("JHON", 22);
        Estu estudiante_redes =new Estu("LUIS", 20);
        estudiante_desarrollo.saludar();
        estudiante_redes.saludar();
    }



}


