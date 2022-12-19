package kosta.eaxm.controller;

import java.util.Map;

import kosta.exam.model.dto.Board;
import kosta.exam.model.service.BoardService;
import kosta.exam.model.service.BoardServiceImpl;
import kosta.exam.model.util.DuplicateException;
import kosta.exam.model.util.InexistentException;
import kosta.exam.view.FailView;
import kosta.exam.view.SuccessView;

public class BoardController {
	
	private static BoardService boardService = BoardServiceImpl.getinsatance();

	/**
	 * ��ü�˻�
	 * */
	
	public static void getAllBoard() {
		//���� ȣ��!! �װ���� �޾Ƽ� ����信�� ���
		try {
			Map<String, Map<String, Board>> allBoardList = boardService.getBoardList();
			SuccessView.printBoard(allBoardList);
		}catch(InexistentException e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void getBoardByKind(String kind) {
		try {
			Map<String, Board> smalMap = boardService.getBoardByKind(kind);
			SuccessView.printBoardByKind(kind, smalMap);
			
		}catch(InexistentException e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void getBoardByNo(String kind, int no) {
		try {
			Board board = boardService.getBoardByNo(kind,no);
			SuccessView.printBoardByNo(board);
			
		}catch(InexistentException e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void insertBoard(String kind, Board board) {
		try {
			boardService.insertBoard(kind, board);
			SuccessView.printMessage("����� �Ϸ�Ǿ����ϴ�.");
			
		}catch(InexistentException | DuplicateException e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void deleteBoard(String kind, int no) {
		try {
			boardService.deleteBoard(kind,no);
		
			SuccessView.printMessage(kind + "�Խ�����" + no + "��ȣ�� �����Ǿ����ϴ�.");
		}catch(InexistentException e){
			FailView.errorMessage(e.getMessage());
		}
		
	}
	
	public static void updateBoard(Board board, String kind) {
		try {
			boardService.updateBoard(board,kind);
			SuccessView.printMessage("������ �Ϸ�Ǿ����ϴ�.");
			
		}catch(InexistentException e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void saveProperties() {
		boardService.propertiesFileStore();
		SuccessView.printMessage("������ �Ϸ�Ǿ����ϴ�.");
	}
	
	
	
}
