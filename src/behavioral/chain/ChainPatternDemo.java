package behavioral.chain;

/**
 * 责任链模式
 */
public class ChainPatternDemo {

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"info");
        loggerChain.logMessage(AbstractLogger.DEBUG,"debug");
        loggerChain.logMessage(AbstractLogger.ERROR,"error");
    }

    public static AbstractLogger getChainLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;

    }
}
