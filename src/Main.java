public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Persona persona1 = new Persona();
        persona1.setEdad(21);
        persona1.setNombre("Nicolas");
        persona1.setTelefono(1133456743);

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }
}
/*Para practicar la encapsulación:

        Crear clase Persona.

        Crear variables las privadas edad, nombre y telefono de la clase Persona.

        Crear gets y sets de cada propiedad.

        Crear un objeto persona en el main.

        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        por último muéstralas por consola.*/

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }
}

