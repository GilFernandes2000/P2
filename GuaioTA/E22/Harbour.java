
import static java.lang.System.*;
import pt.ua.p2utils.*;

public class Harbour {

  private final Dock[] docks;
  private final int maxStack;
  private static HashTable<Integer> numOrders = new HashTable<>(1000);

  public Harbour(int nOfDocks,int maxStack) {

    docks = new Dock[nOfDocks];
    for (int dockId=0; dockId<nOfDocks; dockId++) {
      docks[dockId] = new Dock(maxStack);
    }
    this.maxStack = maxStack;
  }        

  public boolean stackEmpty(int dockId) {
    return docks[dockId].stackEmpty();
  }

  public boolean stackFull(int dockId) {
    return docks[dockId].stackFull();
  }

  public boolean accessExtensionEmpty(int dockId) {
    return docks[dockId].accessExtensionEmpty();
  }

  public void displayDocks() {
    for (int dockId=0; dockId<docks.length; dockId++) {
      out.println(dockId+": "+docks[dockId]);
    }
  }

  public void enterContainer(int dockId,Container c) {
    docks[dockId].enterContainer(c); // implement in the Dock class
    if(!numOrders.contains(c.destination)){
		numOrders.set(c.destination, 1);
	}
	else {
		numOrders.set(c.destination, numOrders.get(c.destination) + 1);
	}

  }

  public void moveFromAccessToStack(int dockId) {
    docks[dockId].moveFromAccessToStack(); // implement in the Dock class
  }

  // the container on top of the stack in the given dock
  // is removed because it will be shipped
  public Container shipContainer(int dockId) {
    Container c = docks[dockId].shipContainer(); //implement in the Dock class
    assert numOrders.get(c.destination) > 0;
    numOrders.set(c.destination, numOrders.get(c.destination) - 1);
    if(numOrders.get(c.destination) == 0){
		numOrders.remove(c.destination);
	}

    return c;
  }

  // total number of containers
  public int count() {
	int cont = 0;
    for(int i = 0; i < docks.length; i++){
		cont += docks[i].count();
	}
	return cont;
  }

  // number of containers for a given destination
  public int countToDestination(String destin) {
    assert numOrders.contains(destin);
    return numOrders.get(destin);

  }

  // array containing destinations of existing containers
  public String[] currentDestinations() {
    return numOrders.keys();

  }

  // given a dock, picks the first container
  // in the queue and inserts in the stack of the same dock
  public void insertFirstInStack(int dockId) {
    docks[dockId].insertFirstInStack(); // implement in the Dock class
  }
}

