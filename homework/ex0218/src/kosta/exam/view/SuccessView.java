package kosta.exam.view;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import kosta.exam.model.dto.Board;

public class SuccessView {
	/**
	 * ��ü ���
	 */
	public static void printBoard(Map<String,Map<String,Board>> allMap) {
		for (String key : allMap.keySet()) {
			System.out.println(key+"Boad�� ��� �Խù� LIST**********************");
			Map<String, Board> kindMap = allMap.get(key);
			
			/*for(String k : kindMap.keySet()) {//�⺻�� �ø�����
				System.out.println("key = " + k +"[ " + kindMap.get(k).toString()+" ] ");
			}*/
			
			TreeMap treeMap= (TreeMap<String,Board>)kindMap; //ĳ�����ϰ� ����
			Iterator<String> it = treeMap.descendingKeySet().iterator(); //������������ �ϰ� ���� ��
			while(it.hasNext()) {
				String k = it.next();//key
				System.out.println("key = " + k +"[ " + kindMap.get(k)  +" ] ");	
			}
			
			System.out.println();	
		}
			
	}// printBoard �޼ҵ� ��
	
	/**
	 * �Խ��������� �ش��ϴ� �Խù� ���
	 */
	public static void printBoardByKind(String kind, Map<String,Board> kindMap) {
		System.out.println("----" + kind + "������ �Խù� List -----------");
		
		for (String key : kindMap.keySet()) {
			System.out.println(kindMap.get(key));
		}
		
		System.out.println();
	}
	
	/**
	 * �Խ����������� �۹�ȣ�� �ش��ϴ� �Խù� ����ϱ�
	 */
	public static void printBoardByNo(Board board) {
		System.out.println(board);

	}
	
	/**
	 * ���, ����, �����ΰ�쿡 �����޽��� ���
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
