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
	
	Map<String, Map<String, Board>> allBoardList=new TreeMap<String, Map<String,Board>>();
	/**
	 * 게시판들의 초기데이터를 로딩
	 * */
	private BoardServiceImpl() {
		
		Map<String, Board> archiveMap = new TreeMap<String, Board>();
		Map<String, Board> photoMap = new TreeMap<String, Board>();
		
		//1. ~.properties 파일을 로딩한다.
		ResourceBundle rb = ResourceBundle.getBundle("kosta/exam/model/service/archiveInfo");
		
		//2. 읽어온 value의  값을 (10,Java교안자료,이찬범,자바수업을 우한 자료,2017-03-27,java.ppt,200)을
		//콤마를 기준으로 분리해서(value.split(",") ) Board객체를 생성한다.
		for(String key :rb.keySet()) {
			String value = rb.getString(key);
			String v[] = value.split(",");
			Board board = new ArchiveBoard(Integer.parseInt(v[0]),v[1],v[2],v[3],v[4],v[5],Integer.parseInt(v[6]));
		
			//3. 생성된 Board를 kind종류에 해당하는 Map에 저장한다. - ~.put(key, value)
			archiveMap.put(key, board);
		}
		
		
		
		//photo 게시판
		 rb = ResourceBundle.getBundle("kosta/exam/model/service/photoInfo");
		 for(String key :rb.keySet()) {
				String value = rb.getString(key);
				String v[] = value.split(",");
				Board board = new PhotoBoard(Integer.parseInt(v[0]),v[1],v[2],v[3],v[4],v[5]);
				photoMap.put(key, board);
			}
		
		//allBoardList에 3번의 Map을 저장 - allBoardList.put(kind, Map)
		 allBoardList.put("archive", archiveMap);
		 allBoardList.put("photo", photoMap);
		 
		 System.out.println(allBoardList);
		
	}//생성자 끝
	/**public static void main(String[] args) {
		BoardServiceImpl.getinsatance();
	}*/
	
	
	public static BoardServiceImpl getinsatance() {
		return instance;
	}
	
	

	@Override
	public Map<String, Map<String, Board>> getBoardList() throws InexistentException{
		if(allBoardList == null || allBoardList.isEmpty()) {
			throw new InexistentException ("저장된 게시물의 정보가 존재하지 않습니다.");
		}
		
		return allBoardList;
	}

	@Override
	public Map<String, Board> getBoardByKind(String kind) throws InexistentException {
		if(kind.equals("archive")) {
			return allBoardList.get(kind);
		}else if(kind.equals("photo")) {
			return allBoardList.get(kind);
		}else {
			throw new InexistentException ("해당 게시판 없음.");
		}
	}

	@Override
	public Board getBoardByNo(String kind, int no) throws InexistentException {
		if(kind.equals("archive")) {
			return allBoardList.get(kind).get(no+"");
		}else if(kind.equals("photo")) {
			return allBoardList.get(kind).get(no+"");
		}else {
			throw new InexistentException ("게시물이 없음.");
		}
	}

	@Override
	public void insertBoard(String kind, Board bd) throws DuplicateException, InexistentException {
		//System.out.println(duplicateByNo("archive", 10));
		if(kind.equals("archive")|kind.equals("photo")) {
			if(duplicateByNo(kind, bd.getNo())) {//중복
				throw new DuplicateException("너 글 중복!!");
			}else {//저장
				allBoardList.get(kind).put(bd.getNo()+"", bd);
			}
		}else {
			throw new InexistentException("존재하지 않는 게시판");
		}
	}

	private void propertiesFileStore(String kind, Board bd) {
		
	}
	
	@Override
	public boolean duplicateByNo(String kind, int no) {
		Board board = new Board();
		board = allBoardList.get(kind).get(no+"");
		if(board == null) {
			return false;//중복 아님.
		}else {
			return true;//중복
		}
	}

	@Override
	public void deleteBoard(String kind, int no) throws InexistentException {
			if(kind.equals("archive")|kind.equals("photo")) {
				if(duplicateByNo(kind, no)) {
					allBoardList.get(kind).remove(no+"");
				}else {
					throw new InexistentException ("존재 하지 않는 게시물!!");
				}
			}else {
				throw new InexistentException ("삭제 실패!!");
			}
	}

	@Override
	public void updateBoard(Board bd, String kind) throws InexistentException {
		if(kind.equals("archive")|kind.equals("photo")) {
			if(duplicateByNo(kind, bd.getNo())) {
				if(kind.equals("archive") && bd instanceof ArchiveBoard) {
					allBoardList.get(kind).replace(bd.getNo()+"", bd);
				}else if(kind.equals("photo") && bd instanceof PhotoBoard) {
					allBoardList.get(kind).replace(bd.getNo()+"", bd);
				}else {
					//System.out.println(bd.getClass());
					throw new InexistentException ("게시판 타입 오류");
				}
			}else {
				throw new InexistentException ("없는 게시물");
			}
		}else {
			throw new InexistentException ("존재하지 않는 게시판");
		}
		
	}

	

}
