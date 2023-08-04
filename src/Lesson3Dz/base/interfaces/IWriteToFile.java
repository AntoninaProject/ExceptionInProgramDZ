package Lesson3Dz.base.interfaces;

import Lesson3Dz.base.exceptions.MyFileCreateException;
import Lesson3Dz.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
