package model;

public interface Client 
{
	public String name(String pName, String pLastName); // Client has a name and a last name
	public int age(int pAge); // Client has an age
	public int document(int pDocument); // Client has an ID
	public double score(double pScore); // Client has a Credit Score. ALWAYS
	public double incomes(double pIncomes); // Client must have an income
	public int yoe(int pYoE); // Years Of Experience
}
