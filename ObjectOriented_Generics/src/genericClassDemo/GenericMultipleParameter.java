package genericClassDemo;

public class GenericMultipleParameter<K, V> {
	private K key;
	private V value;
	
	public GenericMultipleParameter(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getkey() {
		return key;
	}
	
	public V getvalue() {
		return value;
	}
	

}
