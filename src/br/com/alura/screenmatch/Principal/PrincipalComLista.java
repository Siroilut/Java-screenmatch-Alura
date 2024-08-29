package br.com.alura.screenmatch.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComLista  {
    public static void main(String[] args) {

        
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(10);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            // System.out.println(item);
            if (item instanceof Filme ) {
                Filme filme = (Filme) item;
                System.out.println("classificação: " + filme.getClassificacao());
            }

        }

        // ArrayList<String> NomeArtistas = new ArrayList<>();
        // NomeArtistas.add("B");
        // NomeArtistas.add("A");
        // NomeArtistas.add("Z");

        // Collections.sort(NomeArtistas);
        // System.out.println(NomeArtistas);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo :: getAnoDeLancamento  ));
        System.out.println(lista);


        
    }
}