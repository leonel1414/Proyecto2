public class Main {
    public static void main(String[] args) {

        Funcionario fun = new Funcionario();
        fun.setNombre("Leonel");
        fun.setDocumento("3334342342");
        fun.setSalario(2000);

        System.out.println("Mi nombre es: "+ fun.getNombre());
        System.out.println("Salario: "+ fun.getSalario());
        System.out.println(fun.getBonificacion());


        Gerente ger = new Gerente();
        ger.setNombre("Leo");
        ger.setDocumento("123456789");
        ger.setClave("Leo123");
        ger.setSalario(10000);

        System.out.println("Gerente: "+ ger.getNombre());
        System.out.println("Clave: "+ ger.iniciarSesion("Leo123"));
        System.out.println("Bonificacion: "+ ger.getBonificacion());


        //PRACTICANDO POLIMORFISMO

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000);

        Gerente gerente = new Gerente();
        gerente.setSalario(10000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(funcionario);
    }
}