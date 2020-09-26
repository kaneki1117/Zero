package leetcode.nums121_150;


//leetcode 感觉编译有问题 lintcode上 完成了AC
import q_util.GraphNode;

import java.util.*;

public class Ques133 {

    public static void main(String[] args) {

        GraphNode g = new GraphNode(0);
        g.neighbors.add(new GraphNode(1));
        g.neighbors.add(new GraphNode(2));

        System.out.println(cloneGraph(g));



    }

    public static GraphNode cloneGraph(GraphNode node) {
        if(node == null) return node;

        Map<GraphNode, GraphNode> nodeToNewNode = new HashMap<>();
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(node);
        //1. get all node map to map
        while (!queue.isEmpty()) {
            GraphNode n = queue.poll();
            nodeToNewNode.put(n, new GraphNode(n.val));
            for (GraphNode neighbor : n.neighbors) {
                if(nodeToNewNode.containsKey(neighbor)) continue;
                queue.offer(neighbor);
                nodeToNewNode.put(neighbor, new GraphNode(neighbor.val));
            }

        }

        // 2.make neighbors
        for (GraphNode n1 : nodeToNewNode.keySet()) {
            GraphNode cloneN1 = nodeToNewNode.get(n1);
            for(GraphNode neighbor : n1.neighbors) {
                GraphNode clonedNeighbor = nodeToNewNode.get(neighbor);
                cloneN1.neighbors.add(clonedNeighbor);
            }
        }
        
        return nodeToNewNode.get(node);
        
    }

}
