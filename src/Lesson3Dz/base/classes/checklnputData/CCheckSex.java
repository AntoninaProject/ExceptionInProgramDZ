package Lesson3Dz.base.classes.checklnputData;

import Lesson3Dz.base.abstractClasses.ACheckData;
import Lesson3Dz.base.exceptions.CheckSexException;
import Lesson3Dz.base.exceptions.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}
