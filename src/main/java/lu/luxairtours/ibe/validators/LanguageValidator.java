package lu.luxairtours.ibe.validators;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LanguageValidator implements
ConstraintValidator<LanguageConstraint, String> {

	private final static List<String> supportedLanguages = Arrays.asList(new String[]{"fr", "de", "en"});
	
	@Override
    public void initialize(LanguageConstraint contactNumber) {
    }
	
	@Override
    public boolean isValid(String languageField,
      ConstraintValidatorContext cxt) {
		return languageField == null ? false :
		supportedLanguages.contains(languageField.toLowerCase());
    }
	
}
