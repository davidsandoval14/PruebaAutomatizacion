package Helpers;

public class Helpers {

    public void esperarCarga(int tiempo) {
        try {
            Thread.sleep(tiempo * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
