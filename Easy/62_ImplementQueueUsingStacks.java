/*
 * 62] Implement Queue using Stacks
 */

class MyQueue {
    int data;
    MyQueue next;
    public MyQueue(int data) {

        this.data = data;
        this.next = null;
    }
    MyQueue Top = null;
    public MyQueue() {

    }

    public void push(int x) {

        MyQueue node = new MyQueue(x);
        if(Top == null) {
            Top = node;
        } else {
            MyQueue temp = Top;
            while(temp.next != null) {

                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int pop() {
        if(Top == null) {

            return -1;
        } else {

            int data = Top.data;
            Top = Top.next;
            return data;
        }
    }

    public int peek() {
        if(Top == null) {

            return -1;
        } else {

            return Top.data;
        }
    }

    public boolean empty() {

        if(Top == null) {

            return true;
        } else {

            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
