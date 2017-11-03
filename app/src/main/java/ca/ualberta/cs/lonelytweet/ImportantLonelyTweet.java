package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	/*fixed here, get rid of redundant if statement*/
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