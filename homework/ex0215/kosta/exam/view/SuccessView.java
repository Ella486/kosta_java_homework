package kosta.exam.view;

import java.util.Map;

import kosta.exam.model.dto.Board;

public class SuccessView {
	/**
	 * 전체 출력
	 */
	public static void printBoard(Map<String,Map<String,Board>> allMap) {
		for (String key : allMap.keySet()) {
			System.out.println(key+"Boad의 모든 게시물 LIST**********************");
			Map<String, Board> kindMap = allMap.get(key);
			for(String k : kindMap.keySet()) {
				System.out.println("key = " + k +"[ " + kindMap.get(k)  +" ] ");
			}
			
			System.out.println();	
		}
			
	}// printBoard 메소드 끝
	
	/**
	 * 게시판유형에 해당하는 게시물 출력
	 */
	public static void printBoardByKind(String kind, Map<String,Board> kindMap) {
		System.out.println("----" + kind + "유형의 게시물 List -----------");
		
		for (String key : kindMap.keySet()) {
			System.out.println(kindMap.get(key));
		}
		
		System.out.println();
	}
	
	/**
	 * 게시판유형에서 글번호에 해당하는 게시물 출력하기
	 */
	public static void printBoardByNo(Board board) {
		System.out.println(board);

	}
	
	/**
	 * 등록, 수정, 삭제인경우에 성공메시지 출력
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
