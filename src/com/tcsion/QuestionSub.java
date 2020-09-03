package com.tcsion;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
@Table(name="Questions", schema="public")
public class QuestionSub {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Question_Id")
	private int Question_Id;
	
	@Column(name="Author_Name", length=250)
	private String Author_Name;
	
	@Column(name="Email", length=250)
	private String Email;
	
	@Column(name="Question_Type",length=100)
	private String Question_Type;
	
	@Column(name="Question_Difficulty",length=20)
	private String Question_Difficulty;
	
	@Column(name="Question_Text",length=10000)
	private String Question_Text;
	
	@Column(name="Option_a",length=5000)
	private String Option_a;
	
	@Column(name="Option_b",length=5000)
	private String Option_b;
	
	@Column(name="Option_c",length=5000)
	private String Option_c;
	
	@Column(name="Option_d",length=5000)
	private String Option_d;
	
	@Column(name="Correct_Answer",length=10)
	private String Correct_Answer;

	public int getQuestion_Id() {
		return Question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		Question_Id = question_Id;
	}

	public String getAuthor_Name() {
		return Author_Name;
	}

	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getQuestion_Type() {
		return Question_Type;
	}

	public void setQuestion_Type(String question_Type) {
		Question_Type = question_Type;
	}

	public String getQuestion_Difficulty() {
		return Question_Difficulty;
	}

	public void setQuestion_Difficulty(String question_Difficulty) {
		Question_Difficulty = question_Difficulty;
	}

	public String getQuestion_Text() {
		return Question_Text;
	}

	public void setQuestion_Text(String question_Text) {
		Question_Text = question_Text;
	}

	public String getOption_a() {
		return Option_a;
	}

	public void setOption_a(String option_a) {
		Option_a = option_a;
	}

	public String getOption_b() {
		return Option_b;
	}

	public void setOption_b(String option_b) {
		Option_b = option_b;
	}

	public String getOption_c() {
		return Option_c;
	}

	public void setOption_c(String option_c) {
		Option_c = option_c;
	}

	public String getOption_d() {
		return Option_d;
	}

	public void setOption_d(String option_d) {
		Option_d = option_d;
	}

	public String getCorrect_Answer() {
		return Correct_Answer;
	}

	public void setCorrect_Answer(String correct_Answer) {
		Correct_Answer = correct_Answer;
	}
	
}
