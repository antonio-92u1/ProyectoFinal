package arquetype;

public class ActualizadorPedidos extends Thread{
	
    private boolean activo = true;

    @Override
    public void run() {
        BaseDatos bd = BaseDatos.getInstancia();

        while (activo) {
            try {
                bd.actualizarPedidosAutomaticamente();
                System.out.println("Revisando estados de pedidos...");

                Thread.sleep(5000);

            } catch (InterruptedException e) {
                activo = false;
            }
        }
    }

    public void detener() {
        activo = false;
        interrupt();
    }
}
