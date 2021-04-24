package p2utils;
import java.lang.System.*;

public class SupermarketOrdering{
	private Queue<Order> Orders = new Queue<>();
	private int numOrders = 0;
	private HashTable<Integer> products = new HashTable<>(10);
	
	public void Order enterOrder(Order o){
		Orders.in(o);
		
		if(!products.contains(order.prodName)){
			products.set(order.prodName, order.quantity);
		}
		else{
			products.set(order.prodName, products.get(order.prodName) + order.quantity);
		}
		assert !isEmpty;
	}
	
	public Order serveOrder(){
		Order view = Orders.peek();
		
		products.set(ser.prodName, products.get(view.prodName) - viewquantity);
		
		Orders.out();
		numOrders--;
		return view;
	}
	
	public int query(String product){
		return products.get(product);
	}
	
	public void displayOderedProducts(){
		String[] keys = products.keys();
		out.print("Produtos ordenados:");
		for (int i = 0; i < keys.length; i++)
		{
			int requested = products.get(keys[i]);
			if(requested > 0){
				out.print(keys[i] + ":" + requested + " ");
			}
		}
		out.println();
	}
}
