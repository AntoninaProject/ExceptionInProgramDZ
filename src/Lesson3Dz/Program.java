package Lesson3Dz;

import Lesson3Dz.base.classes.Presenter;
import Lesson3Dz.base.classes.checkInputData.*;
import Lesson3Dz.base.classes.parseData.CDataParseProcessor;
import Lesson3Dz.base.classes.ui.CGetData;
import Lesson3Dz.base.classes.workWithFile.CFileCreator;
import Lesson3Dz.base.classes.workWithFile.CFileWriter;
import Lesson3Dz.base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/HomeWork3/data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}