
class StartUp3 {
	public static void main(String[] args){
	

		Account obj = null;

		try{

			obj = new Account("��؈�Y",100000);

			System.out.println("<<�����\��>>");
			obj.print();

			//�@�w����z�̈����o��
			obj.withdraw(1000000);
		} catch (LimitException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("���ʕ\��");
			obj.print();
		}

	}
}



