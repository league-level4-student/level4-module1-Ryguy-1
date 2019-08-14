package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] al;
	
	public ArrayList() {
		al = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		try {
			return al[loc];
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Out of Bounds!");
			throw e;
		}
		
	}
	
	public void add(T val) {
		
		T[] temp = (T[]) new Object[al.length+1];
		for (int i = 0; i < temp.length; i++) {
			if(i<al.length) {
				temp[i]=al[i];
			}else if(i==al.length) {
				temp[i]=val;
			}
		}
		al=temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T temp = null;
		T[] testArray = (T[]) new Object[al.length+1];
		for (int i = 0; i < testArray.length-1; i++) {
			testArray[i]=al[i];
		}
		try {
			for (int i = 0; i < testArray.length-1; i++) {
				if(i==loc) {
					System.out.println(al[i]);
					temp=testArray[i+1];
					testArray[i]=val;
				}else if(i>loc) {
					System.out.println(testArray[i]);
					testArray[i]=temp;
					temp=testArray[i+1];
				}
			}
			al=testArray;
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Insert index out of bounds. Use add method.");
			throw e;
		}
			
		}
		
		
	
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
		try {
			al[loc]=val;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
			throw e;
		}
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}