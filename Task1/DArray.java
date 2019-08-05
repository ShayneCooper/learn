import java.util.Arrays;

class DArray<T>{
    // 实现一个支持动态扩容的数组，支持增删改操作
	public DArray(){}
	Object[] arrays=new Object[1];
	int count = 0;//当前数组里有多少item

	
	//扩容2n+1
	public void resize(int length) {
        Object[] newarrays=new Object[length];
		for (int i = 0; i < count; i++) {
            newarrays[i]=arrays[i];
        }
		arrays=newarrays;
	}
	
	//增
	public boolean add(T element) {
		if (arrays.length<count+1) {
			resize(arrays.length*2+1);
		}
		arrays[count]=element;
		count++;
		return true;
	}
	
	//删
	public boolean remove(int local) {
		T removeItem = (T) arrays[local];
		for (int i = local; i < arrays.length-1; i++) {
			arrays[i]=arrays[i+1];
		}
		count--;
		return true;
	}
	
	//改
	public boolean set(int local , T element) {
		arrays[local]=element;
		return true;
	}
	
	//查
	public T get(int local) {
		if (local<arrays.length) {
			return (T)arrays[local];
		}else {
			return null;
		}
	}
	
	public String toString() {
		return Arrays.toString(arrays);
	}
    
	public static void main(String[] args) {
		DArray<String> arrayList=new DArray<String>();
		//实现一个支持动态扩容的数组
		arrayList.add("1");
		arrayList.add("24");
        arrayList.add("5");
        arrayList.add("78");
        System.out.println(arrayList.toString());
        arrayList.remove(3);
        System.out.println(arrayList.toString());
        arrayList.add("9");
        System.out.println(arrayList.get(2));
        arrayList.set(2,"22222");
        System.out.println(arrayList.get(2));
        arrayList.add("33");
        arrayList.add("31");
        System.out.println(arrayList.toString());
	}
}