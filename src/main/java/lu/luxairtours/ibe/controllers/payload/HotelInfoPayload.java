package lu.luxairtours.ibe.controllers.payload;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;
import lu.luxairtours.ibe.validators.LanguageConstraint;
import lu.luxairtours.ibe.validators.DateConstraint;

public class HotelInfoPayload {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Getter
	@Setter
	@LanguageConstraint
	private String lang = "fr";
	
	@Getter
	private String departureAirport = "LUX";
	
	@Setter
	@DateConstraint
	private String dateFrom;

	@Setter
	@DateConstraint
	private String dateTo;

	public Calendar getDateFrom() throws ParseException {
		return dateFrom == null ? null : this.parseDate(dateFrom);
	}
	public Calendar getDateTo() throws ParseException {
		return dateTo == null ? null : this.parseDate(dateTo);
	}
	private Calendar parseDate(String date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(sdf.parse(date));
		return calendar;
	}
}
