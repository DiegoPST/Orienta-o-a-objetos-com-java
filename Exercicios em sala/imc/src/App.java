public class App {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(48.0, 1.60);
        
        Paciente paciente2 = new Paciente(84.0, 1.74);
        
        Paciente paciente3 = new Paciente(110.0, 1.85);
        
        System.out.println("Paciente 1:");
        System.out.println("IMC: " + paciente1.calcularIMC());
        System.out.println("Diagnóstico: " + paciente1.diagnostico());
        
        System.out.println("Paciente 2:");
        System.out.println("IMC: " + paciente2.calcularIMC());
        System.out.println("Diagnóstico: " + paciente2.diagnostico());
        
        System.out.println("Paciente 3:");
        System.out.println("IMC: " + paciente3.calcularIMC());
        System.out.println("Diagnóstico: " + paciente3.diagnostico());
    }
}