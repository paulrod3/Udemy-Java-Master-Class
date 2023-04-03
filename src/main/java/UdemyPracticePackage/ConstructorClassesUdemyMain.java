package UdemyPracticePackage;

public class ConstructorClassesUdemyMain {

    public static void main(String[] args) {

//        AccountConstructorClassUdemy bobsAccount = new AccountConstructorClassUdemy("12345", 500.00,
//                "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        AccountConstructorClassUdemy bobsAccount = new AccountConstructorClassUdemy();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        AccountConstructorClassUdemy paulsAccount = new AccountConstructorClassUdemy("Paul" ,
                "paul.email.com" , "12345");
        System.out.println("AccountNo: " + paulsAccount.getNumber() + "; name " + paulsAccount.getCustomerName());
    }
}
