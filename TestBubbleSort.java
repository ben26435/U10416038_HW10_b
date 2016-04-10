import java.util.*;
//U10416038 Ma Chia-Liang
public class TestBubbleSort{
	//main method
	public static void main(String[] args){
		//Create ArrayList
		ArrayList<Integer> List = new ArrayList<>();
		//Create scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integers you want to bubblesort.(-1)to stop scanner");
		//input int to ArrayList if int is not -1
		int i = scanner.nextInt();
		while(i!=-1){
			List.add(i);
			i=scanner.nextInt();
		}
		//Constructor
		BubbleSort BS = new BubbleSort(List);
	}
}