package Percobaan2;

public class GraphMatriks26 {

    int vertex;
    int matriks[][];

    GraphMatriks26(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }
    
    public void makeEdge(int asal, int tujuan, int jarak ) {
        matriks[asal][tujuan] = jarak;
    }
public void removeEdge(int asal, int tujuan) {
    matriks[asal][tujuan] = -1;
    }

void printGraph(){
    for (int i = 0; i < vertex; i++) {
        System.out.print("Gedung "+(char)('A'+i)+": ");
        for (int j = 0; j < vertex; j++) {
            if (matriks[i][j] != -1){
                System.out.print("Gedung "+(char)('A'+j)+" ("+ matriks[i][j]+" m), ");
            }
        }
        System.out.println();
    }
}

public int inDegree(int node) {
    int inDegree = 0;
    for (int i = 0; i < vertex; i++) {
        if (matriks[i][node] != -1) {
            inDegree++;
        }
    }
    return inDegree;
}

public int outDegree(int node) {
    int outDegree = 0;
    for (int j = 0; j < vertex; j++) {
        if (matriks[node][j] != -1) {
            outDegree++;
        }
    }
    return outDegree;
}
}
