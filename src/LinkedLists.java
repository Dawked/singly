import javax.xml.soap.Node;


public class LinkedLists<T> {
	private Nodes<T> Head;
	private int size;
	private Nodes<T> tail;
	
	public LinkedLists(){
		
		Head = new Nodes<T>(null);
		tail = null;
		size = 0;
		
	}
	public void add(Nodes<T> next){
		
		if(size==0){
			Head.setNext(next);
			tail= next;
			
		}
		else if(size>0){
			next.setNext(Head.getNext());
			Head.setNext(next);
			
		}
		size++;
	}
	public void Remove(){
		if(size==0){
			throw new RuntimeException("empty");
		}
		else if(size==1){
			
			Head.setNext(null);
			tail = null;
		}
		else if(size>1){
			Nodes<T> temp= Head.getNext();
			Head.setNext(temp.getNext());
			if(temp.getNext()== tail){
				tail=null;
			}
			temp= null;
			
		}
			size--;
		
	}
	public int Size(){
		
		return size;
	}
	public String toString(){
		String str= " ";
		Nodes<T> trav= Head;
		
		for(int i=0; i<size;i++){
		
				str+= trav.getNext().getData();
				trav= trav.getNext();
			
		}
		
		return str;
		
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLists<Integer> link = new LinkedLists<>();
		link.add(new Nodes<Integer>(4));
		link.add(new Nodes<Integer>(2));
		link.add(new Nodes<Integer>(6));
		
		System.out.println(link);
		System.out.println(link.Size());
	}

}
