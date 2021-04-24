package p2utils;

public class LinkedList<E> {

  private Node<E> first = null;
  private Node<E> last = null;
  private int size = 0;

  /** {@code LinkedList} constructor, empty so far.
   */
  public LinkedList() { }

  /** Returns the number of elements in the list.
   * @return Number of elements in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /** Returns the first element in the list.
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";

    return first.elem;
  }

  /** Returns the last element in the list.
   * @return Last element in the list
   */
  public E last() {
    assert !isEmpty(): "empty!";

    return last.elem;
  }

  /** Adds the given element to the start of the list.
   * @param e the element to add
   */
  public void addFirst(E e) {
    first = new Node<>(e, first);
    if (isEmpty())
      last = first;
    size++;

    assert !isEmpty(): "empty!";
    assert first().equals(e) : "wrong element";
  }

  /** Adds the given element to the end of the list.
   * @param e the element to add
   */
  public void addLast(E e) {
    Node<E> newest = new Node<>(e);
    if (isEmpty())
      first = newest;
    else
      last.next = newest;
    last = newest;
    size++;

    assert !isEmpty(): "empty!";
    assert last().equals(e) : "wrong element";
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    first = first.next;
    size--;
    if (isEmpty())
      last = null;
  }

  /** Removes all elements.
   */
  public void clear() {
    first = last = null;
    size = 0;
  }

  /** Returns a string representing the list contents.
   * @return A string representing the list contents
   */
  public String toString() {
    String sep = "";
    String s = "";
    for (Node<E> n = first; n != null; n = n.next) {
      s += sep + n.elem;
      sep = ", ";
    }
    return "[" + s + "]";
  }

  // funcoes adicionais pedidas no guião...
  
  public int count(E e){
	  return count(first, e);
  }
  
  private int count(Node<E> n, E e){
	  int count = 0;
	  if(n==null) return 0;
	  if(n.next == null) return count;
	  else{
		  if(n.elem == e){
			  count++;
		  }
		  return count(n.next, e);
	  }
  }
  
  public int indexOf(E e){
	  return indexOf(first, e);
  }
  
  private int indexOf(Node<E> n, E e){
	  int count = 0;
	  if(n==null) return -1;
	  if(n.next == null && n.elem != e) return -1;
	  else{
		  count++;
		  if(n.elem == e){
			  return count;
		  }
		  return indexOf(n.next, e);
	  }
  }
  
  public LinkedList<E> cloneReplace(E x, E y){
	  return cloneReplace(first, x, y);
  }
  private LinkedList<E> cloneReplace(Node<E> n, E x, E y){
	  if(n == null) return new LinkedList<E> ();
	  
	  LinkedList<E> clre = new LinkedList<E>();
	  
	  if(n.next == null) return clre;
	  
	  else{
		  if(n.elem == x){
			  clre.addFirst(y);
		  }
		  else{
			  clre.addFirst(n.elem);
		  }
		  return cloneReplace(n.next, x, y);
	  }
  }
  
  public LinkedList<E> cloneSublist(int start, int end){
	  return cloneSublist(first, start, end);
  }
  private LinkedList<E> cloneSublist(Node<E> n, int start, int end){
	  if(n==null) return new LinkedList<E> ();
	   LinkedList<E> sub = new LinkedList<E> ();
	   
	   if(n.next == null) return sub;
	   else{
		   if(indexOf(n.elem) >= start && indexOf(n.elem) <= end){
			   sub.addFirst(n.elem);
		   }
		   return cloneSublist(n.next, start, end);
	   }
   }
   
   public LinkedList<E> cloneExceptSublist(int start, int end){
	   return cloneExceptSublist(first, start, end);
   }
   
   private LinkedList<E> cloneExceptSublist(Node<E> n, int start, int end){
	   if(n == null) return new LinkedList<E>();
	   
	   LinkedList<E> clExSub = new LinkedList<E> ();
	   
	   if(n.next == null) return clExSub;
	   else{
		   if(indexOf(n.elem) < start || indexOf(n.elem) > end){
			   clExSub.addFirst(n.elem);
		   }
		   return cloneExceptSublist(n.next, start, end);
	   }
   }
}

