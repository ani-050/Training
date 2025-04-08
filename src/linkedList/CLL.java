package linkedList;

public class CLL {
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	public boolean append(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		}
		else {
			tail.next=node;
			tail=node;
			tail.next=head;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		}
		else {
			node.next=head;
			head=node;
			tail.next=head;
		}
		size++;
		return true;
	}
	
	public boolean insert(int value,int index) {
		Node node=new Node(value);
		if(index<0) {
			prepend(value);
		}
		else if(index>=size) {
			append(value);
		}
		Node temp=head;
		Node prev=null;
		int i=0;
		while(i!=index) {
			prev=temp;
			temp=temp.next;
			i++;
		}
		prev.next=node;
		node.next=temp;
		size++;
		return true;
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
			tail.next=head;
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
			tail.next=head;
		}
		size--;
		return true;
	}
	
	public boolean deleteIndex(int index) {
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
		}
		size--;
		return true;
	}
	
	public void reverse() {
		Node current=head;
		Node prev=tail;
		Node next=null;
		tail=head;
		do {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		while(current!=head);
		head=prev;
		display();
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
		int i=0;
		do {
			if(temp.value==target) {
				return i;
			}
			temp=temp.next;
			i++;
		}
		while(temp!=head);{
			return i;
		}
	}
	
	public void display() {
		Node temp=head;
		StringBuffer sb=new StringBuffer("[");
		do {
			sb.append(temp!=tail ? temp.value+" -> " : temp.value);
			temp=temp.next;
		}
		while(temp!=head);
		{
			sb.append("]");
			System.out.println(sb);
		}
	}

}
