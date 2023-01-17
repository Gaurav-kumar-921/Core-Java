package com.javaRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {

		Pattern pattern1 = Pattern.compile(".r"); // the given regular expression compiled into a pattern.

		Matcher matcher1 = pattern1.matcher("gr"); // it returns a new matcher for this pattern and inside the argument
													// pass the character sequence to be matched.

		boolean result = matcher1.matches(); // it returns true if and only if the entire region sequence matches this matcher's pattern.

		System.out.println(result);

		// Another way to do the same things

		boolean result2 = Pattern.compile(".v").matcher("av").matches();
		System.out.println(result2);

		// Another way to do the same things

		boolean result3 = Pattern.matches("..c", "abc"); // jitne dot hoge characters se pehele utne hi characters add
															// kr payege.
		System.out.println(result3);

		// Only for Single Character

// [abc] ka mtlb agr tino me se koi ek bhi character present hoga to true vrna false but character sequence length 1 hi honi chahiye.

		System.out.println("[abc] matches a = " + Pattern.matches("[abc]", "a"));
		System.out.println("[abc] matches b = " + Pattern.matches("[abc]", "b"));
		System.out.println("[abc] matches c = " + Pattern.matches("[abc]", "c"));
		System.out.println("[abc] matches z = " + Pattern.matches("[abc]", "z"));
		System.out.println("[abc] matches aa = " + Pattern.matches("[abc]", "aa"));
		System.out.println("[abc] matches abc = " + Pattern.matches("[abc]", "abc"));

// [^abc] ka mtlb agr tino me se koi ek bhi character present nhi hoga to true vrna false but character sequence length 1 hi honi chahiye.

		System.out.println("[^abc] matches a = " + Pattern.matches("[^abc]", "a"));
		System.out.println("[^abc] matches b = " + Pattern.matches("[^abc]", "b"));
		System.out.println("[^abc] matches c = " + Pattern.matches("[^abc]", "c"));
		System.out.println("[^abc] matches z = " + Pattern.matches("[^abc]", "z"));
		System.out.println("[^abc] matches zz = " + Pattern.matches("[^abc]", "zz"));
		System.out.println("[^abc] matches zzz = " + Pattern.matches("[^abc]", "zzz"));

// agr humari string ka character a-z or A-Z ke bich ka koi bhi character hoga to true return hoga vrna false but character sequence length 1 hi honi chahiye.

		System.out.println("[a-zA-Z] matches A = " + Pattern.matches("[a-zA-Z]", "A"));
		System.out.println("[a-zA-Z] matches d = " + Pattern.matches("[a-zA-Z]", "d"));
		System.out.println("[a-zA-Z] matches ddZY = " + Pattern.matches("[a-zA-Z]", "ddZY"));
		System.out.println("[a-zA-Z] matches 1 = " + Pattern.matches("[a-zA-Z]", "1"));

// agr humari string ka character a-d or m-p ke bich ka koi bhi character hoga to true return hoga vrna false but character sequence length 1 hi honi chahiye.		
		System.out.println("[a-d[m-p]] matches a = " + Pattern.matches("[a-d[m-p]]", "a"));
		System.out.println("[a-d[m-p]] matches n = " + Pattern.matches("[a-d[m-p]]", "n"));
		System.out.println("[a-d[m-p]] matches e = " + Pattern.matches("[a-d[m-p]]", "e"));
		System.out.println("[a-d[m-p]] matches A = " + Pattern.matches("[a-d[m-p]]", "A"));
		System.out.println("[a-d[m-p]] matches am = " + Pattern.matches("[a-d[m-p]]", "am"));

		// [a-z&&[def]] = d, e, or f (intersection) mtlb d,e,f me se koi ek hona chahiye

		System.out.println("[a-z&&[def]] matches d = " + Pattern.matches("[a-z&&[def]]", "d"));
		System.out.println("[a-z&&[def]] matches e = " + Pattern.matches("[a-z&&[def]]", "e"));
		System.out.println("[a-z&&[def]] matches f = " + Pattern.matches("[a-z&&[def]]", "f"));
		System.out.println("[a-z&&[def]] matches z = " + Pattern.matches("[a-z&&[def]]", "z"));
		System.out.println("[a-z&&[def]] matches def = " + Pattern.matches("[a-z&&[def]]", "def"));

		// [a-z&&[^bc]] = a through z, except for b and c (Substraction)

		System.out.println("[a-z&&[^bc]] matches h = " + Pattern.matches("[a-z&&[^bc]]", "h"));
		System.out.println("[a-z&&[^bc]] matches c = " + Pattern.matches("[a-z&&[^bc]]", "c"));
		System.out.println("[a-z&&[^bc]] matches hh = " + Pattern.matches("[a-z&&[^bc]]", "hh"));

		// [a-z&&[^m-p]] = a through z, and not m through p (Substraction)

		System.out.println("[a-z&&[^m-p]] matches b = " + Pattern.matches("[a-z&&[^m-p]]", "b"));
		System.out.println("[a-z&&[^m-p]] matches o = " + Pattern.matches("[a-z&&[^m-p]]", "o"));
		System.out.println("[a-z&&[^m-p]] matches bb = " + Pattern.matches("[a-z&&[^m-p]]", "bb"));

		// for Multiple values

		// X? quantifier = X occurs once or not at all means ya to ek baar aayega ya ek baar bhi nhi.

		System.out.println(Pattern.matches("[ab]?", "a"));// true (a or b comes one time)
		System.out.println(Pattern.matches("[ab]?", "b"));// true (a or b comes one time)
		System.out.println(Pattern.matches("[ab]?", ""));// true (occurs once or not at all)
		System.out.println(Pattern.matches("[ab]?", "ab"));// false (a and b comes one time)
		System.out.println(Pattern.matches("[ab]?", "aaa"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[ab]?", "aabbb"));// false (a and b comes more than one time)

		// X+ quantifier = X occurs once or more times means ya to ek baar ya ek se jada baar aa skta hai.

		System.out.println(Pattern.matches("[ab]+", "a"));// true (a or b once or more times)
		System.out.println(Pattern.matches("[ab]+", "aaa"));// true (a comes more than one time)
		System.out.println(Pattern.matches("[ab]+", "aabb"));// true (a and b comes more than once)
		System.out.println(Pattern.matches("[ab]+", "aazzb"));// false (z is not matching pattern)

		// X* quantifier = X occurs zero or more times means ya ek bhi baar nhi aayega ya to ek ya ek se jaada baar aa skta hai.

		System.out.println(Pattern.matches("[ab]*", ""));// true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "a"));// true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "aaa"));// true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "aaabbb"));// true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "aaabbbx"));// false (x is not matching pattern)

		// X{n} = X occurs n times only

		System.out.println(Pattern.matches("a{3}", "aaa"));// true (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "aaaaaa"));// false (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "aa"));// false (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "a"));// false (a should come 3 times)
		System.out.println(Pattern.matches("a{3}", "bbb"));// false (a should come 3 times)

		// X{n,} = X occurs n or more times

		System.out.println(Pattern.matches("a{3,}", "aaa"));// true (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "aaaaaa"));// true (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "aa"));// false (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "a"));// false (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "bbb"));// false (a can come 3 times or more)

		// X{y,z} = X occurs at least y times but less than or equal to z times means ( y <= X <= z )

		System.out.println(Pattern.matches("a{3,6}", "aaa"));// true (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "aaaaaa"));// true (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "aaaaaaaaaaa"));// false (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "aa"));// false (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "a"));// false (a can come 3 times or <= 6 times)
		System.out.println(Pattern.matches("a{3,6}", "bbb"));// false (a can come 3 times or <= 6 times)

		// \d = Any digits, short of [0-9]

		System.out.println(Pattern.matches("\\d", "9"));// true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "dfg"));// false (non-digit)
		System.out.println(Pattern.matches("\\d", "8888"));// false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "555abc"));// false (digit and char)

		System.out.println("----------------------------------");

		System.out.println("metacharacters d with quantifier....");
		System.out.println(Pattern.matches("\\d*", "56565"));// true (digit may come 0 or more times)

		// \D = Any non-digit, short for [^0-9]

		System.out.println(Pattern.matches("\\D", "m"));// true (non-digit and comes once)
		System.out.println(Pattern.matches("\\D", "xds"));// false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "1"));// false (digit)
		System.out.println(Pattern.matches("\\D", "8989"));// false (digit)
		System.out.println(Pattern.matches("\\D", "121abc"));// false (digit and char)

		System.out.println("----------------------------------");

		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "peter"));// true (non-digit and may come 0 or more times)

		// . = Any character (may or may not match terminator)

		System.out.println(Pattern.matches(".", "m"));// true [char and comes once]
		System.out.println(Pattern.matches(".", "8"));// true [char and comes once]
		System.out.println(Pattern.matches(".", "99"));// false [char but comes more than once]
		System.out.println(Pattern.matches(".", "uiui"));// false [char but comes more than once]

		// \s = Any whitespace character should come only one time, short for [\t\n\x0B\f\r]

		System.out.println(Pattern.matches("\\s", " "));// true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "\t"));// true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "\n"));// true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "\f"));// true [Only one whitespace can come]
		System.out.println(Pattern.matches("\\s", "     "));// false [Only one whitespace can come, but more
															// whitespaces]
		System.out.println(Pattern.matches("\\s", "\t\t"));// false [Only one whitespace can come, but more whitespaces]
		System.out.println(Pattern.matches("\\s", "ab"));// false [not a whitespace]

		System.out.println("----------------------------------");

		System.out.println("metacharacters s with quantifier....");
		System.out.println(Pattern.matches("\\s*", "       "));// true [more than one whitespace can come]
		System.out.println(Pattern.matches("\\s*", "\r\r"));// true [more than one whitespace can come]

		// \S = Any non-whitespace character Should come only one time, short for [^\s]

		System.out.println(Pattern.matches("\\S", "a"));// true
		System.out.println(Pattern.matches("\\S", "ab"));// false
		System.out.println(Pattern.matches("\\S", " "));// false
		System.out.println(Pattern.matches("\\S", "\t"));// false
		System.out.println(Pattern.matches("\\S", "\n"));// false
		System.out.println(Pattern.matches("\\S", "\f"));// false

		System.out.println("----------------------------------");

		System.out.println("metacharacters S with quantifier....");
		System.out.println(Pattern.matches("\\S*", "peter"));// true

		// \w = Any word character, short for [a-zA-Z_0-9]

		System.out.println(Pattern.matches("\\w", "a"));// true
		System.out.println(Pattern.matches("\\w", "9"));// true
		System.out.println(Pattern.matches("\\w", "_"));// true
		System.out.println(Pattern.matches("\\w", "a9"));// false

		System.out.println("----------------------------------");

		System.out.println("metacharacters w with quantifier....");
		System.out.println(Pattern.matches("\\w*", "peter_99"));// true
		System.out.println(Pattern.matches("\\w*", "peter_99@"));// false

		// \W = Any non-word character, short for [^\w]

		System.out.println(Pattern.matches("\\W", "@"));// true
		System.out.println(Pattern.matches("\\W", "a"));// false
		System.out.println(Pattern.matches("\\W", "9"));// false
		System.out.println(Pattern.matches("\\W", "@@"));// false

		System.out.println("----------------------------------");

		System.out.println("metacharacters W with quantifier....");
		System.out.println(Pattern.matches("\\W*", "@@"));// true
		System.out.println(Pattern.matches("\\W*", "@@peter"));// false

		// Create a regular expression that accepts alpha numeric characters only. Its
		// length must be 4 characters long only.

		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Juli"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Ju22"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Peter"));// false (more than 4 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "J$22"));// false ($ is not matched)

		// Write a program to find a word in a string (How to use Regex finder to find a word)

		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter regex pattern:");
				String regexPattern = sc.nextLine();
				Pattern pattern = Pattern.compile(regexPattern);
				Matcher matcher = pattern.matcher("Welcome to india peter");
				boolean found = false;
				while (matcher.find()) {
					System.out.println("I found the text " + matcher.group() + " starting at index " + matcher.start()
							+ " and ending at index " + matcher.end());
					found = true;
				}
				if (!found) {
					System.out.println("No match found.");
				}
			}
		}

		// ^regex -> finds regex that must match at the beginning of the line.
		// regex$ -> finds regex that must match at the end of the line.
		//  X|Z  -> finds X or Z.
	}

}
