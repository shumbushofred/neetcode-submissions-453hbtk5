/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> themap;
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        themap = new HashMap<>();
        helper(node);
        return themap.get(node);
    }
   public void helper (Node node){
        if(node == null) return;
        Node current = new Node(node.val);
        // if(!themap.containsKey(node)){
               themap.put(node,current);
            // }else{
            //     return;
            // }
       
        for(Node i: node.neighbors){
            if(!themap.containsKey(i)){
              helper(i);
            }
            themap.get(node).neighbors.add(themap.get(i));
        }
   }
}