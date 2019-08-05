// 双向链表
public class DoubleList{
    
    // 节点类
    public class Node{
        public Node pre;
        public Node next;
        public int data;
 
        public Node(){
            this.data = null;
            this.next = null;
            this.pre = null;
        }
        public Node(T data,Node pre, Node next){
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }

    // 链表大小
    private int size;
    // 头指针
    private Node<T> header;
    // 尾指针
    private Node<T> tail;
 
    // 初始化链表
    public DoubleList(){
        this.size = 0;
        header = new Node(null,null,null);
        tail = new Node(null,header,null);
        header.next = tail;
    }

    // 添加元素（尾插）
    public void add(int item){
        Node newNode = new Node(item,null,null);
        tail.pre.next = newNode;
        newNode.pre = tail.pre;
        newNode.next = tail;
        tail.pre = newNode;
        size++;
    }

    // 删除元素
    public void deleteValue(int value){
        Node p = head;
        for(;p.next != null;p = p.next) {
            if (p.next.data == value) {
                break;
            }
        }
        Node q = p.next;
        p.next = q.next;
        q.next.pre = p;        
    }
 
}