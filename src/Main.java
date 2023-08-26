import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****BIENVENIDOS*****");

        System.out.println("¿Deseas registar un pedido?:");
        String respuesta = scanner.nextLine();

        while (respuesta.equals("si")) {
        System.out.print("*****INGRESE DATOS*****\n");

        System.out.print("Ingrese nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese color del producto: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese contenido del producto: ");
        String contenido = scanner.nextLine();

        System.out.print("Ingrese descripcion del producto: ");
        String descripcion = scanner.nextLine();


        if (!producto.equals("") && !color.equals("") && !contenido.equals("") && !descripcion.equals("")){

            System.out.print("Pedido agregado exitosamente\n");

            System.out.print("Ingrese su nombres: ");
            String Nombres = scanner.nextLine();

            System.out.print("Ingrese sus apellidos: ");
            String Apellidos = scanner.nextLine();

            System.out.print("Ingrese su direccion: ");
            String Direccion = scanner.nextLine();

            System.out.print("Ingrese su numero de celular: ");
            String Celular = scanner.nextLine();

            System.out.print("Ingrese su documento de identidad: ");
            String Documento = scanner.nextLine();

            if (!Nombres.equals("") && !Apellidos.equals("") && !Direccion.equals("") && !Celular.equals("") && !Documento.equals("")){

                System.out.println("Datos de usuario agregado correctamente\n");

                System.out.println("¿Deseas registar otro pedido?:");
                respuesta = scanner.nextLine();

            }else{
                System.out.print("no se admiten datos vacios para el usuario\n");
            }

        }else {
            System.out.println("no se admiten datos vacios para el pedido\n");
        }
        }


    }
}