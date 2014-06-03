package ngpanwei.backlog;

import java.util.Date;


import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;

public class Task {
	
	public static final String STATUS_TODO = "TODO" ;
    public static final String STATUS_DOING = "DOING" ;
    public static final String STATUS_DONE = "DONE" ;

    private String name ;
    private String status ;
    @XStreamConverter(Converter.DateConverter.class)
    Date date;
    public Task(String taskName) {
        name = taskName ;
        status = STATUS_TODO ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
