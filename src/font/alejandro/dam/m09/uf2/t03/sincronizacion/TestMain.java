package font.alejandro.dam.m09.uf2.t03.sincronizacion;

public class TestMain {
    public static void main(String[] args) {
        CuentaAtras cuentaAtras1 = new CuentaAtras("ID1", 10);
        CuentaAtras cuentaAtras2 = new CuentaAtras("ID2", 15);
        CuentaAtras cuentaAtras3 = new CuentaAtras("ID3", 20);
        CuentaAtras cuentaAtras4 = new CuentaAtras("ID4", 25);

        cuentaAtras1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cuentaAtras2.start();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cuentaAtras3.start();
        try {
            cuentaAtras3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cuentaAtras4.start();
    }
}
