import java.util.*;
import java.time.*;

public class FBFeed{
	private ArrayList <FBPost> post;
	private int count = 0;
	
	public FBFeed(ArrayList <FBPost> post){
		setPosts(post);
	}
	
	public void setPosts(ArrayList <FBPost> post){
		this.post = new ArrayList<>();
		count++;
		for(FBPost l :post){
			this.post.add(l);
		}
	}
	
	public ArrayList <FBPost> getPosts(){
		ArrayList<FBPost> aux = new ArrayList<>();
		for(FBPost l :this.post){
			aux.add(l);
		}
		return aux;
	}
	public int nrPost(String user){
		return(int) this.post.stream()
							 .filter(n -> n.name() == user)
							 .count();
	}
}
		
		
