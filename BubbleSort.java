import java.util.*;
//U10416038 Ma Chia-Liang
class BubbleSort{
	//datafield
	ArrayList<Integer> List = new ArrayList<>();
	//Constructor
	BubbleSort(ArrayList List){
		this.List = List;
		Sort(List);
		show(List);
	}
	//method to order the ArrayList
	void Sort(ArrayList List){
		for(int i = 0; i<List.size()-1;++i){
			for(int j=0;j<List.size()-1;++j){
				if((int)(List.get(j))>(int)(List.get(j+1))){
					int hold = (int)(List.get(j));
					List.set(j,(int)(List.get(j+1)));
					List.set(j+1,hold);
				}
			}
		}
	}
	//method to show the result
	void show(ArrayList List){
		System.out.println("Bubble sort:");
		for(int i = 0;i<=List.size()-1;++i){
				int a =(int)(List.get(i));
				System.out.printf("%d\n",a);
			}	
	}

}