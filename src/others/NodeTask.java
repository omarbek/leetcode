package others;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NodeTask {

    private static Node remainNode;

    public static void main(String[] args) {
        //input: e1-e2-e3-e4-null
        Node e4 = new Node("e4", null);
        Node e3 = new Node("e3", e4);
        Node e2 = new Node("e2", e3);
        Node e1 = new Node("e1", e2);

        Node invert = invert(e1);
        System.out.println(invert.value);
        //output: e4-e3-e2-e1-null
    }

    private static void doStream(){
        List<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("b");
        s.stream()
                .map(String::toString)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(x -> 1)))
                .forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static Node invert(final Node head){
        //run until meet null
        //after method switch direction
        if(head.next==null){
            remainNode = head;
            return head;
        }
        Node invert = invert(head.next);
        invert.next=head;
        if(head.value.equals("e1")){
            head.next=null;
        }
        return head;
    }
}
