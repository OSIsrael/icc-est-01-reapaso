
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };
        ViewConsole viewConsole=new ViewConsole();
        viewConsole.printPersonArray(personas);
        PersonaController personaController=new PersonaController();
        viewConsole.printMessage("\n Ordenado por edad");
        personaController.ordenarPorEdad(personas);
        viewConsole.printPersonArray(personas);
        viewConsole.printMessage("\n Encontrar la persona con edad 40");
        Persona edad=personaController.buscarPorEdad(personas, 40);
        System.out.println(edad);
        viewConsole.printMessage("\n Edad 90:");
        Persona edPersona=personaController.buscarPorEdad(personas, 90);
        System.out.println(edPersona);

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
