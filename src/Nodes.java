
public class Nodes<T> {

	Nodes next;
	T data;
	
	public Nodes(T input,Nodes node){
		this.next= node;
		this.data=input;
		
	}
	public Nodes(T input){
		
		this(input,null);
	}
	
	public void setNext(Nodes newNext){
		this.next = newNext;
	}
	public void setData(T data){
		
		this.data=data;
	}
	public Nodes getNext(){
		
		return next;
	}
	public T getData(){
		
		return data;
	}
}
