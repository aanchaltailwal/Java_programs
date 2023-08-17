
public class Practiceset_3 {
		public static void main(String[]args) {
			String story = new String("GAME OF THROWNS");
			System.out.println(story);
//1st question
		   story = story.toLowerCase();
		   System.out.println(story);
//2nd question
		   story = story.replace(' ', '_');
		   System.out.println(story);
//3rd question
		   String letter = " Dear <|name|> , Thanks a lot";
		   letter = letter.replace("<|name|>","Aanchal");
		   System.out.println(letter);
//4th question
		   String mystring = "this string contains   double and triple spaces";
		   System.out.println(mystring.indexOf("  "));
		   System.out.println(mystring.indexOf("   "));
//5th question   
		   String letter2 = "Dear Aanchal,\n\tThis cousre is nice,\n\t Thanks!";
		   System.out.println(letter2);
		}

	}

