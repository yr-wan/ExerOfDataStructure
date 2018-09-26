package yrwan13;

public class Graph {
	private Vertex[] vertexList;// 顶点数组
	private int[][] adjMat;// 邻接矩阵
	private int nVertex;// 当前数量
	private MyStack stack;// 用栈实现深度优先搜索
	private MyQueue queue;// 用队列实现广度优先搜索

	public Graph(int size) {
		vertexList = new Vertex[size];
		adjMat = new int[size][size];
		// 初始化邻接矩阵所有元素都为0，即所有顶点都没有边
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;// 初始化顶点个数为0
		stack = new MyStack();
		queue = new MyQueue();
	}

	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void displayAdjMat() {
		for (int i = 0; i < nVertex; i++) {
			for (int j = 0; j < nVertex; j++) {
				System.out.print(adjMat[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 打印某个顶点表示的值
	public void display(int v) {
		System.out.print(vertexList[v].label);
	}

	// 找到与某一顶点邻接且未被访问的顶点
	public int getAdjUnvisitedVertex(int v) {
		for (int i = 0; i < nVertex; i++) {
			if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 深度优先搜索算法:
	 * 1、用peek()方法检查栈顶的顶点
	 * 2、用getAdjUnvisitedVertex()方法找到当前栈顶点邻接且未被访问的顶点
	 * 3、第二步方法返回值不等于-1则找到下一个未访问的邻接顶点，访问这个顶点，并入栈;如果第二步方法返回值等于 -1，则没有找到，出栈
	 */
	public void dfs() {
		// 从第一个顶点开始访问
		vertexList[0].wasVisited = true;// 访问之后标记为true
		display(0);// 打印访问的第一个顶点
		stack.push(0);// 将第一个顶点放入栈中
		while (!stack.isEmpty()) {
			// 找到栈当前顶点邻接且未被访问的顶点
			int v = getAdjUnvisitedVertex(stack.peek());
			if (v == -1) {// 如果当前顶点值为-1，则表示没有邻接且未被访问顶点，那么出栈顶点
				stack.pop();
			} else {// 否则访问下一个邻接顶点
				vertexList[v].wasVisited = true;
				display(v);
				stack.push(v);
			}
		}
		// 搜索完毕，重置所有标记位
		for (int i = 0; i < nVertex; i++) {
			vertexList[i].wasVisited = false;
		}
	}
	
	 /**
     * 广度优先搜索算法：
     * 1、用remove()方法检查栈顶的顶点
     * 2、试图找到这个顶点还未访问的邻节点
     * 3、 如果没有找到，该顶点出列
     * 4、 如果找到这样的顶点，访问这个顶点，并把它放入队列中
     */
	public void bfs() {
		vertexList[0].wasVisited = true;
		display(0);
		queue.insert(0);
		while (!queue.isEmpty()) {
			int v = queue.remove();
			int temp;
			while ((temp = getAdjUnvisitedVertex(v)) != -1) {
				vertexList[temp].wasVisited = true;
				display(temp);
				queue.insert(temp);
			}
		}
		// 搜索完毕，重置所有标记位
		for (int i = 0; i < nVertex; i++) {
			vertexList[i].wasVisited = false;
		}
	}
	
}
