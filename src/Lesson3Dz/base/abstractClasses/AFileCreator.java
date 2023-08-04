package Lesson3Dz.base.abstractClasses;

import Lesson3Dz.base.interfaces.ICreateFile;

import java.io.File;

public abstract class AFileCreator implements ICreateFile {
    protected File file;
}
