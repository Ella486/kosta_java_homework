package kosta.exam.model.service;

import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

import kosta.exam.model.dto.ArchiveBoard;
import kosta.exam.model.dto.Board;
import kosta.exam.model.dto.PhotoBoard;
import kosta.exam.model.util.DuplicateException;
import kosta.exam.model.util.InexistentException;

public class BoardServiceImpl implements BoardService {
	private static BoardServiceImpl instance = new BoardServiceImpl(); 
	
	Map<String, Map<String, Board>> allBoardList = new TreeMap<String, Map<String,Board>>();
	
	/**
	 * �Խ��ǵ��� �ʱⵥ���͸� �ε�!!!
	 * */
	private BoardServiceImpl() {
		
		Map<String, Board> archiveMap = new TreeMap<String, Board>();
		Map<String, Board> photoMap = new TreeMap<String, Board>();
		
		//1. ~.properties������ �ε��Ѵ�. 
		ResourceBundle rb = ResourceBundle.getBundle("kosta\\exam/model/service/archiveInfo");		
		
		//2. �о�� value�� ���� (10,Java�����ڷ�,������,�ڹټ����� ���� �ڷ�,2017-03-27,java.ppt,200)��
		//   �޸��� �������� �и��ؼ�( value.split(",") ) Board��ü�� �����Ѵ�. 
		for( String key : rb.keySet()) {
			 String value = rb.getString(key);
			 String v [] = value.split(",");
			 
			Board board = new ArchiveBoard(Integer.parseInt(v[0]), v[1], v[2], v[3], v[4], v[5], Integer.parseInt(v[6]) );
			
			//3. ������ Board�� kind������ �ش��ϴ� Map�� �����Ѵ�.  - ~.put(key, value)
			archiveMap.put(key, board);
		}
		
		//photo �Խ��� 
		rb = ResourceBundle.getBundle("kosta/exam/model/service/photoInfo");	
		for( String key : rb.keySet()) {
			 String value = rb.getString(key);
			 String v [] = value.split(",");
			 
			 Board board = new PhotoBoard(Integer.parseInt(v[0]), v[1], v[2], v[3], v[4], v[5]);
			 photoMap.put(key, board);
		}
		
		//allBoardList�� 3���� Map�� ���� - allBoardList.put(kind, Map)
		allBoardList.put("archive", archiveMap);
		allBoardList.put("photo", photoMap);
		
		//System.out.println(allBoardList);
	}//�����ڳ�
	
	/*
	 * public static void main(String[] args) { BoardServiceImpl.getInstance(); }
	 */
	
	public static BoardServiceImpl getInstance() {
		return instance;
	}

	@Override
	public Map<String, Map<String, Board>> getBoardList() throws InexistentException {
		if(allBoardList ==null || allBoardList.isEmpty()) {
			throw new InexistentException("����� �Խù��� ������ �����ϴ�.");
		}
		return allBoardList;
	}
	

	// �Խ��� ������ ���� �˻�.
		@Override
		public Map<String, Board> getBoardByKind(String kind) throws InexistentException {
			Map<String, Board> smallMap = allBoardList.get(kind);
			
			if (smallMap == null) {
				throw new InexistentException(kind + "������ �Խ����� �������� �ʽ��ϴ�");
			}else if(smallMap.isEmpty()) {
				throw new InexistentException(kind+"������ �Խù��� �����ϴ�.");
			}
			
			return smallMap;
		}

		
		
		@Override
		public Board getBoardByNo(String kind, int no) throws InexistentException {
			//kind�� �ش��ϴ� Map�� ���� ã�´�.
			//Map<String ,Board> smallMap = allBoardList.get(kind);
			
			Map<String ,Board> smallMap = this.getBoardByKind(kind);
			
			Board board = smallMap.get( String.valueOf(no) );//Integer.toString(no)  , no+""
			
			 if(board==null){
				throw new InexistentException(kind + "������ �Խ��ǿ� " + no + "��ȣ �Խù��� �����ϴ�.");
			}
			 return board;
		}
		
		

