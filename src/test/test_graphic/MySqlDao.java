package test.test_graphic;

public class MySqlDao implements DataAccessObject {

	public void select() {
		System.out.println("MySql DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 검색");
	}

//	private void select_M() {
//		System.out.println("MySql DB에서 검색");
//	}
//	private void insert_M() {
//		System.out.println("MySql DB에 삽입");
//	}
//	private void update_M() {
//		System.out.println("MySql DB를 수정");
//	}
//	private void delete_M() {
//		System.out.println("MySql DB에서 검색");
//	}
//	@Override
//	public void select() {
//		this.select_M();
//		
//	}
//
//	@Override
//	public void insert() {
//		this.insert_M();
//	}
//
//	@Override
//	public void update() {
//		this.update_M();
//	}
//
//	@Override
//	public void delete() {
//		this.delete_M();
//	}

}
