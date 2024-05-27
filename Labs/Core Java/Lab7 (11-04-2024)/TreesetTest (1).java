//Write a program using TreeSet insert Integer values and print them.

import java.util.TreeSet;
public class TreesetTest {

	public static void main(String[] args) {
		TreeSet <Integer>ts2=new TreeSet<Integer>();

		 ts2.add(24);
		 ts2.add(66);
		 ts2.add(12);
		 ts2.add(45);
		 ts2.add(15);
		 System.out.println("TreeSet Elements=>"+ts2);
		 System.out.println("Lowest value=>"+ts2.pollFirst());
		 System.out.println("hightest value=>"+ts2.pollLast());
		 System.out.println("clone=>"+ts2.clone());
	
	}

}

/* OUTPUT
 * TreeSet Elements=>[12, 15, 24, 45, 66]
Lowest value=>12
hightest value=>66
clone=>[15, 24, 45]
*/
 