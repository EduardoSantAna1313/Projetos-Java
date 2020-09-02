package br.com.edu.download.nfse.curitiba;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import br.com.edu.download.nfse.curitiba.business.DownloadBusiness;

/**
 * Realiza o download de NFSe de curitiba.
 *
 * @author FH - edusilva
 *
 */
public class AppDownloadDanfse {

    // Necessário habilitar o TLS
    // -Dhttps.protocols=TLSv1
    public static void main(final String[] args) throws Exception {

        final String url = "https://isscuritiba.curitiba.pr.gov.br/NotaCuritibana/NotaRPS/AutenticidadeNota?doc=19949769000189&num=979&cod=FBAM980N";

        final Map<String, String> params = params(url);

        final DownloadBusiness business = new DownloadBusiness();
        final byte[] base64 = business.downloads(params.get("cod"), params.get("doc"),
                Integer.valueOf(params.get("num")));

        final BufferedImage image = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(base64)));

        final File file = new File("src/main/resources/" + business.getFileName() + ".png");
        ImageIO.write(image, "png", file);

        System.out.println("Arquivo " + business.getFileName() + " salvo!");
    }

    /**
     * Recupera params da url.
     *
     * @param pUrl
     * @return
     */
    private static Map<String, String> params(final String pUrl) {

        final Map<String, String> map = new HashMap<>();
        final int index = pUrl.lastIndexOf('?') + 1;
        final String[] params = pUrl.substring(index).split("&");
        for (final String param : params) {
            final String[] values = param.split("=");
            map.put(values[0], values[1]);
        }

        return map;
    }

}
