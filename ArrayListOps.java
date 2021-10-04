import java.util.ArrayList;

public class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> intArr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			intArr.add(0);
		}
		return intArr;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		ArrayList<Integer> revArr = new ArrayList<>();
		for (int i = list.size()-1; i >= 0 ; i--) {
			revArr.add(list.get(i));
		}
		return revArr;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		ArrayList<Integer> chArr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int el = list.get(i);
			//System.out.println("n = "+n);
			el = el==m?n:el;
			chArr.add(el);
		}
		return chArr;
	}


	public static void main(String[] args) {
		ArrayListOps alo = new ArrayListOps();
		System.out.println(alo.makeArrayListInt(6));
		ArrayList<Integer> intArr = new ArrayList<>();
		int n = 10;
		int[] arr = {10,25,35,12,22};
		for (int i = 0; i < arr.length; i++) {
			intArr.add(arr[i]);
		}
		System.out.println(intArr);
		System.out.println(alo.reverseList(intArr));
		System.out.println(alo.changeList(intArr, 35, 88));
	}

}