package day5;

abstract class RBI {
	abstract int rateOfInterest();

}

class SBI extends RBI
{
	int rateOfInterest()
	{
		return 2;
	}
}

class HDFC extends RBI
{
	int rateOfInterest() {
		
		return 4;
	}
}
