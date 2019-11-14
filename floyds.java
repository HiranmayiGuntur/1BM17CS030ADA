package hiran;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
  
class floyds 
{ 
    final static int INF = 99999, V = 4; 
  
    void floydWarshall(int graph[][]) 
    { 
        int dist[][] = new int[V][V]; 
        int i, j, k; 
  
        for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                dist[i][j] = graph[i][j]; 
        for (k = 0; k < V; k++) 
        { 
            for (i = 0; i < V; i++) 
            { 
                for (j = 0; j < V; j++) 
                { 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
        printSolution(dist); 
    } 
  
    void printSolution(int dist[][]) 
    { 
        System.out.println("The following matrix shows the shortest distances between every pair of vertices"); 
        for (int i=0; i<V; ++i) 
        { 
            for (int j=0; j<V; ++j) 
            { 
                if (dist[i][j]==INF) 
                    System.out.print("INF "); 
                else
                    System.out.print(dist[i][j]+"   "); 
            } 
            System.out.println(); 
        } 
    } 
    public static void main (String[] args) 
    { 
        
    	int graph[][] = new int[][] { { 0, 4, INF, INF, INF, INF, INF, 8, INF}, 
            { 4, 0, 8, INF, INF, INF, INF, 11, INF }, 
            { INF, 8, 0, 7, INF, 4, INF, INF, 2 }, 
            { INF, INF, 7, 0, 9, 14, INF, INF, INF }, 
            { INF, INF, INF, 9, 0, 10, INF, INF, INF }, 
            { INF, INF, 4, 14, 10, 0, 2, INF, INF }, 
            { INF, INF, INF, INF, INF, 2, 0, 1, 6 }, 
            { 8, 11, INF, INF, INF, INF, 1, 0, 7 }, 
            { INF, INF, 2, INF, INF, INF, 6, 7, 0 } }; 
        floyds a = new floyds(); 
  
        a.floydWarshall(graph); 
    } 
} 
  
