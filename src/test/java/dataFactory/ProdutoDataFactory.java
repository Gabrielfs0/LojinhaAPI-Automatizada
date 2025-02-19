package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor){

        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Xbox x");
        produto.setProdutoValor(valor);
        List<String> cores  = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setNomeComponente("Controle");
        componente.setQuantidadeComponente(1);
        componentes.add(componente);

        ComponentePojo segundoComponente = new ComponentePojo();
        segundoComponente.setNomeComponente("Memory Card");
        segundoComponente.setQuantidadeComponente(2);
        componentes.add(segundoComponente);

        produto.setComponentes(componentes);

        return produto;
    }
}
