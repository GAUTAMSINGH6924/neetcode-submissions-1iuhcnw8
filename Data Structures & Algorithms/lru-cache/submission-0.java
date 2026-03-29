class LRUCache {
    class Node{
        int key,value;
        Node prev,next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private int capacity;
    private Map<Integer,Node>map;
    private Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        inFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node exist=map.get(key);
            exist.value=value;


            remove(exist);
            inFront(exist);
        }
        else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode=new Node(key,value);
            inFront(newNode);
            map.put(key,newNode);
        }
    }
    public void remove(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    public void inFront(Node node){
        head.next.prev=node;
        node.next=head.next;

        head.next=node;
        node.prev=head;
    }
}
