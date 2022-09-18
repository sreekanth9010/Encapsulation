package encapsulation;

class Books
{
	private int pgNo;
	
	
	
	public void setPgNo(int pgNo) {
		
		
		if(pgNo>0)
		{
			this.pgNo = pgNo;
		}
		else
		{
			System.out.println("Invalid page no");
		}
	}
	
	
	public int getPgNo() {
		return pgNo;
	}

	
	
	
}




public class BooksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book = new Books();
		book.setPgNo(999);
		System.out.println(book.getPgNo());
	}

}
