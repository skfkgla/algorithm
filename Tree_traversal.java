package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tree_traversal {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static class Node {
		char data;
		Node Left, Right;

		public Node(char data) {
			this.data = data;
		}
    }
    static class Tree{
        Node root;  //초기상태의 root

        public void CreateNode(char data, char leftData, char rightData){
            if(root == null){       //아무것도 없는 처음 상태 - A(루트) 노드 생성
                root = new Node(data);

                //.이 아니고 값이 존재하면 각 좌우에 노드 생성
                if(leftData != '.'){
                    root.Left = new Node(leftData);
                }
                if(rightData != '.'){
                    root.Right = new Node(rightData);
                }
            }else Search(root, data, leftData, rightData);
            
        }
        public void Search(Node root, char data, char leftData, char rightData){
            if(root == null){   //도착 노드가 null이면(재귀 기저 조건)
                return;
            }
            else if(root.data == data){
                if(leftData != '.'){
                    root.Left = new Node(leftData);
                }
                if(rightData != '.'){
                    root.Right = new Node(rightData);
                }
            }
            else{
                Search(root.Left, data, leftData, rightData);   //왼쪽 재귀
                Search(root.Right, data, leftData, rightData);  //오른쪽 재귀
            }
        }
        //전위순회: 루트 - 좌 - 우
        public void PreOrder(Node root) throws IOException{
            bw.write(root.data); //루트
            if (root.Left != null)
                PreOrder(root.Left); //왼쪽 재귀 출력
            if (root.Right != null)
                PreOrder(root.Right);   //오른쪽 재귀출력
        }
        //중위순회: 좌 - 루트 - 우
        public void InOrder(Node root) throws IOException{
            
            if (root.Left != null)
                InOrder(root.Left); //왼쪽 재귀 출력
            bw.write(root.data); //루트
            if (root.Right != null)
                InOrder(root.Right);   //오른쪽 재귀출력
        }
        //후위순회: 좌 - 우 - 루트
        public void PostOrder(Node root) throws IOException{
            
            if (root.Left != null)
                PostOrder(root.Left); //왼쪽 재귀 출력
            
            if (root.Right != null)
                PostOrder(root.Right);   //오른쪽 재귀출력
            bw.write(root.data); //루트
        }
    }
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for(int i=0; i<N; i++){
            char[] data;
            data = br.readLine().replace(" ", "").toCharArray();
            tree.CreateNode(data[0], data[1], data[2]);
        }

        //전위 순회
        tree.PreOrder(tree.root);
        bw.write("\n");

        //중위 순회
        tree.InOrder(tree.root);
        bw.write("\n");
        //후위 순회
        tree.PostOrder(tree.root);

        bw.flush();
        bw.close();
        br.close();
    }
}