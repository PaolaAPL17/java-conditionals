import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        String correctUsername = "usuario123";
        String correctPassword = "passwordSeguro";

        // 1. Crear el objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario que ingrese su nombre de usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String enteredUsername = scanner.nextLine();

        // 3. Pedir al usuario que ingrese su contraseña
        System.out.print("Ingrese su contraseña: ");
        String enteredPassword = scanner.nextLine();

        // 4. Comprobar si las credenciales son correctas
        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            // Si el nombre de usuario y la contraseña coinciden
            System.out.println("Acceso concedido");
        } else {
            // Si el nombre de usuario o la contraseña no coinciden
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }

            // 5. Cerrar el scanner para liberar recursos
            scanner.close();

    }
}
