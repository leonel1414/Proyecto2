public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public double depositar(double plata) {
       return this.saldo = this.saldo + plata;
    }

}
