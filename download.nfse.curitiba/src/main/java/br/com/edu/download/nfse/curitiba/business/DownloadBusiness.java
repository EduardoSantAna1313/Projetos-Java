/*
 * COPYRIGHT FH 2020 - ALL RIGHTS RESERVED.
 *
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of FH.
 */
package br.com.edu.download.nfse.curitiba.business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.text.StringEscapeUtils;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

import br.com.edu.download.nfse.curitiba.business.bo.RequestBO;

/**
 * @author FH - edusilva
 *
 */
public class DownloadBusiness {

    /**
     * String - URL.
     */
    private static final String URL = "https://isscuritiba.curitiba.pr.gov.br/NotaCuritibana/NotaRPS/AutenticidadeNotaImagemNfse";

    /**
     * RequestBO - pRequest.
     */
    private RequestBO pRequest;

    /**
     * Realiza o download.
     *
     * @param pCodigo
     * @param pDocumento
     * @param pNumero
     * @return
     * @throws Exception
     */
    public byte[] downloads(final String pCodigo, final String pDocumento, final Integer pNumero) throws Exception {
        this.pRequest = new RequestBO(pCodigo, pDocumento, pNumero);

        return downloads();
    }

    /**
     * Realiza o download.
     *
     * @return
     * @throws Exception
     */
    private byte[] downloads() throws Exception {

        final Response responsePOST = Jsoup.connect(URL).method(Method.POST)
                // headers
                .header("Content-Type", "application/json")
                // body
                .requestBody(pRequest.toString())
                // call
                .execute();

        final Pattern pattern = Pattern.compile(".*?src=\"data:image\\/png;base64, (?<base64>(.+?))\"");

        final Matcher matcher = pattern.matcher(responsePOST.body());
        if (matcher.find()) {

            final String base64 = matcher.group("base64");

            return StringEscapeUtils.unescapeHtml4(base64).getBytes();
        }

        return new byte[0];
    }

    /**
     * Recupera o nome do arquivo baixado.
     *
     * @return
     */
    public String getFileName() {
        return pRequest.createFileName();
    }

}
