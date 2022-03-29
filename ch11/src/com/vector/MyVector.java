package com.vector;

public class MyVector {
	Object[] objArr;// 객체배열
	int size; //크기 - 저장된 객체의 개수
	
	MyVector(int capacity){
		if(capacity<0)
			throw new IllegalArgumentException("유효하지 않은 값입니다.");
		objArr = new Object[capacity];
	}
	
	MyVector() {
		this(10); //MyVector(10);
	}
	
	int size() {return size;}
	int capacity() {return objArr.length;}
	boolean isEmpty() {return size ==0;}
	
	void clear() {
		for(int i=0; i<objArr.length; i++)
			objArr[i] = null;
	}
	
	Object get(int index) {
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		}
		
		return objArr[index];
	}
	
	int indexOf(Object obj) {
		for(int i=0; i<size; i++)
			if(objArr[i].equals(obj))
				return i;
		
		return -1;
	}
	
	
	void setCapacity(int capacity) {
		Object[] tmp = new Object[capacity];
		System.arraycopy(objArr, 0, tmp, 0, Math.min(size, capacity));
		
		objArr = tmp; // objArr이 새로운 배열을 가리키도록 한다.
	
	}
	
	void ensureCapacity(int minCapacity) {
		if(minCapacity >objArr.length)
			setCapacity(minCapacity);
		
		//지정된 minCapacity용량이 현재 objArr의 용량보다 작을때만
		//호출해서 용량 늘립니다.
	}
	
	Object remove(int index) {
		if(index<0||index>size-1)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		
		Object oldObj = objArr[index];
		
		if(index!=size-1)	
			System.arraycopy(objArr, index+1, objArr, index, size-1-index);
		
		objArr[--size]=null;
		
		return oldObj;
	}
	
	boolean add(Object obj) {
		ensureCapacity(size+1);
		objArr[size] = obj;
		size++;
		
		return true;
	}
	
	public String toString() {
		String tmp = "[";
		for(int i=0; i<size; i++) 
			tmp += objArr[i]+", ";
			
			return tmp + "]";
		
	}
	
	
	
	
	
	
	
	
	
}
