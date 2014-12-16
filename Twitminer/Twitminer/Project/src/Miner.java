import java.io.*;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Miner {
	
	public static void main(String args[])throws IOException,ClassNotFoundException
	{
		MaxentTagger tagger = new MaxentTagger("taggers/wsj-0-18-left3words-distsim.tagger");
		String str;
		String tagged;
		String category;
		PrimitiveClassifier pc;
		Prototype pt;
		UpdateInfo ui;
		
		str = "sachin is playing cricket, he is good in it";
		tagged = tagger.tagString(str);		
		pc = new PrimitiveClassifier(tagged);
		pt = new Prototype(tagged);
		
		category = pt.PatternMatch();
		ui = new UpdateInfo(tagged,category);
		
		if (category.equalsIgnoreCase("sports")) {
			
			System.out.println("Tweet is Sports in Nature");
			ui.Update();			
		}
		
		else if(category.equalsIgnoreCase("politics")) {
			
			System.out.println("Tweet is Political in Nature");
			ui.Update();			
		}
		
		else if (category.equalsIgnoreCase("undetermined")) {
			
			category = pc.BayesianClassifier();
			ui = new UpdateInfo(tagged,category);
			
			if (category.equalsIgnoreCase("sports")) {
				
				System.out.println("Tweet is Sports in Nature");
				ui.Update(); 
				
			} else {
				
				System.out.println("Tweet is Political in Nature");
			}
		}
	}
}


