package arvB;
import java.util.ArrayList;
import java.util.List;

public class Node {
	private int n; // quantidade de chaves armazenadas no nodo X
	private List<Integer> chaves;
	private List<Node> ponteiros;
	
	//Construtor
	public Node(int n, List<Integer> chaves, List<Node> ponteiros) {
		this.n = n;
		this.chaves = chaves;
		this.ponteiros = ponteiros;
	}
	
	//Getters e setters
	public int getN() {
		return n;
	}
	public List<Integer> getChaves(){
		return chaves;
	}
	public List<Node> getPonteiros(){
		return ponteiros;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	public void setChaves(List<Integer> chaves) {
		this.chaves = chaves;
	}
	public void setPonteiros(List<Node> ponteiros) {
		this.ponteiros = ponteiros;
	}
}
