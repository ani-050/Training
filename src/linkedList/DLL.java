package linkedList;

public class DLL {
	private Node head;
	private Node tail;
	private int size;

	private class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public boolean append(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
		return true;
	}

	public boolean prepend(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
			node.prev = null;
		}
		size++;
		return true;
	}

	public boolean insert(int value, int index) {
		Node node = new Node(value);
		if (index <= 0) {
			prepend(value);
		} else if (index >= size) {
			append(value);
		}
		Node temp = head;
		Node prev=null;
		int i = 0;
		while (i != index) {
			prev=temp;
			temp = temp.next;
			i++;
		}
		prev.next=node;
		node.prev=prev;
		node.next=temp;
		temp.prev=node;
		size++;
		return true;
	}

	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		tail = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			current.prev=next;
			prev=current;
			current=next;
		}
		head = prev;
		display();
	}

	public boolean deleteFirst() {
		if(isEmpty()) {
			System.out.println("nothing to delete");
		}
		else if(size==1) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;
			head.prev=null;
		}
		size--;
		return true;
	}
	
	public boolean deleteLast() {
		if(isEmpty()) {
			System.out.println("nothing to delete");
		}
		else if(size==1) {
			head=null;
			tail=null;
		}
		else {
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			tail=temp;
			tail.next=null;
		}
		size--;
		return true;
	}
	
	public  boolean deleteIndex(int index) {
		if(index<0) {
			deleteFirst();
		}
		else if(index>size) {
			deleteLast();
		}
		else {
			Node temp=head;
			int i=0;
			while(i!=index-1) {
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
		size--;
		return true;
	}
	
	public boolean update(int value,int index) {
		if(index<0) {
			System.out.println("wrong index");
		}
		else if(index>=size) {
			System.out.println("wrong index");
		}
		Node temp=head;
		int i=0;
		while(i!=index) {
			temp=temp.next;
			i++;
		}
		temp.value=value;
		return true;
	}
	
	public int search(int target) {
		Node temp=head;
		for(int i=0;i<size;i++) {
			if(temp.value==target) {
				return i;
			}
			else {
				temp=temp.next;
			}
		}
		return -1;
	}
	
	public void display() {
		Node temp = head;
		StringBuffer sb = new StringBuffer("[");
		while (temp != null) {
			sb.append(temp == tail ? temp.value : temp.value + " -> ");
			temp = temp.next;
		}
		sb.append("]");
		System.out.println(sb);
	}
	
	public void displayReverse() {
		Node temp = tail;
		StringBuffer sb = new StringBuffer("[");
		while (temp != null) {
			sb.append(temp == head ? temp.value : temp.value + " -> ");
			temp = temp.prev;
		}
		sb.append("]");
		System.out.println(sb);
	}

}
