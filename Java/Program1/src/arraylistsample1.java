import java.util.ArrayList;
public class arraylistsample1 {

	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<String>();
		states.add("Tamil Nadu");
		states.add("Kerala");
	    states.add("Karnataka");
	    states.add("Maharashtra");
	    System.out.println(states);
	    states.set(3, "Jammu and Kashmir");	
		System.out.print("After set, the results are \n");
		System.out.println(states);
	}

}
