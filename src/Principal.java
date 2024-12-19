import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el límite de la tarjeta de crédito");
        double limite = teclado.nextDouble();
        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int salir = 1;
        while (salir != 0){
            System.out.println("Que desea comprar: ");
            String descripcion = teclado.next();

            System.out.println("Cuánto cuesta: ");
            double valor = teclado.nextDouble();

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Escribe 1 para continuar comprando o 0 para salir");
                salir = teclado.nextInt();
            } else {

                salir =0;
            }

        }
        System.out.println("*******************************");
        System.out.println("Resumen de compras");
        Collections.sort(tarjeta.getListaCompras());
        for (Compra compra : tarjeta.getListaCompras()){
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("*******************************");
        System.out.println("\n Saldo restante: " + tarjeta.getSaldo());
    }
}
