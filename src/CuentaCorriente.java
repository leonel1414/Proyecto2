public class CuentaCorriente  extends Cuenta{

    //Constructor
    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public double depositar(double plata) {
        return 0;
    }

    // Saca una comision por cada retiro
    //Que hago desde mi cuenta corriente.
    @Override
    public boolean saca(double plata) {
        double comision = 0.2;
        return super.saca(plata + comision);
    }
}
