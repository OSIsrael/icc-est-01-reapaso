package Views;

import Models.Persona;

public class ViewConsole {
    public void printPersonArray(Persona[] personas){
        for (Persona persona : personas) {
            System.out.print(persona);
        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }
}
