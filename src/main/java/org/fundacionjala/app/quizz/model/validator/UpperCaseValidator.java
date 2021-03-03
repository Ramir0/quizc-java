package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class UpperCaseValidator implements Validator {

    private static final String ERROR_MESSAGE = "The value text is only uppercase";

    @Override
    public void validate(String value, String conditionValueString, List<String> errors) {
            if (!(value.toUpperCase().equals(value))) {
                errors.add(ERROR_MESSAGE);
            }
    }
}
