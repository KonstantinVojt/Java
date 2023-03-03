package HomeworkGraph;

import java.util.ArrayList;
import java.util.List;

public class MainGraph {

    public static void main(String[] args) {

        GraphNode A = new GraphNode(null, "А");
        GraphNode B = new GraphNode(null, "Б");
        GraphNode V = new GraphNode(null, "В");
        GraphNode G = new GraphNode(null, "Г");
        GraphNode D = new GraphNode(null, "Д");
        GraphNode E = new GraphNode(null, "Е");
        GraphNode J = new GraphNode(null, "Ж");
        GraphNode Z = new GraphNode(null, "З");
        GraphNode I = new GraphNode(null, "И");
        GraphNode K = new GraphNode(null, "К");

        List<GraphNode> linksFromA = new ArrayList<>();
        linksFromA.add(B);
        linksFromA.add(V);
        linksFromA.add(G);
        linksFromA.add(D);
        A.setLinks(linksFromA);

        List<GraphNode> linksFromB = new ArrayList<>();
        linksFromB.add(E);
        linksFromB.add(V);
        B.setLinks(linksFromB);

        List<GraphNode> linksFromV = new ArrayList<>();
        linksFromV.add(J);
        V.setLinks(linksFromV);

        List<GraphNode> linksFromG = new ArrayList<>();
        linksFromG.add(V);
        linksFromG.add(Z);
        G.setLinks(linksFromG);

        List<GraphNode> linksFromD = new ArrayList<>();
        linksFromD.add(G);
        linksFromD.add(I);
        D.setLinks(linksFromD);

        List<GraphNode> linksFromE = new ArrayList<>();
        linksFromE.add(K);
        E.setLinks(linksFromE);

        List<GraphNode> linksFromJ = new ArrayList<>();
        linksFromJ.add(Z);
        linksFromJ.add(K);
        J.setLinks(linksFromJ);

        List<GraphNode> linksFromZ = new ArrayList<>();
        linksFromZ.add(K);
        Z.setLinks(linksFromZ);

        List<GraphNode> linksFromI = new ArrayList<>();
        linksFromI.add(K);
        I.setLinks(linksFromI);

        List<GraphNode> linksFromK = new ArrayList<>();
        K.setLinks(linksFromK);


    }
}
