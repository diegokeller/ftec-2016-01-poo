package aula14.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainPerformanceListas {

	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();
		
		List<String> valores = new LinkedList<String>();
//		List<String> valores = new ArrayList<String>();
		for (int i = 0; i < 1000000; i++) {
			valores.add(System.currentTimeMillis() + " - "
					+ (Math.random() * 10000));
			if(i >= 10000){
				valores.remove(0);
			}
		}

		long fim = System.currentTimeMillis();
		
		System.out.println(fim - inicio);
		
		Object[] valoresArray = valores.toArray();
	}

}
