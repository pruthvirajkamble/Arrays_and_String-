import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

class CollectionMethod<E>{
	public static final int DEFAULT_CAPACITY = 10;
	int indx = 0;
	E[] arr;

	@SuppressWarnings("unchecked")
	CollectionMethod(){
		arr = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public CollectionMethod(int cap){
		if(cap<0)
			throw new NegativeArraySizeException("INVALID CAP "+ cap);
		arr = (E[]) new Object[cap];
	}
}