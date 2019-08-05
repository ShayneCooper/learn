class MyList {
    // 带头结点单链表
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    ListNode head = new ListNode();
    ListNode tail = head;

    public void addHead(int value){
        //头插
        ListNode newNode = new ListNode(value);
        newNode.next = head.next;
        head.next = newNode;
    }
    public void addTail(int value){
        //尾插 
        ListNode newNode = new ListNode(value);
        tail.next = newNode;
        tail = newNode;//更新尾节点
    }
  
    public void deleteValue(int value){
        //删除指定元素
        ListNode p = head;
        for(;p.next != null;p = p.next) {
            if (p.next.data == value) {
                break;
            }
        }
        p.next = p.next.next;        
    }

    //单链表反转
    public static Node reverseListNode(ListNode head){
        //单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.next == null) {
            return head;
        }
        //前一个节点指针
        ListNode preNode = null;
        //当前节点指针
        ListNode curNode = head;
        //下一个节点指针
        ListNode nextNode = null;
 
        while (curNode != null){
            nextNode = curNode.next;//nextNode 指向下一个节点
            curNode.next = preNode;//将当前节点next域指向前一个节点
            preNode = curNode;//preNode 指针向后移动
            curNode = nextNode;//curNode指针向后移动
        }
 
        return preNode;
    }

    //将两个有序的链表合并为一个有序的链表
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode cur1 = l1;
		ListNode cur2 = n2;
		ListNode last = null;
		ListNode result = null;
		while (n1 != null && n2 != null) {
			if(n1.value <= n2.value){
				ListNode nest = val1.next;
				if(result == null){
					resutlt = cur1;
				} else {
					last.next = cur1;
				}
				last=cur1;
				val1=next;
			} else {
				ListNode nest = val2.next;
				if(result == null){
					resutlt = cur2;
				} else {
					last.next = cur2;
				}
				last = cur2;
				val2 = next;
			}
		}
		if (cur1 != null) {
			last.next = cur1;
		} else {
			last.next = cur2;
		}
		return result;
    }

    // 寻找单链表中间节点
    public static ListNode FindMidNode(ListNode head){
        // 快慢指针
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}