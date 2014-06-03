package ngpanwei.backlog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

public class Converter {

	public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd") ;

    public static String dateString(Date date) {
        return format.format(date) ;
    }
    public static class DateConverter extends Transformer<Date> {
        @Override
        public Date transform(String value) {
            Date date = null ;
            try {
                date = format.parse(value) ;
            } catch (ParseException ignore) {
            }       
            return date;
        }
    }

}
