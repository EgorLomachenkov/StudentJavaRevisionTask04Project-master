package by.itstep.javatraining.revision.controller;

import by.itstep.javatraining.revision.test.TaskTester;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }
    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.INFO);
        String msg = TaskTester.testingTask01();
        msg += "\n" + TaskTester.testingTask02();
        msg += "\n" + TaskTester.testingTask03();
        msg += "\n" + TaskTester.testingTask04();
        msg += "\n" + TaskTester.testingTask05();
        msg += "\n" + TaskTester.testingTask06();
        msg += "\n" + TaskTester.testingTask07();
        msg += "\n" + TaskTester.testingTaskX();
        LOGGER.info(msg);
    }
}
