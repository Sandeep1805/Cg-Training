package Q2;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class News{
	private int newsId; 
	private String postedByUser, commentByUser, comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
}

public class DisplayNews {
	public static void main(String[] args) {
		List<News> news= Arrays.asList(
				new News(114, "TV9", "Anirudh", "Cases are now less, the record for this year is " ),
				new News(118, "NTV", "DharmaKrishna", "Kohli  wins record 7th title or, record has officially been declared"),
				new News(122, "TV5", "Juanid","School and Colleges to reopen shortly, all offices also to open"),
				new News(126, "BBC", "Narasimha", "India wins by 7 wickets, this is a new record, the record would help India grow in cricketworld"),
				new News(132, "DD", "Siddharth", "No team is comprising! Looks likes new record is going to be made!")
				);
		System.out.println("The newsId which has received maximum comments.");
		System.out.println(news.stream()
	    .collect(Collectors.groupingBy(n->n.getNewsId(),Collectors.counting())));
	    
		System.out.println("Times the word 'record' arrived in user comments all news");
		long Count = news.stream()
		.filter(n-> n.getComment().contains("record")).count();
		System.out.println(Count);
		System.out.println("User has posted maximum comments.");
		news.stream()
	    .collect(Collectors.groupingBy(n->n.getPostedByUser(),Collectors.counting()))
	    .entrySet()
	    .stream()
	    .max(Comparator.comparing(Entry::getValue))
	    .ifPresent(System.out::println);
		System.out.println("CommentByUser wise number of comments.");
		news.stream()
		.collect(Collectors.groupingBy(s -> s.getCommentByUser(), Collectors.counting()))
	    .entrySet()
	    .stream().forEach(p->System.out.println(p));
	}
	

}
