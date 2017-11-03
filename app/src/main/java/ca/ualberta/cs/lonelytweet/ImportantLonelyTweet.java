package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	/*
	5. fix Control flow issue in ImportantLonelyTweet class
	reason: the if statement is redundant in isValid method,
	so the change simplify the if statement.
	*/
	@Override
	public boolean isValid() {
		/*if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}*/

		return tweetBody.trim().length()>0 || tweetBody.trim().length()<=20;
	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}