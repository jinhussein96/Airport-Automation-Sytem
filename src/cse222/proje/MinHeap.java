import java.util.ArrayList;

public class MinHeap<E extends Comparable<E>> {

	private ArrayList<E> heap;
	
	public MinHeap() {
		heap = new ArrayList<E>();
	}
	
	public void insert(E data) {
		heap.add(data);
		
		int child = heap.size() - 1;
		int parent = (child - 1) / 2;
		
		while(parent >= 0 && heap.get(parent).compareTo(heap.get(child)) > 0) {
			swap(child,parent);
			child = parent;
			parent = (child - 1) / 2;
		}
	}
	
	public E remove() {
		E remove = heap.get(0);
		heap.set(0, heap.remove(heap.size()-1));
		
		int parent = 0;
		int rightChild;
		int leftChild;
		int minChild;
		boolean loop = true;
		
		while(loop) {
			leftChild = (2 * parent) + 1;
			rightChild = leftChild + 1;
			
			if(leftChild >= heap.size()) break;
			
			minChild = leftChild;
			
			if(rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(leftChild)) < 0) {
				minChild = rightChild;
			}
			
			if(heap.get(parent).compareTo(heap.get(minChild)) > 0) {
				swap(parent, minChild);
				parent = minChild;
			}
			else break;
		}
		
		return remove;
		
	}
	
	private void swap(int a, int b) {
		E temp = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b, temp);
	}
	
	public String toString() {
		String str = new String();
		
		for(int i = 0 ; i < heap.size() ; i++) {
			str += heap.get(i).toString() + "\n";
		}
		
		return str;
	}
	
	public Iterator<E> iterator() {
		return heap.iterator();
	}
}
