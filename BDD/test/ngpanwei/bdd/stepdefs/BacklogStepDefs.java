package ngpanwei.bdd.stepdefs;

import java.util.Date;

import org.junit.Before;

import ngpanwei.backlog.Backlog;
import ngpanwei.backlog.Converter;
import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BacklogStepDefs {

	Backlog backlog=null;
	@Before
	public void setup(){
		backlog=new Backlog();
	}
	@Given("^Sprint 开始日期是 (\\d+-\\d+-\\d+)$")
	public void sprint_开始日期是(@Format("yyyy-MM-dd") Date sprintStartDate) throws Throwable{
		System.err.println("Sprint Start Date:"+Converter.dateString(sprintStartDate));
	}
	@Given("^团队有任务\"(.*?)\"$")
	public void 团队有任务(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^团队完成\"(.*?)\"$")
	public void 团队完成(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^团队未完成的任务是\"(.*?)\"$")
	public void 团队未完成的任务是(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