		@Override
		public void insertBoard(String kind, Board board) throws DuplicateException, InexistentException {
			//������� kind�� �ִ��� üũ!!
			Map<String ,Board> smallMap = this.getBoardByKind(kind);
			
			//smallMap�ȿ� �μ��� ���޵� �۹�ȣ�� �ߺ������� üũ�Ѵ�.
			if (  this.duplicateByNo(kind, board.getNo())  ) {
				throw new DuplicateException(kind + "������ �Խ����� " + board.getNo() + "��ȣ�� �ߺ��̹Ƿ� ����Ҽ� �����ϴ�.");
			}
			
			smallMap.put(Integer.toString(board.getNo()) , board);
		}
		

		@Override
		public boolean duplicateByNo(String kind, int no) {
			//Map<String, Board> smallMap = allBoardList.get(kind);
			//Board board =smallMap.get(String.valueOf(no));
			
			if(allBoardList.get(kind).get(String.valueOf(no))  == null) {
				return false;//�ߺ��ƴϴ�.
			}else {
				return true;//�ߺ��̴�.
			}
		}
		
		

		@Override
		public void deleteBoard(String kind, int no) throws InexistentException {
			this.getBoardByNo(kind, no); //kind, no�� �ش��ϴ� ������ ã�´�.
			allBoardList.get(kind).remove( String.valueOf(no) );
		
			/////////////////////////////////////////////////////
			/*Map<String, Board> smallMap = allBoardList.get(kind);
			if (smallMap == null) {
				throw new InexistentException(kind + "������ �Խ��� ������  " + no + "��ȣ �Խù� �������� �ʾҽ��ϴ�.");
			}
			

			Board b = smallMap.remove( String.valueOf(no) ); //������ �����ϸ� ������ value�� �������ش�,
			if (b == null) {
				throw new InexistentException(kind + "�Խ����� " + no + "��ȣ �Խù� �������� �ʾҽ��ϴ�.");
			}*/
		}
		
		
		
		

		@Override
		public void updateBoard(Board board, String kind) throws InexistentException {
			/*Map<String, Board> smallMap = allBoardList.get(kind);
			if (smallMap == null) {
				throw new InexistentException("�������� �ʾҽ��ϴ�. ==> (kind �߸�)");
			}

			
			int no = board.getNo(); //�۹�ȣ�� smallMap�ȿ� �ִ� key�� �����̴�.
			Board b = smallMap.get( String.valueOf(no) );
			if (b == null) {
				throw new InexistentException("�������� �ʾҽ��ϴ�. ==> (no �߸�)");
			}*/
			
			
			
			 Board b = this.getBoardByNo(kind , board.getNo() );
			
			//kind�� Board�� ã�Ҵ�..--> ��������  ���� : ����, �ۼ���, ���� photo : imgNamearchive : fileName, fileSize
			if (board instanceof ArchiveBoard && b instanceof ArchiveBoard) {
					ArchiveBoard castingB = (ArchiveBoard) b; //����Ǿ� �ִ� �Խù�
					ArchiveBoard castingBoard = (ArchiveBoard) board;//�����Ϸ��� �Խù��� ����

					castingB.setSubject(castingBoard.getSubject());
					castingB.setWriter(castingBoard.getWriter());
					castingB.setContent(castingBoard.getContent());
					
					castingB.setFileName(castingBoard.getFileName());
					castingB.setFileSize(castingBoard.getFileSize());
				
			} else if (board instanceof PhotoBoard && b instanceof PhotoBoard) {
					PhotoBoard castingB = (PhotoBoard) b;//����Ǿ� �ִ� �Խù�
					PhotoBoard castingBoard = (PhotoBoard) board;//�����Ϸ��� �Խù��� ����

					castingB.setSubject(castingBoard.getSubject());
					castingB.setWriter(castingBoard.getWriter());
					castingB.setContent(castingBoard.getContent());
					castingB.setImgName(castingBoard.getImgName());
				
			} else {
				throw new InexistentException("�������� �ʾҽ��ϴ�. ==> ( Ÿ�� ���� ...Ȥ�� ���� �𸣴� ����ó��)");
			}
		}
}
