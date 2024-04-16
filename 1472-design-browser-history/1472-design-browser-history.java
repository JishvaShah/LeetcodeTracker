class Node
 {
     public String url;
     public Node next;
     public Node prev;

     Node()
     {
         this.url = "";
         this.next = null;
         this.prev = null;
     }

     Node(String url)
     {
         this.url = url;
         this.next = null;
         this.prev = null;
     }
 }

class BrowserHistory {
    Node prev=null, temp=null, head=null;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        prev=head;
    }
    
    public void visit(String url) {
        temp = new Node(url);
        prev.next=temp;
        temp.prev=prev;
        temp.next=null;
        prev=temp;
    }
    
    public String back(int steps) {
        int k=steps;
        while(prev.prev!=null && k>=1){
            k--;
            prev=prev.prev;
        }
        return prev.url;
    }
    
    public String forward(int steps) {
        int k=1;
        while(prev.next!=null && k<=steps){
            k++;
            prev=prev.next;
        }
        return prev.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */