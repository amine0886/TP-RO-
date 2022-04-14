
import ilog.concert.*;
import ilog.cplex.*;

package tp2;

/*public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void tp2() {
		try {
			IloCplex IloCplex = new IloCplex();
			
			
		}
		catch(Iloexeption exc){
			exc.printStackTrace();
			
		}
	}

}
*/

public class Graphe {
    protected  int nombreSommet;
    protected int nombreArcs;
    protected  int matriceAdjacence[][];
    protected  int matriceIncidence[][];

    public Graphe(int nombreSommet,int nombreArcs,int matriceAdjacence[][]){
        this.nombreSommet=nombreSommet;
        this.nombreArcs=nombreArcs;
        this.matriceAdjacence=matriceAdjacence;
        this.matriceIncidence=construireMatriceIncidence(this.matriceAdjacence);
    }
    private int[][] construireMatriceIncidence(int[][] matriceAdjacence2) {
		// TODO Auto-generated method stub
		return null;
	}
	public int getNombreArcs() {
        return nombreArcs;
    }

    public int getNombreSommet() {
        return nombreSommet;
    }
    //fonction qui retourne la matrice d'adjacence
    public int[][] getMatriceAdjacence() {
        return this.matriceAdjacence;
    }
    //fonction qui retourne la matrice d'adjacence
    public int[][] getMatriceIncidence() {
        return this.matriceIncidence;
    }
    private int[][] construireMatriceIncidence1(int[][] matriceAdjacence) {
        int matrice[][]=new int[matriceAdjacence.length][matriceAdjacence.length];
        for (int i = 0; i < matriceAdjacence.length; i++) {
            for (int j = 0; j <matriceAdjacence[i].length ; j++) {
                if(matriceAdjacence[i][j]!=0){
                    matrice[i][j]=1;
                }else{
                    matrice[i][j]=0;
                }
            }
        }
        return matrice;
    }

   