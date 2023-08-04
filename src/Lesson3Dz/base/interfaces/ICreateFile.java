package Lesson3Dz.base.interfaces;

import Lesson3Dz.base.exceptions.FileCreateException;

import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}