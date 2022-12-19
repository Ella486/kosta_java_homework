package kosta.exam.model.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
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
		Map<String, Board> smalMap = allBoardList.get(kind);
		
		if(smalMap==null) {
			throw new InexistentException (kind + "������ �Խ����� �������� �ʽ��ϴ�..");
		}else if(smalMap.isEmpty()){
			throw new InexistentException (kind + "������ �Խù��� �����ϴ�..");
		}
		/*if(kind.equals("archive")) {
			return allBoardList.get(kind);
		}else if(kind.equals("photo")) {
			return allBoardList.get(kind);
		}else {
			throw new InexistentException ("�ش� �Խ��� ����.");
		}*/
		return smalMap;
	}

	@Override
	public Board getBoardByNo(String kind, int no) throws InexistentException {
		
		Map<String, Board> smalMap = this.getBoardByKind(kind);
		
		Board board = smalMap.get(String.valueOf(no)); //Integer.toString(no) , no+"" // int�� String���� �ٲܶ�
		
		if(board == null) {
			throw new InexistentException (kind + "������ �Խ��ǿ� " + no + "��ȣ �Խù��� �����ϴ�..");
		}
		return board;
		
		/*if(kind.equals("archive")) {
			return allBoardList.get(kind).get(no+"");
		}else if(kind.equals("photo")) {
			return allBoardList.get(kind).get(no+"");
		}else {
			throw new InexistentException ("�Խù��� ����.");
		}*/
	}

	@Override
	public void insertBoard(String kind, Board board) throws DuplicateException, InexistentException {
		//������� kind�� �ִ��� üũ!
		Map<String, Board> smalMap = this.getBoardByKind(kind);
		
		if(this.duplicateByNo(kind, board.getNo())) {
			throw new DuplicateException(kind + "������ �Խ����� " + board.getNo() + "��ȣ�� �ߺ��̸��� ����� �� �����ϴ�..");
		}
		smalMap.put(Integer.toString(board.getNo()), board);
		/*if(kind.equals("archive")|kind.equals("photo")) {
			if(duplicateByNo(kind, board.getNo())) {//�ߺ�
				throw new DuplicateException("�� �� �ߺ�!!");
			}else {//����
				allBoardList.get(kind).put(board.getNo()+"", board);
			}
		}else {
			throw new InexistentException("�������� �ʴ� �Խ���");
		}*/
	}

	
	public void propertiesFileStore() {
		Properties prop = new Properties();
		
		for (String key : allBoardList.keySet()) {
			//System.out.println(key+"Boad�� ��� �Խù� LIST**********************");
			Map<String, Board> kindMap = allBoardList.get(key);
			
			TreeMap treeMap= (TreeMap<String,Board>)kindMap; //ĳ�����ϰ� ����
			Iterator<String> it = treeMap.descendingKeySet().iterator(); //������������ �ϰ� ���� ��
			while(it.hasNext()) {
				String k = it.next();//key
				//System.out.println("key = " + k +"[ " + kindMap.get(k)  +" ] ");	
				prop.setProperty(key+k, k +"[ " + kindMap.get(k)  +" ] ");
			}
				//prop.setProperty("test111", "132");
			System.out.println();	
		}
		
	     try{
	          OutputStream stream = new FileOutputStream("src/kosta/exam/model/service/test.properties");
	          prop.store(stream,"====ALL===");
	          stream.close();
	          System.out.println("---------------------------------====");
	     } catch(IOException ex){
	           ex.printStackTrace();

	     }
	}
	
	
	@Override
	public boolean duplicateByNo(String kind, int no) {
		
		if(allBoardList.get(kind).get(String.valueOf(no)) == null) {
			return false;//�ߺ� �ƴ�.
		}else {
			return true;//�ߺ�
		}
	}

	@Override
	public void deleteBoard(String kind, int no) throws InexistentException {
		
		this.getBoardByNo(kind,no); //kind,no�� �ش��ϴ� ������ ã�´�.
		
		allBoardList.get(kind).remove(String.valueOf(no));
			/*if(kind.equals("archive")|kind.equals("photo")) {
				if(duplicateByNo(kind, no)) {
					allBoardList.get(kind).remove(no+"");
				}else {
					throw new InexistentException ("���� ���� �ʴ� �Խù�!!");
				}
			}else {
				throw new InexistentException ("���� ����!!");
			}*/
	}

	@Override
	public void updateBoard(Board board, String kind) throws InexistentException {
		Board b = this.getBoardByNo(kind,board.getNo());
		
		//kind�� Board�� ã�Ҵ�..-> �������� ����: ����, �ۼ���, ���� photo : imgNamearchive: fileName, fileSize
		if(board instanceof ArchiveBoard && b instanceof ArchiveBoard ) {
			ArchiveBoard castingB = (ArchiveBoard)b; //����Ǿ� �ִ� �Խù�
			ArchiveBoard castingBoard = (ArchiveBoard)board; //�����Ϸ��� �Խù��� ��
			
			castingB.setSubject(castingBoard.getSubject());
			castingB.setWriter(castingBoard.getWriter());
			castingB.setContent(castingBoard.getContent());
			
			castingB.setFileName(castingBoard.getFileName());
			castingB.setFileSize(castingBoard.getFileSize());
				
		}else if(board instanceof PhotoBoard && b instanceof PhotoBoard ){
			PhotoBoard castingB = (PhotoBoard)b; //����Ǿ� �ִ� �Խù�
			PhotoBoard castingBoard = (PhotoBoard)board; //�����Ϸ��� �Խù��� ��
			
			castingB.setSubject(castingBoard.getSubject());
			castingB.setWriter(castingBoard.getWriter());
			castingB.setContent(castingBoard.getContent());
			castingB.setImgName(castingBoard.getImgName());
			
			
		}else {
			throw new InexistentException ("�������� �ʾҽ��ϴ�. ==> Ÿ�Կ���");
		}
		
		
		/*if(kind.equals("archive")|kind.equals("photo")) {
			if(duplicateByNo(kind, board.getNo())) {
				if(kind.equals("archive") && board instanceof ArchiveBoard) {
					allBoardList.get(kind).replace(board.getNo()+"", board);
				}else if(kind.equals("photo") && board instanceof PhotoBoard) {
					allBoardList.get(kind).replace(board.getNo()+"", board);
				}else {
					//System.out.println(bd.getClass());
					throw new InexistentException ("�Խ��� Ÿ�� ����");
				}
			}else {
				throw new InexistentException ("���� �Խù�");
			}
		}else {
			throw new InexistentException ("�������� �ʴ� �Խ���");
		}*/
		
	}

	

}
