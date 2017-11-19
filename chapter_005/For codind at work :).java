class Queue<E> extends CustomLinkedList<E> {        
	Queue(final int size) {        
		super(size);    
	}       
boolean add(final E e) {        
try {            
super.fillNextValue();           
super.getElements[super.getLastIndex()].setContainer(e);         
super.incrementIndex();         
return true;        
} catch (ArrayIndexOutOfBoundsException aioobe) {    
//System.out.println();           
throw new IllegalStateException("Queue is full! You need to remove something first.");      
}       
return false;   
}      
E element() {        
	return super.getElements[super.getLastIndex() - 1].getContainer();    
}        
	boolean offer(E e) {        
		try {            
			super.fillNextValue();            
			super.getElements[super.getLastIndex()].setContainer(e);            
			super.incrementIndex();            
			return true;        
		} catch (ArrayIndexOutOfBoundsException aioobe) {            
			return false;        
		}    
	}        
	E peek() {        
		if (!super.getElements.equals(null)) {            
			return super.getElements[super.getLastIndex() - 1].getContainer();        
		} else {            
			return null;       
		}    
	}        
	E poll() {        
		if (!super.getElements.equals(null)) {            
			E temp = (E) super.getElements[super.getLastIndex() - 1].getContainer();          
			super.getElements[super.getLastIndex() - 2].setNext = null;            
			super.decrementIndex();            
			return temp;        
		} else {            
			return null;       
		}   
	}        
	E remove() {        
		E temp = (E) super.getElements[super.getLastIndex() - 1].getContainer();       
		super.getElements[super.getLastIndex() - 2].setNext = null;       
		super.decrementIndex();       
		return temp;    
	}
}
