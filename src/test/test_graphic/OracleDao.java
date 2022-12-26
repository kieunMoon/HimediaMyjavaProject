package test.test_graphic;

public class OracleDao implements DataAccessObject {

//	private void select_D() {
//		System.out.println("Oracel DB에서 검색");
//	}
//
//	private void insert_D() {
//		System.out.println("Oracel DB에 삽입");
//	}
//
//	private void update_D() {
//		System.out.println("Oracel DB를 수정");
//	}
//
//	private void delete_D() {
//		System.out.println("Oracel DB에서 검색");
//	}

	@Override
	public void select() {
		System.out.println("Oracel DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracel DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracel DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Oracel DB에서 삭제");

	}

}
