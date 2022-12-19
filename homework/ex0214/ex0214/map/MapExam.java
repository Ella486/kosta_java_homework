package ex0214.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam extends HashMap<Integer, String>{
//public class MapExam extends HashMap<Integer, String>{//key�� �����Ѵ�.
	public MapExam() {
		//map �߰�
		super.put(10, "������");
		super.put(40, "�̳���");
		super.put(20,"��ȿ��");
		super.put(30,"����");
		super.put(60,"�嵿��");
		super.put(50,"��ҿ�");
		
		super.put(30,"�����"); //������ ���� key�� ������ value�� �����Ѵ�.
		
		System.out.println("����� ����: " + super.size());
		System.out.println(this);
		
		System.out.println("===========Map�� ����� ���� ��ȸ===========");
		//Map�� �ִ� ��� key�� ������ �˻��Ѵ�.
		Set<Integer> set = super.keySet();
		//System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = super.get(key);
			
			System.out.println(key + " : " + value);
		}
		//
		System.out.println("---------���� Iterator�� ������ for������ ����----");
		for( Integer key: super.keySet()) {
			String value = super.get(key);
			
			System.out.println(key + " : " + value);
			
		}
		
		System.out.println("**********Map.Entry<K,V> ����ϱ�**********");
		Set<Map.Entry<Integer, String>> entryset = super.entrySet();
	
		Iterator<Map.Entry<Integer, String>> iter = entryset.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
		System.out.println("**********Map.Entry<K,V> ������ for������ ����**********");
		for( Map.Entry<Integer, String> me : super.entrySet()) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		new MapExam();
 
	}

}
