// 循环链表
class CircularLinkedList {
    
    // 节点类
    class Node {          
        public int data;
        public Node next;
     
        public Node(int data) {
            this.data = date;
            this.next = null;
        }
    }
    
    // 头结点 
    public Node headNode;
 
    public CircularLinkedList() {
        headNode = null;
    }
    
    // 链表长度
    public int CirrcularListlength() {
        int length = 0;
        Node currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
            if (headNode == currentNode)
                break;
        }
        return length;
    }
 
    // 尾插
    public void insertAtEnd(Node item) {
 
        if (headNode == null) {
            headNode = item;
            headNode.next = headNode;
        } else {
            Node currentNode = headNode;
            while (currentNode.next != headNode) {
                currentNode = currentNode.next;
            }
            currentNode.next = item;
            item.next = headNode;
        }
    }
    
    // 头插
    public void insertAtBegin(Node item) {
        if (headNode == null) {
            headNode = item;
            headNode.next = headNode;
        } else {
            Node currentNode = headNode;
            while (currentNode.next != headNode) {
                currentNode=currentNode.next;
            }
            currentNode.next= item;
            item.next = headNode;
            headNode = item;
        }
    }
    
    // 删除元素
    public void deleteValue(int value){
        Node temp = headNode;
        for(;p.next != headNode;p = p.next) {
            if (p.next.data == value) {
                break;
            }
        }
        p.next = p.next.next;       
    }
}