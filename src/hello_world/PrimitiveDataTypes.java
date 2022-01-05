package hello_world;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue =100;					//4 bytes   Stores whole numbers from -2,147,483,648 to 2,147,483,647
		short shortValue =20000;				//2 bytes	Stores whole numbers from -32,768 to 32,767
		long longValue = 406484588l;		//8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float floatValue = 20.5f;			//4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		byte byteValue =10;					//1 byte	Stores whole numbers from -128 to 127
		double doubleValue = 1505.55;			//8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean boolValue = false;		//1 bit		Stores true or false values
		char ch = 'B';				//2 bytes	Stores single character/letter or ASCII values

		
		if(boolValue == true) {
			System.out.println("Boolean is :" + boolValue);
		}else {
			System.out.println("Integer value is: " + intValue+"\n"+ "Short value is: " + shortValue+"\nLong value is: " + longValue+"\nFloat value is: " + floatValue+"\nByte value is: "+ byteValue+"\nDouble value is: " + doubleValue+"\nchar is: " + ch+"\nBoolean is :" + boolValue);
		}
	}
}
