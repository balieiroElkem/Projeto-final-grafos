package main.java.aplicacao;

import java.util.Scanner;

import java.util.Map;
import main.java.grafo.core.Grafo;
import main.java.grafo.util.AlgoritmoDijkstra;
import main.java.grafo.util.AlgoritmoDijkstra.Info;

public class App {
  public static void main(String[] args) throws Exception {
    // System.out.println("Hello World.\n");
    Scanner input = new Scanner(System.in);
    int contador = 1;

    Grafo grafo = new Grafo();

    grafo.adicionarVertice("s1", "Celular");
    grafo.adicionarVertice("s2", "Livro");
    grafo.adicionarVertice("s3", "Computador");
    grafo.adicionarVertice("s4", "Telefone");
    grafo.adicionarVertice("s5", "Ventilador");
    grafo.adicionarVertice("s6", "Cama");
    grafo.adicionarVertice("s7", "Caio");
    grafo.adicionarVertice("s8", "Marcos");
    grafo.adicionarVertice("s9", "Daniel");

    grafo.conectarVertices("s1", "s2", 3);
    grafo.conectarVertices("s1", "s3", 7);
    grafo.conectarVertices("s1", "s4", 1);
    grafo.conectarVertices("s1", "s9", 42);
    grafo.conectarVertices("s3", "s8", 5);
    grafo.conectarVertices("s3", "s5", 3);
    grafo.conectarVertices("s4", "s5", 5);
    grafo.conectarVertices("s4", "s6", 5);
    grafo.conectarVertices("s4", "s7", 7);
    grafo.conectarVertices("s7", "s8", 1);
    grafo.conectarVertices("s8", "s9",11);

    while (contador++ <= 2) {
      System.out.printf("Digite o nome produto: ");
      String produto = input.nextLine();
      Map<String, Info> vertice = AlgoritmoDijkstra.getInstance().procurarProduto(grafo.getVertice("s1").getRotulo(), produto, grafo);

      if (vertice.size() > 0) {
        for (String key : vertice.keySet()) {
          System.out.println("Nome do servidor             : " + key);
          System.out.println("Distância do seridor         : " + vertice.get(key).distancia);
          System.out.println("Nome do seridor predecessor  : " + vertice.get(key).predecessor.getRotulo());
        }
      } else {
        System.out.println("Produto não encontrado.");
      }

      System.out.println("\n");
    }

    input.close();
  }
}