package Percobaan1;

public class Graph26 {
    int vertex;
    boolean path;
    DoubleLinkedList26[] list;

    Graph26(int v) {
        vertex = v;
        list = new DoubleLinkedList26[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList26();
        }
    }

    void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        //list[tujuan].addFirst(asal, jarak); // Apabila graf yang dibuat adalah undirected graph
    }

    void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for(k= 0; k<list[asal].size();k++){
                list[asal].get(k);
            }
            totalOut=k;
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + vertex) + ": " + (totalIn + totalOut));
        System.out.println("Degree dari gedung" + (char)('A' + asal) + ": " + list[asal].size());
    }

    void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
               list[asal].remove(tujuan); 
            }
        }
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    void isConnected(int start, int end) throws Exception {
        path = false; // Set path ke false di awal
        boolean[] visited = new boolean[vertex];
        connected(start, end, visited);
        if (path) {
            System.out.println("Gedung " + (char) ('A' + start) + " Bertetangga dengan " + (char) ('A' + end));
        } else {
            System.out.println("gedung " + (char) ('A' + start) + " Tidak Bertetangga dengan gedung2 " + (char) ('A' + end));
        }
    }

    void connected(int current, int end, boolean[] visited) throws Exception {
        if (current == end) {
            path = true;
            return;
        }
        visited[current] = true;
        for (int i = 0; i < list[current].size(); i++) {
            int neighbor = list[current].get(i);
            if (!visited[neighbor]) {
                connected(neighbor, end, visited);
                if (path) {
                    return;
                }
            }
        }
    }
    void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
        boolean edgeFound = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].getJarak(i);
                edgeFound = true;
                break;
            }
        }
        
}
    int hitungEdge() {
    int totalEdge = 0;
    for (int i = 0; i < vertex; i++) {
        totalEdge += list[i].size();
    }
    return totalEdge;
    }
}
