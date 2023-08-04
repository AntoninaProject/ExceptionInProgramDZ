package Lesson3Dz.base.classes.checklnputData;

import Lesson3Dz.base.abstractClasses.ACheckQuantity;
import Lesson3Dz.base.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}