package Lesson3Dz.base.abstractClasses;

import Lesson3Dz.base.classes.workWithFile.CFileCreator;
import Lesson3Dz.base.classes.workWithFile.CFindTheSameFileName;
import Lesson3Dz.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
