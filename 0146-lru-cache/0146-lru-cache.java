class DLL{
    int key;
    int val;
    DLL next;
    DLL prev;
    
    DLL(int key, int val){
        this.key = key;
        this.val = val;
    }
}


class LRUCache {
    
    HashMap<Integer, DLL> cache = new HashMap<>();
    int cap;
    DLL head = new DLL(0, 0);
    DLL tail = new DLL(0, 0);
    
    
    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        cap = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            DLL current = cache.get(key);
            delNode(current);
            insert(current);
            return current.val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            delNode(cache.get(key));
        }   
        if(cache.size() == cap){
            delNode(tail.prev);
        }
        DLL curr = new DLL(key, value);
        insert(curr);
    }
    
    public void insert(DLL node){
        cache.put(node.key, node);
        DLL temp = head.next;
        head.next = node;
        node.prev = head;
        temp.prev = node;
        node.next = temp;
    }
    
    public void delNode(DLL node){
        cache.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */