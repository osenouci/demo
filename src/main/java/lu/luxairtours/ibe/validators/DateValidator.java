package lu.luxairtours.ibe.validators;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateConstraint, String> {

	@Override
	public void initialize(DateConstraint contactNumber) {
	}

	@Override
	public boolean isValid(String date, ConstraintValidatorContext cxt) {
		if (date == null) {
			return true;
		}

		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		try {
			sdf.parse(date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
