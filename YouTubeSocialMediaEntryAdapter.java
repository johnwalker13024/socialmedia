package socialmedia;

/**
 * adapter that lets the YouTubeVideo class fit in the SocialMediaEntry adapter
 */
class YouTubeSocialMediaEntryAdapter implements SocialMediaEntry {

	private YouTubeVideo ytv;

	YouTubeSocialMediaEntryAdapter(YouTubeVideo _ytv) {
		ytv = _ytv;
	}

	@Override
	public String getUser() {
		return ytv.getAuthor();
	}

	@Override
    public String getPostText() {
    	return ytv.getTitle() + " - " + ytv.getDescription();
    }
}
