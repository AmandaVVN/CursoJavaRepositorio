package training.spring.restful.domain;

public class Greeting {

	private long id;
	private String content;
	
	public Greeting() {
		// TODO Auto-generated constructor stub
	}

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
}
