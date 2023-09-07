package xxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {

		Train[] train = new Train[7];
		train[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		train[2] = new Train(118, "自強", "高雄", "台北", 500);
		train[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		train[4] = new Train(122, "自強", "台中", "花蓮", 600);
		train[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		train[6] = new Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("=====請寫一隻程式,能印出不重複的Train物件=====");
		Set<Train> set = new HashSet<Train>();

		for (int i = 0; i < train.length; i++)
			set.add(train[i]);

		System.out.println("=====for-each=====");

		for (Train xx : set)
			xx.getTrain();

		System.out.println("=====Iterator=====");

		Iterator<Train> objs = set.iterator();

		while (objs.hasNext())
			((Train) objs.next()).getTrain();

		System.out.println("=====請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出=====");

		List<Train> list = new ArrayList<>();

		for (int i = 0; i < train.length; i++)
			list.add(train[i]);

		Collections.sort(list);

		System.out.println("=====for迴圈======");
		for (int i = 0; i < list.size(); i++)
			list.get(i).getTrain();

		System.out.println("=====for-each=====");
		for (Train xx : list)
			xx.getTrain();

		System.out.println("=====Iterator=====");
		Iterator<Train> objl = list.iterator();
		while (objl.hasNext())
			((Train) objl.next()).getTrain();

		System.out.println("=====班次編號由大排到小印出, 還可以不重複印出Train物件=====");

		Set<Train> set2 = new TreeSet();
		for (int i = 0; i < train.length; i++)
			set2.add(train[i]);

		Iterator<Train> objts = set2.iterator();
		System.out.println("=====for-each=====");
		for (Train xx : set2)
			xx.getTrain();

		System.out.println("=====Iterator=====");
		while (objts.hasNext())
			((Train) objts.next()).getTrain();

	}
}
