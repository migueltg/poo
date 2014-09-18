package basics;

import java.net.MalformedURLException;

import upm.jbb.IO;

public class MensajeriaMain {

    public static void main(String[] args) {
        Mensajeria men = new Mensajeria();
        try {
            men.enviar(IO.in.readString("Dame URL"));
        } catch (MalformedURLException e) {
            IO.out.println("No se ha podido conectar con el servidor, intentalo dentro de 5 minutos");
        }

        /*
         * String url; boolean enviado = false; do { url =
         * IO.in.readString("Dame URL"); try { men.enviar(url); enviado = true;
         * } catch (MalformedURLException e) { IO.out.println("URL incorrecta");
         * } } while (!enviado);
         */
        IO.out.println("Sigue la ejecución...");
    }
}
