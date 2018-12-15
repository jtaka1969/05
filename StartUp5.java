
class StartUp3 {
	public static void main(String[] args){
	

		Account obj = null;

		try{

			obj = new Account("鈴木一郎",100000);

			System.out.println("<<初期表示>>");
			obj.print();

			//　指定金額の引き出し
			obj.withdraw(1000000);
		} catch (LimitException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("結果表示");
			obj.print();
		}

	}
}



