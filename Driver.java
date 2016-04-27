import java.util.Random;


public class Driver 
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = new int[10];
		Driver.fillArrayWithRandomInts(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
		Driver.BubbleSort(arrayOfNumbers);
	}
	
	//Homework
	static void sortArray(int[] ar)
	{
		for(int i = 0; i < 101; i++)
		{
			int curr = 0;
			while(curr < ar.length)
			{
				if(ar[curr] == i)
				{
				System.out.print(ar[curr] + " ");
				}
				curr = curr + 1;	
			}		
		}
	}
	
	static void BubbleSort(int[] ar)
	{

			
			for(int i = ar.length - 1; i > 0; i = i - 1)
			{
				for (int j = 1; j <= i; j++)
			      {
			         if (ar[j-1] > ar[j])
			         {
			              int curr = ar[j-1];
			              ar[j-1] = ar[j];
			              ar[j] = curr;
			         }
			      }
			
			}
			Driver.printIntArray(ar);
		}
	
	
	static void fillArrayWithRandomInts(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(101);
		}
	}
	
	static void printIntArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	static String charArrayToString(char[] ar)
	{
		String answer = "";
		for(int i = 0; i < ar.length; i++)
		{
			answer += ar[i];
		}
		return answer;
	}
	
	static String intArrayToString(int[] ar)
	{
		String answer = "";
		for(int i = 0; i < ar.length; i++)
		{
			answer += ar[i];
		}
		return answer;
	}
	
	static char[] stringToCharArray(String s)
	{
		char[] ar = new char[s.length()];
		for(int i = 0; i < s.length(); i++)
		{
			ar[i] = s.charAt(i);
		}
		return ar;
	}
	
	static String substring(String s, int beginPos, int endPos)
	{
		String answer = "";
		for(int i = beginPos; i < endPos; i++)
		{
			answer += s.charAt(i);
		}
		return answer;
	}
	
	static String substring(String s, int pos)
	{
		String answer = "";
		for(int i = pos; i < s.length(); i++)
		{
			answer += s.charAt(i);
			//answer = answer + s.charAt(i)
		}
		return answer;
	}
	
	static char int2Char(int num)
	{
		String map = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return map.charAt(num);
	}
	
	static String decimalToBase(int dec, int radix)
	{
		String answer = "";
		while(dec != 0)
		{
			answer =  Driver.int2Char(dec % radix) + answer;
			dec /= radix;
		}
		return answer;
	}
	
	static String reverse(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			answer += s.charAt(i);
		}
		return answer;
	}
	
	static int baseToInteger(String s, int radix)
	{
		int place = 1;
		int total = 0;
		char currChar;
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			currChar = s.charAt(i);
			total += (Driver.charToInt(currChar) * place);
			place *= radix;
		}
		return total;
	}
	
	static int hexToInteger(String hex)
	{
		int place = 1;
		int total = 0;
		char currChar;
		
		for(int i = hex.length()-1; i >= 0; i--)
		{
			currChar = hex.charAt(i);
			total += (Driver.charToInt(currChar) * place);
			place *= 16;
		}
		return total;
	}
	
	static int octalToInteger(String oct)
	{
		int place = 1;
		int total = 0;
		char currChar;
		
		for(int i = oct.length()-1; i >= 0; i--)
		{
			currChar = oct.charAt(i);
			total += (Driver.charToInt(currChar) * place);
			place *= 8;
		}
		return total;
	}
	
	//this guy should take a String representation of a binary number
	//as a parameter and return as a int the decimal equivalent
	//"1011" -> 11
	static int binaryToInteger(String bin)
	{
		int place = 1;
		int total = 0;
		char currChar;
		for(int i = bin.length()-1; i >= 0; i--)
		{
			currChar = bin.charAt(i);
			if(currChar == '1')
			{
				total += place;
			}
			place *= 2;
		}
		return total;
	}
	
	//return the integer version of the char parameter
	static int charToInt(char c)
	{
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c);
	}
	
	//Converts s, which is a string representation
	//of an int into an int representation
	//"124" -> 124
	static int stringToInt(String s)
	{
		int place = 1;
		int total = 0;
		char currChar;
		for(int i = s.length()-1; i >= 0; i--)
		{
			currChar = s.charAt(i);
			if(currChar == '-')
			{
				return total * -1;
			}
			else
			{
				total += (Driver.charToInt(currChar) * place);
				place *= 10;
			}
		}
		return total;
	}
	
	static String removeChars(String s, String charsToRemove)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i++)
		{
			//should we keep the current character
			if(charsToRemove.indexOf(s.charAt(i)) == -1)
			{
				answer = answer + s.charAt(i);
			}
		}
		return answer;
	}
	
	//returns a new String with all of the vowels
	//removed form the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		return Driver.removeChars(s, "aeiouAEIOU");
	}
	
	//returns a new String with all of the consonants
	//removed form the parameter String
	//"hello" -> eo
	static String removeConsonants(String s)
	{
		return Driver.removeChars(s, "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ");
	}
		
	//returns a new String with all of the numbers
	//removed form the parameter String
	//"he11o" -> heo
	static String removeDigits(String s)
	{
		return Driver.removeChars(s, "0123456789");
	}
		
	//return the first occurence in s where c is found or -1 if 
	//it was not found - we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static String reverseString(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
}