package All;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ocr2csv {

    public Ocr2csv(String[] Lista) {
        Arrays.sort(Lista);
    }

    public static void main(String[] args) {

        List<PageMetadata> listaPaginasConteudo = new ArrayList<>();
        
        listaPaginasConteudo.add(
                new PageMetadata(1, "O conteudo1")
        );
        listaPaginasConteudo.add(
                new PageMetadata(5, "O conteudo5")
        );
        listaPaginasConteudo.add(
                new PageMetadata(2, "O conteudo2")
        );
        listaPaginasConteudo.add(
                new PageMetadata()
        );
    
        Collections.sort(listaPaginasConteudo);
    
        for (PageMetadata p : listaPaginasConteudo) {
            System.out.println(p.getNumPagina());
        }
    }
    
}
