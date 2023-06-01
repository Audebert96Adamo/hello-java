package main.phone;

public class OnePlus5 implements Phone{
	/*
	public String processor() {
		return "SD835";
		}
    */
	@Override
	public String processor() {
		return "SD835";
	}

	@Override
	public String OS() {
		return "Android";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

	
}
