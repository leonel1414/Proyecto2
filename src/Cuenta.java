public abstract class Cuenta {
   protected double saldo;
  private int agencia = 1;
  private int numero;
   private Cliente titular = new Cliente();

   private static int total ;

  public Cuenta( int agencia, int numero){
    this.agencia = agencia;
    this.numero = numero;

    Cuenta.total++;
  }
   public abstract double depositar(double plata);
    //{
    //el saldo de este objecto, y saldo lo que recibe como parametro.
    //this.saldo = this.saldo + plata;
    // }

  public boolean retirar(double plata) {
    if(this.saldo >= plata){
      this.saldo = this.saldo - plata;
      return true;
    }else{
      return false;
    }
  }
  public boolean transferir( double plata, Cuenta cuenta){
    if (this.saldo >= plata){
      this.saca(plata);
      cuenta.depositar(plata);
      return true;
    }else {
      return false;
    }
  }

  public boolean saca(double plata){
    if (this.saldo >= plata){
      this.saldo -= plata;
      return true;
    }else{
      return false;
    }
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void setAgencia(int nuevaAgencia){
    if (nuevaAgencia > 0){
      this.agencia = nuevaAgencia;
    }else{
      System.out.println("No estan permitidos valores negativos!!");
    }
  }

  public int getAgencia(){
    return agencia;
  }

  public void setNumero(int nuevoNumero){
    this.numero = nuevoNumero;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }
}
