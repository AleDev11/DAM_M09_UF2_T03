package font.alejandro.dam.m09.uf2.t03.sincronizacion;

public class CuentaAtras extends Thread {
    private String nombre;
    private int SegundosCuentaAtras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSegundosCuentaAtras() {
        return SegundosCuentaAtras;
    }

    public void setSegundosCuentaAtras(int segundosCuentaAtras) {
        SegundosCuentaAtras = segundosCuentaAtras;
    }

    public CuentaAtras(String nombre, int segundosCuentaAtras) {
        this.nombre = nombre;
        this.SegundosCuentaAtras = segundosCuentaAtras;
    }

    public void run() {
        while (SegundosCuentaAtras > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo " + nombre + " interrumpido");
                return;
            }
            System.out.println("Hilo: " + nombre + " - Segundos: " + SegundosCuentaAtras);
            SegundosCuentaAtras--;
        }
    }
}
