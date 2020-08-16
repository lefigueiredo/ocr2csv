package All;

import java.util.Comparator;

/**
 *
 * @author Leticia Figueiredo
 */
public class PageMetadata implements Comparable<PageMetadata> {
    /**
     * Essa é uma classe auxiliar para ordenar o conteudo do PDF com o 
     * numero da pag do mesmo
     */

    int numPagina;
    String conteudoPagina;

    public PageMetadata() {
        /*
        Overload do construtor
        */
    }

    public PageMetadata(int numPagina, String conteudoPagina) {
        this.numPagina = numPagina;
        this.conteudoPagina = conteudoPagina;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public String getConteudoPagina() {
        return conteudoPagina;
    }

    public void setConteudoPagina(String conteudoPagina) {
        this.conteudoPagina = conteudoPagina;
    }

    @Override
    /**
     * Metodo usado para fazer a comparacao na chama do collections.sort
     */
    public int compareTo(PageMetadata o) {
        return Integer.compare(getNumPagina(), o.getNumPagina());
    }

}
