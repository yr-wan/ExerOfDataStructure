package yrwan13;

public class Graph {
	private Vertex[] vertexList;// ��������
	private int[][] adjMat;// �ڽӾ���
	private int nVertex;// ��ǰ����
	private MyStack stack;// ��ջʵ�������������
	private MyQueue queue;// �ö���ʵ�ֹ����������

	public Graph(int size) {
		vertexList = new Vertex[size];
		adjMat = new int[size][size];
		// ��ʼ���ڽӾ�������Ԫ�ض�Ϊ0�������ж��㶼û�б�
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;// ��ʼ���������Ϊ0
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

	// ��ӡĳ�������ʾ��ֵ
	public void display(int v) {
		System.out.print(vertexList[v].label);
	}

	// �ҵ���ĳһ�����ڽ���δ�����ʵĶ���
	public int getAdjUnvisitedVertex(int v) {
		for (int i = 0; i < nVertex; i++) {
			if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * ������������㷨:
	 * 1����peek()�������ջ���Ķ���
	 * 2����getAdjUnvisitedVertex()�����ҵ���ǰջ�����ڽ���δ�����ʵĶ���
	 * 3���ڶ�����������ֵ������-1���ҵ���һ��δ���ʵ��ڽӶ��㣬����������㣬����ջ;����ڶ�����������ֵ���� -1����û���ҵ�����ջ
	 */
	public void dfs() {
		// �ӵ�һ�����㿪ʼ����
		vertexList[0].wasVisited = true;// ����֮����Ϊtrue
		display(0);// ��ӡ���ʵĵ�һ������
		stack.push(0);// ����һ���������ջ��
		while (!stack.isEmpty()) {
			// �ҵ�ջ��ǰ�����ڽ���δ�����ʵĶ���
			int v = getAdjUnvisitedVertex(stack.peek());
			if (v == -1) {// �����ǰ����ֵΪ-1�����ʾû���ڽ���δ�����ʶ��㣬��ô��ջ����
				stack.pop();
			} else {// ���������һ���ڽӶ���
				vertexList[v].wasVisited = true;
				display(v);
				stack.push(v);
			}
		}
		// ������ϣ��������б��λ
		for (int i = 0; i < nVertex; i++) {
			vertexList[i].wasVisited = false;
		}
	}
	
	 /**
     * ������������㷨��
     * 1����remove()�������ջ���Ķ���
     * 2����ͼ�ҵ�������㻹δ���ʵ��ڽڵ�
     * 3�� ���û���ҵ����ö������
     * 4�� ����ҵ������Ķ��㣬����������㣬���������������
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
		// ������ϣ��������б��λ
		for (int i = 0; i < nVertex; i++) {
			vertexList[i].wasVisited = false;
		}
	}
	
}
