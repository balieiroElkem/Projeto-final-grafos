package main.java.grafo.applicacao;

import main.java.grafo.core.Grafo;
import main.java.grafo.util.AlgoritmoDijkstra;

public class App {
   public static void main(String[] args) throws Exception {
      Grafo grafo = new Grafo();

      grafo.adicionarVertice("A");
      grafo.adicionarVertice("B");
      grafo.adicionarVertice("C");
      grafo.adicionarVertice("D");
      grafo.adicionarVertice("E");
      grafo.adicionarVertice("F");
      grafo.adicionarVertice("G");
      grafo.adicionarVertice("H");

      grafo.conectarVertices("A", "B", 9);
      grafo.conectarVertices("A", "C", 3);
      grafo.conectarVertices("A", "E", 8);
      grafo.conectarVertices("A", "F", 3);
      grafo.conectarVertices("A", "G", 4);
      grafo.conectarVertices("B", "C", 10);
      grafo.conectarVertices("B", "F", 6);
      grafo.conectarVertices("C", "D", 6);
      grafo.conectarVertices("C", "F", 4);
      grafo.conectarVertices("C", "G", 5);
      grafo.conectarVertices("C", "H", 7);
      grafo.conectarVertices("D", "E", 5);
      grafo.conectarVertices("D", "H", 3);
      grafo.conectarVertices("E", "H", 5);

      // Primeiro exemplo:
      String conspirador1 = "A";
      String conspirador2 = "D";

      String caminhoInform = AlgoritmoDijkstra.getInstance().processarCaminho(conspirador1, conspirador2, grafo);

      System.out.println(caminhoInform);

      // Segundo Exemplo
      conspirador1 = "A";
      conspirador2 = "H";

      caminhoInform = AlgoritmoDijkstra.getInstance().processarCaminho(conspirador1, conspirador2, grafo);

      System.out.println(caminhoInform);
   }
}
