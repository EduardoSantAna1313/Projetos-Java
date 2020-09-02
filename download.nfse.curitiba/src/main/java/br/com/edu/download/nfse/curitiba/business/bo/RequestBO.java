package br.com.edu.download.nfse.curitiba.business.bo;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * DTO para o request de Download.
 *
 * @author FH - edusilva
 *
 */
public class RequestBO {

    /**
     * String - cod.
     */
    @SerializedName("CodigoVerificacao")
    private String cod;

    /**
     * String - doc.
     */
    @SerializedName("DocumentoPrestador")
    private String doc;

    /**
     * Integer - num.
     */
    @SerializedName("NumeroNotaFiscal")
    private Integer num;

    /**
     * Create a new instance of RequestBO
     */
    public RequestBO() {
        super();
    }

    /**
     * Create a new instance of RequestBO
     *
     * @param pCodigo
     * @param pDocumento
     * @param pNumero
     */
    public RequestBO(final String pCodigo, final String pDocumento, final Integer pNumero) {
        super();
        this.cod = pCodigo;
        this.doc = pDocumento;
        this.num = pNumero;
    }

    /**
     * Retrieve the value of cod.
     *
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * Set a new value to cod.
     *
     * @param cod
     *                the cod to set
     */
    public void setCod(final String cod) {
        this.cod = cod;
    }

    /**
     * Retrieve the value of doc.
     *
     * @return the doc
     */
    public String getDoc() {
        return doc;
    }

    /**
     * Set a new value to doc.
     *
     * @param doc
     *                the doc to set
     */
    public void setDoc(final String doc) {
        this.doc = doc;
    }

    /**
     * Retrieve the value of num.
     *
     * @return the num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * Set a new value to num.
     *
     * @param num
     *                the num to set
     */
    public void setNum(final Integer num) {
        this.num = num;
    }

    /**
     * Cria nome de arquivo.
     *
     * @return
     */
    public String createFileName() {
        return num + "_" + doc;
    }

    /**
     *
     * /* (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}