package model;

public class BasicClient implements Client
{
	private String name, lastname;
	private int age, document, yoe;
	private double score, income;

	@Override
	public String name(String pName, String pLastName) 
	{
		// TODO Auto-generated method stub
		return name+" "+lastname;
	}

	@Override
	public int age(int pAge) 
	{
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public int document(int pDocument) 
	{
		// TODO Auto-generated method stub
		return document;
	}

	@Override
	public double score(double pScore) 
	{
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public double incomes(double pIncomes) 
	{
		// TODO Auto-generated method stub
		return income;
	}

	@Override
	public int yoe(int pYoE) 
	{
		// TODO Auto-generated method stub
		return yoe;
	}

}
