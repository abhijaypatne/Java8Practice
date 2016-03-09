import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("test");
		list.add("testa");
		list.add("testb");
		list.add("testc");
		
		//list.stream().forEach(string -> {System.out.println(string);})
		
		list.stream().forEach((string) -> {
            System.out.println("For Content: " + string);
        });
	
		forEachDemo();
	}
	
	// source for this method: mkyong
	static void forEachDemo (){
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
			
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
			
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);
		
		//Steam and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
	}

}
