package proj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.*;
public class Main {
	public static void main(String args[]) {
		
			String html_str="<li>\r\n" + 
					"   <div class=\"left\">\r\n" + 
					"      <div class=\"item-post-read\">\r\n" + 
					"         <div class=\"item-post\" >05 Mar 2018</div>\r\n" + 
					"      </div>\r\n" + 
					"      <div class=\"item-comments\">\r\n" + 
					"         <a class=\"item-comments\" href=\"/msauniversity/events/academic-events/msa-maze-challenge-ignite-your-mind-and-motivation#itemCommentsAnchor\">  0 comment										</a>\r\n" + 
					"      </div>\r\n" + 
					"   </div>\r\n" + 
					"   <!--end left-->\r\n" + 
					"   <div class=\"right\">\r\n" + 
					"      <a href=\"/msauniversity/events/academic-events/msa-maze-challenge-ignite-your-mind-and-motivation\" >MSA Maze Challenge - Ignite your mind &amp; motivation</a>\r\n" + 
					"      <div class=\"item-desc\">\r\n" + 
					"         <p>\r\n" + 
					"            <span style=\"color:#F67A3E; font-weight:bold;\">On 15<sup>th</sup> March 2018 in Roman Theatre - From 9:00am - 3:00pm\r\n" + 
					"</span><br />\r\n" + 
					"            &nbsp;\r\n" + 
					"         </p>\r\n" + 
					"         <p style=\"font-size: 16px;\"> In this competition the team of contestants design and build small robot to solve a maze in the shortest possible time ...       </p>\r\n" + 
					"      </div>\r\n" + 
					"   </div>\r\n" + 
					"   <!--end right-->\r\n" + 
					"</li>\r\n" + 
					"<li>\r\n" + 
					"   <div class=\"left\">\r\n" + 
					"      <div class=\"item-post-read\">\r\n" + 
					"         <div class=\"item-post\" >20 Feb 2018</div>\r\n" + 
					"      </div>\r\n" + 
					"      <div class=\"item-comments\">\r\n" + 
					"         <a class=\"item-comments\" href=\"/msauniversity/events/academic-events/borsa-step-by-step-3rd-round#itemCommentsAnchor\"> 0 comment										</a>\r\n" + 
					"      </div>\r\n" + 
					"   </div>\r\n" + 
					"   <!--end left-->\r\n" + 
					"   <div class=\"right\">\r\n" + 
					"      <a href=\"/msauniversity/events/academic-events/borsa-step-by-step-3rd-round\" >Stock Exchange Step By Step  –The Third Round</a>\r\n" + 
					"      <div class=\"item-desc\">\r\n" + 
					"         <p>\r\n" + 
					"            <span style=\"color:#F67A3E; font-weight:bold;\">On 26<sup>th</sup> &amp; 27<sup>th</sup> February 2018 in SSB @ (11:00 am - 2:00 pm).\r\n" + 
					"</span><br />\r\n" + 
					"            &nbsp;\r\n" + 
					"         </p>\r\n" + 
					"         <p style=\"font-size: 16px;\"> The Faculty of Management Sciences in MSA University organizes in collaboration with the Egyptian Stock Exchange ...         </p>\r\n" + 
					"      </div>\r\n" + 
					"   </div>\r\n" + 
					"   <!--end right-->\r\n" + 
					"</li>"  ; 
		
				
			regexChecker("((?<=href=\")(.*\\n?)(?=\")|(?<=\\>)(.*\\n?)(?=(\\<)|(\\.)))",html_str);
		}
	public static String yes() {
	String html_str="";
	try {
		FileInputStream fs=new FileInputStream("maha.txt");
		int c;
		while((c=fs.read())!=-1) {
			html_str +=(char)c;
		}
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	return html_str;
		
	}
			public static void regexChecker(String regularExp, String stringCheck)
			{
				
			Pattern checkRegex=Pattern.compile(regularExp);
			Matcher regexMatcher=checkRegex.matcher(stringCheck);
			
			while(regexMatcher.find())
			{
			if(regexMatcher.group().length()!=0)
			{
				
				System.out.print(regexMatcher.group().trim());
				System.out.print(" ");
			}
			
			System.out.print("\n");		
			}		
		}
}
