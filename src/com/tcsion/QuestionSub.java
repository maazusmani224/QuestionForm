package com.tcsion;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
@Table(name="questions", schema="public")
public class QuestionSub {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Question_Id")
	private int id;
	
	@Column(name="Author_Name")
	private String authname;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Question_Type")
	private String questype;
	
	@Column(name="Question_Difficulty")
	private String quesdiff;
	
	@Column(name="Question_Text")
	private String ques;
	
	@Column(name="Option_a")
	private String opta;
	
	@Column(name="Option_b")
	private String optb;
	
	@Column(name="Option_c")
	private String optc;
	
	@Column(name="Option_d")
	private String optd;
	
	@Column(name="Correct_Answer")
	private String corrans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthname() {
		return authname;
	}

	public void setAuthname(String authname) {
		this.authname = authname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuestype() {
		return questype;
	}

	public void setQuestype(String questype) {
		this.questype = questype;
	}

	public String getQuesdiff() {
		return quesdiff;
	}

	public void setQuesdiff(String quesdiff) {
		this.quesdiff = quesdiff;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getOpta() {
		return opta;
	}

	public void setOpta(String opta) {
		this.opta = opta;
	}

	public String getOptb() {
		return optb;
	}

	public void setOptb(String optb) {
		this.optb = optb;
	}

	public String getOptc() {
		return optc;
	}

	public void setOptc(String optc) {
		this.optc = optc;
	}

	public String getOptd() {
		return optd;
	}

	public void setOptd(String optd) {
		this.optd = optd;
	}

	public String getCorrans() {
		return corrans;
	}

	public void setCorrans(String corrans) {
		this.corrans = corrans;
	}
	
}
