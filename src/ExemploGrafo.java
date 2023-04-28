public class ExemploGrafo {
    public static void main(String[] args) throws Exception {
        Grafo<String> grafo= new Grafo<String>();
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(3.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(1.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(1.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(3.0, "Claudio", "Paulo");

        grafo.BuscaEmLargura();
    }
}
