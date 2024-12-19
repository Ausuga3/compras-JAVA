import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaCompras.add(compra);
            System.out.println("Compra realizada");
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }
}
