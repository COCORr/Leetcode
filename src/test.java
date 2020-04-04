import java.util.Scanner;
public class test {

    static public class LinkNode{
        private int value;
        private LinkNode next;
        LinkNode(int v,LinkNode ne){
            value=v;
            next=ne;
        }
        public LinkNode getNext(){
            return next;
        }
        public void setNext(LinkNode ne){
            next=ne;
        }
        public void setValue(int v ){
            value=v;
        }
        public int getValue(){
            return value;
        }
    }
    static public LinkNode merge(LinkNode first,LinkNode second){
        if(first==null){
            return second;
        }else if(second==null){
            return first;
        }

        LinkNode ans=new LinkNode(0,null);
        LinkNode temp=ans;
        while(first!=null&&second!=null){
            if(first.getValue()<second.getValue()){
                ans.setNext(first);
                ans=ans.getNext();
                first=first.getNext();
            }else{
                ans.setNext(second);
                ans=ans.getNext();
                second=second.getNext();
            }
        }
        while(first!=null){
            ans.setNext(first);
            first=first.getNext();
            ans=ans.getNext();
        }
        while(second!=null){
            ans.setNext(second);
            second=second.getNext();
            ans=ans.getNext();
        }
        return temp.getNext();

    }
    public static void main(String[] args) {
        LinkNode q3= new LinkNode(5,null);
        LinkNode q2= new LinkNode(3,q3);
        LinkNode q1= new LinkNode(1,q2);
        LinkNode p2= new LinkNode(4,null);
        LinkNode p1= new LinkNode(2,p2);
        LinkNode ans=merge(q1,p1);
        while(ans!=null){
            System.out.println(ans.getValue());
            ans=ans.getNext();
        }
    }
}