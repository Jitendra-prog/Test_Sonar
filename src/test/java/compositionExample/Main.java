package compositionExample;

class Account  {
    private String bank_name;
    private long Account_number;
	private long Account_number1;

    // initialize bank name and account number
    Account(String bank_name, long Account_number)   {
        this.bank_name = bank_name;
        this.Account_number = Account_number;
    }
    //read bank name
    public String getBankName() {
        return this.bank_name;
    }
    //read account number
    public long getAccountNumber() {
        return this.Account_number;
    }
}
// employee class
class Employee
{
    private String emp_name;

    // initialize employee name
    Employee(String emp_name)
    {
        this.emp_name = emp_name;
    }
    //read employee name
    public String getEmployeeName()
    {
        return this.emp_name;
    }
}
// Associate both the classes
class Main
{

    Account acc = new Account("Citi Bank", 13319);
    public static void main (String[] args)
    {
        Employee emp = new Employee("Andrew");
        Account acc = new Account("Citi Bank", 13319);

        System.out.println(emp.getEmployeeName() +
                " has an account with " + acc.getBankName() + " with Account Number:"
                + acc.getAccountNumber());
    }
}