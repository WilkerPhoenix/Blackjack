
package blackjack.util;

public class Stack implements IStack {
    private Node head;

    @Override
    public void push(Object data) {
        Node temp = head;
        head = new Node(data); head.setNext(temp);
    }
    @Override
    public Object pop() {
        if(! isEmpty()){
        Node temp = head; head = head.getNext();
        return temp.getData();
        }
        return null;
    }
    @Override
    public boolean isEmpty(){
        return head == null;
    }

    @Override
    public Object peek(){
        return isEmpty() ? null : head.getData();
    }
    
}
