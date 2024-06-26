package Percobaan2;

public class GraphMain26 {

    public static void main(String[] args) {
        GraphMatriks26 gdg = new GraphMatriks26(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        
        gdg.printGraph();
        
        for (int i = 0; i < gdg.vertex; i++) {
            System.out.println("Gedung " + (char)('A' + i) + ": inDegree = " + gdg.inDegree(i) + ", outDegree = " + gdg.outDegree(i));
        }

        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        
        for (int i = 0; i < gdg.vertex; i++) {
            System.out.println("Gedung " + (char)('A' + i) + ": inDegree = " + gdg.inDegree(i) + ", outDegree = " + gdg.outDegree(i));
        }
    }
}

