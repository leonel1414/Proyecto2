public class Gerente extends Funcionario implements Autenticable {

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

    public double getBonificacion(){
        return super.getSalario() + (this.getSalario() * 0.05);
    }
}
