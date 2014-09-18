package basics;

import java.net.MalformedURLException;

public class Mensajeria {

    public void enviar(String url) throws MalformedURLException {
        if (url.length() < 10) {
            throw new MalformedURLException("URL incorrecta");
        }
    }
}
