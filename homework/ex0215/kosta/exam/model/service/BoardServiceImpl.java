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
	 * �Խ��ǵ��� �ʱⵥ���͸� �ε�
	 * */
	private BoardServiceImpl() {
		
		Map<String, Board> archiveMap = new TreeMap<String, Board>();
		Map<String, Board> photoMap = new TreeMap<String, Board>();
		
		//1. ~.properties ������ �ε��Ѵ�.
		ResourceBundle rb = ResourceBundle.getBundle("kosta/exam/model/service/archiveInfo");
		
		//2. �о�� value��  ���� (10,Java�����ڷ�,������,�ڹټ����� ���� �ڷ�,2017-03-27,java.ppt,200)��
		//�޸��� �������� �и��ؼ�(value.split(",") ) Board��ü�� �����Ѵ�.
		for(String key :rb.keySet()) {
			String value = rb.getString(key);
			String v[] = value.split(",");
			Board board = new ArchiveBoard(Integer.parseInt(v[0]),v[1],v[2],v[3],v[4],v[5],Integer.parseInt(v[6]));
		
			//3. ������ Board�� kind������ �ش��ϴ� Map�� �����Ѵ�. - ~.put(key, value)
			archiveMap.put(key, board);
		}
		
		
		
		//photo �Խ���
		 rb = ResourceBundle.getBundle("kosta/exam/model/service/photoInfo");
		 for(String key :rb.keySet()) {
				String value = rb.getString(key);
				String v[] = value.split(",");
				Board board = new PhotoBoard(Integer.parseInt(v[0]),v[1],v[2],v[3],v[4],v[5]);
				photoMap.put(key, board);
			}
		
		//allBoardList�� 3���� Map�� ���� - allBoardList.put(kind, Map)
		 allBoardList.put("archive", archiveMap);
		 allBoardList.put("photo", photoMap);
		 
		 System.out.println(allBoardList);
		
	}//������ ��
	/**public static void main(String[] args) {
		BoardServiceImpl.getinsatance();
	}*/
	
	
	public static BoardServiceImpl getinsatance() {
		return instance;
	}
	
	

	@Override
	public Map<String, Map<String, Board>> getBoardList() throws InexistentException{
		if(allBoardList == null || allBoardList.isEmpty()) {
			throw new InexistentException ("����� �Խù��� ������ �������� �ʽ��ϴ�.");
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
			throw new InexistentException ("�ش� �Խ��� ����.");
		}
	}

	@Override
	public Board getBoardByNo(String kind, int no) throws InexistentException {
		if(kind.equals("archive")) {
			return allBoardList.get(kind).get(no+"");
		}else if(kind.equals("photo")) {
			return allBoardList.get(kind).get(no+"");
		}else {
			throw new InexistentException ("�Խù��� ����.");
		}
	}

	@Override
	public void insertBoard(String kind, Board bd) throws DuplicateException, InexistentException {
		//System.out.println(duplicateByNo("archive", 10));
		if(kind.equals("archive")|kind.equals("photo")) {
			if(duplicateByNo(kind, bd.getNo())) {//�ߺ�
				throw new DuplicateException("�� �� �ߺ�!!");
			}else {//����
				allBoardList.get(kind).put(bd.getNo()+"", bd);
			}
		}else {
			throw new InexistentException("�������� �ʴ� �Խ���");
		}
	}

	private void propertiesFileStore(String kind, Board bd) {
		
	}
	
	@Override
	public boolean duplicateByNo(String kind, int no) {
		Board board = new Board();
		board = allBoardList.get(kind).get(no+"");
		if(board == null) {
			return false;//�ߺ� �ƴ�.
		}else {
			return true;//�ߺ�
		}
	}

	@Override
	public void deleteBoard(String kind, int no) throws InexistentException {
			if(kind.equals("archive")|kind.equals("photo")) {
				if(duplicateByNo(kind, no)) {
					allBoardList.get(kind).remove(no+"");
				}else {
					throw new InexistentException ("���� ���� �ʴ� �Խù�!!");
				}
			}else {
				throw new InexistentException ("���� ����!!");
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
					throw new InexistentException ("�Խ��� Ÿ�� ����");
				}
			}else {
				throw new InexistentException ("���� �Խù�");
			}
		}else {
			throw new InexistentException ("�������� �ʴ� �Խ���");
		}
		
	}

	

}
