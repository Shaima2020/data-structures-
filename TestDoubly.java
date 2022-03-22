import java.util.Scanner;

public class TestDoubly {
    public static void main(String[] args) {
        DoublyLinkedList<String>list =new DoublyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice=-1;
        System.out.println(" 1 add frist \t 2 add last\t 3 remove frist \t 4 remove last \t 0 exit");
        while (choice!=0){

            System.out.println("your choice :");
          choice=in.nextInt();
          switch (choice){
              case 0:
                  System.exit(0);
                  break;
              case 1:
                  System.out.println("input a name ");
                  list.addFirst(in.next());
                  break;
              case 2:
                  System.out.println("input a name ");
                  list.addLast(in.next());
                  break;
              case 3:
                  System.out.println(" removed is :"+list.removeFrist());
                  break;
              case 4:
                  System.out.println("removed is :"+ list.removeLast());
                  break;
//              System.out.println("frist ="+list.frist()+"last");


            }

        }
    }
}
