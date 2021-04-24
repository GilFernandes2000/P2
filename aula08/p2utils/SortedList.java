package p2utils;

public class SortedList<E extends Comparable<E>>
{
  // private attributes
  private Node<E> first = null;
  private int size = 0;

  public SortedList() { }

  /**
   * @return Number of elements in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /**
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";
      return first.elem;
  }

  /** Inserts a new element in the list.
   * @param e the element to be inserted
   */
  public void insert(E e) {
    first = insert(first,e);
    size++;
  }
  private Node<E> insert(Node<E> n,E e) {
    if (n==null || e<n.elem)
      return new Node<E>(e,n);
    n.next = insert(n.next,e);
    return n;
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    first = first.next;
    size--;
  }

  /** Checks if the list is sorted.
   * @return {@code true} if sorted, {@code false} otherwise
   */
  public boolean isSorted() { 
    if (size < 2)
      return true;
    return isSorted(first,first.next); 
  }
  private boolean isSorted(Node<E> prev,Node<E> n) {
    if (n == null) return true;
    if (n.elem < prev.elem) return false;
    return isSorted(n,n.next);
  }
  
  public boolean compareTo(E e){
		return compareTo(e, first);
  }
  private boolean compareTo(E e,Node<E> n){
	if(e == n.elem){
		return true;
	}
	return false;  
	  
  } 
  public void print(){
	  print(first);
  }
  private void print(Node<E> e){
	  if(e!= null){
		  System.out.println(e.elem);
		  print(e.next);
	  }
  }
  
  public boolean contains(E e){
	  return contains(e, first);
  }
  private boolean contains(E e, Node<E> n){
	  if(n.next != null){
		  if(e == n.elem){
			  return true;
		  }
		  return contains(e, n.next);
	  }
	  return false;
  }
  
  public String toString(){
	  return toString(first);
  }
  private String toString(Node<E> n){
	  if(n.first != null){
		   return "[]";
	   }
	  else{
		  String result = "[";
		  while(n.next != null){
			  result += n.elem +", ";
			  n = n.next;
		  }
		  result += "]";
		  return result;
	  }
  }
  
  public Node<E> merge(Node<E> lst1){
	  return merge(first, first);
  }
  private Node<E> merge(Node<E> lst1, Node<E> lst2){
	  Node<E> merg = new Node<E>();
	  if(lst1.next != null){
		  merg.insert(lst1.elem);
		  return merge(lst1.next, lst2);
	  }
	  if(lst2.next != null){
		  merg.insert(lst2.elem);
		  return merge(lst1, lst2.next);
	  }
	  return merg;
  }
}
