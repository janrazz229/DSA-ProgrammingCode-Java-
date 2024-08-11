package Queue;


public class QueueOperations 
{
	public static class Queue
	{
		static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear =-1;
        }
        public static boolean isEmpty(){
            return rear ==-1;
        }
        
        // Add Method(Enqueue)
        //................................................................................
        public static void add(int data){
            if(rear == size-1){
                System.out.println("full");
                return ;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        
        // Remove in Queue(Dequeue)
        //..................................................................................

        public static int remove(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i =0 ;i<rear ;i++){
                arr[i] = arr[i+1];

            }
            rear = rear-1;
            return front;
        }
        
        
        // peek operations in Queue 
        //......................................................................................
        public static int peek(   ){
            return arr[0];
        }
    }
    public static void main(String [] args){
        Queue Q = new Queue(5);
        Q.add(5);
        Q.add(8);
        Q.add(0);
        Q.add(9);
        Q.add(12);
        Q.add(20);
        System.out.print(Q.size+" ");
        Q.remove();
        System.out.println(Q.size);
        
        
        System.out.println(Q.peek());
//        while(!Q.isEmpty()){
//            System.out.println(Q.peek());
//            Q.remove();
//        }
    }
}