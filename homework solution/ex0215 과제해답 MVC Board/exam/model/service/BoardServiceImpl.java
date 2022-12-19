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
	 * 게시판들의 초기데이터를 로딩!!!
	 * */
	private BoardServiceImpl() {
		
		Map<String, Board> archiveMap = new TreeMap<String, Board>();
		Map<String, Board> photoMap = new TreeMap<String, Board>();
		
		//1. ~.properties파일을 로딩한다. 
		ResourceBundle rb = ResourceBundle.getBundle("kosta\\exam/model/service/archiveInfo");		
		
		//2. 읽어온 value의 값을 (10,Java교안자료,이찬범,자바수업을 우한 자료,2017-03-27,java.ppt,200)을
		//   콤마를 기준으로 분리해서( value.split(",") ) Board객체를 생성한다. 
		for( String key : rb.keySet()) {
			 String value = rb.getString(key);
			 String v [] = value.split(",");
			 
			Board board = new ArchiveBoard(Integer.parseInt(v[0]), v[1], v[2], v[3], v[4], v[5], Integer.parseInt(v[6]) );
			
			//3. 생성된 Board를 kind종류에 해당하는 Map에 저장한다.  - ~.put(key, value)
			archiveMap.put(key, board);
		}
		
		//photo 게시판 
		rb = ResourceBundle.getBundle("kosta/exam/model/service/photoInfo");	
		for( String key : rb.keySet()) {
			 String value = rb.getString(key);
			 String v [] = value.split(",");
			 
			 Board board = new PhotoBoard(Integer.parseInt(v[0]), v[1], v[2], v[3], v[4], v[5]);
			 photoMap.put(key, board);
		}
		
		//allBoardList에 3번의 Map을 저장 - allBoardList.put(kind, Map)
		allBoardList.put("archive", archiveMap);
		allBoardList.put("photo", photoMap);
		
		//System.out.println(allBoardList);
	}//생성자끝
	
	/*
	 * public static void main(String[] args) { BoardServiceImpl.getInstance(); }
	 */
	
	public static BoardServiceImpl getInstance() {
		return instance;
	}

	@Override
	public Map<String, Map<String, Board>> getBoardList() throws InexistentException {
		if(allBoardList ==null || allBoardList.isEmpty()) {
			throw new InexistentException("저장된 게시물의 정보가 없습니다.");
		}
		return allBoardList;
	}
	

	// 게시판 유형에 따른 검색.
		@Override
		public Map<String, Board> getBoardByKind(String kind) throws InexistentException {
			Map<String, Board> smallMap = allBoardList.get(kind);
			
			if (smallMap == null) {
				throw new InexistentException(kind + "유형의 게시판은 존재하지 않습니다");
			}else if(smallMap.isEmpty()) {
				throw new InexistentException(kind+"유형에 게시물이 없습니다.");
			}
			
			return smallMap;
		}

		
		
		@Override
		public Board getBoardByNo(String kind, int no) throws InexistentException {
			//kind에 해당하는 Map을 먼저 찾는다.
			//Map<String ,Board> smallMap = allBoardList.get(kind);
			
			Map<String ,Board> smallMap = this.getBoardByKind(kind);
			
			Board board = smallMap.get( String.valueOf(no) );//Integer.toString(no)  , no+""
			
			 if(board==null){
				throw new InexistentException(kind + "유형의 게시판에 " + no + "번호 게시물은 없습니다.");
			}
			 return board;
		}
		
		

		@Override
		public void insertBoard(String kind, Board board) throws DuplicateException, InexistentException {
			//등록전에 kind가 있는지 체크!!
			Map<String ,Board> smallMap = this.getBoardByKind(kind);
			
			//smallMap안에 인수로 전달된 글번호가 중복인지를 체크한다.
			if (  this.duplicateByNo(kind, board.getNo())  ) {
				throw new DuplicateException(kind + "유형의 게시판의 " + board.getNo() + "번호는 중복이므로 등록할수 없습니다.");
			}
			
			smallMap.put(Integer.toString(board.getNo()) , board);
		}
		

		@Override
		public boolean duplicateByNo(String kind, int no) {
			//Map<String, Board> smallMap = allBoardList.get(kind);
			//Board board =smallMap.get(String.valueOf(no));
			
			if(allBoardList.get(kind).get(String.valueOf(no))  == null) {
				return false;//중복아니다.
			}else {
				return true;//중복이다.
			}
		}
		
		

		@Override
		public void deleteBoard(String kind, int no) throws InexistentException {
			this.getBoardByNo(kind, no); //kind, no에 해당하는 정보를 찾는다.
			allBoardList.get(kind).remove( String.valueOf(no) );
		
			/////////////////////////////////////////////////////
			/*Map<String, Board> smallMap = allBoardList.get(kind);
			if (smallMap == null) {
				throw new InexistentException(kind + "유형의 게시판 오류로  " + no + "번호 게시물 삭제되지 않았습니다.");
			}
			

			Board b = smallMap.remove( String.valueOf(no) ); //삭제가 성공하면 삭제된 value를 리턴해준다,
			if (b == null) {
				throw new InexistentException(kind + "게시판의 " + no + "번호 게시물 삭제되지 않았습니다.");
			}*/
		}
		
		
		
		

		@Override
		public void updateBoard(Board board, String kind) throws InexistentException {
			/*Map<String, Board> smallMap = allBoardList.get(kind);
			if (smallMap == null) {
				throw new InexistentException("수정되지 않았습니다. ==> (kind 잘못)");
			}

			
			int no = board.getNo(); //글번호가 smallMap안에 있는 key의 정보이다.
			Board b = smallMap.get( String.valueOf(no) );
			if (b == null) {
				throw new InexistentException("수정되지 않았습니다. ==> (no 잘못)");
			}*/
			
			
			
			 Board b = this.getBoardByNo(kind , board.getNo() );
			
			//kind에 Board를 찾았다..--> 수정하자  공통 : 제목, 작성자, 내용 photo : imgNamearchive : fileName, fileSize
			if (board instanceof ArchiveBoard && b instanceof ArchiveBoard) {
					ArchiveBoard castingB = (ArchiveBoard) b; //저장되어 있는 게시물
					ArchiveBoard castingBoard = (ArchiveBoard) board;//수정하려는 게시물의 정보

					castingB.setSubject(castingBoard.getSubject());
					castingB.setWriter(castingBoard.getWriter());
					castingB.setContent(castingBoard.getContent());
					
					castingB.setFileName(castingBoard.getFileName());
					castingB.setFileSize(castingBoard.getFileSize());
				
			} else if (board instanceof PhotoBoard && b instanceof PhotoBoard) {
					PhotoBoard castingB = (PhotoBoard) b;//저장되어 있는 게시물
					PhotoBoard castingBoard = (PhotoBoard) board;//수정하려는 게시물의 정보

					castingB.setSubject(castingBoard.getSubject());
					castingB.setWriter(castingBoard.getWriter());
					castingB.setContent(castingBoard.getContent());
					castingB.setImgName(castingBoard.getImgName());
				
			} else {
				throw new InexistentException("수정되지 않았습니다. ==> ( 타입 오류 ...혹시 내가 모르는 예외처리)");
			}
		}
}
