public class Client {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Logger logger = new Logger();

        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));

        logger.processCommands();

        infoHandler.handleMessage("This is an INFO message.", LogLevel.INFO);
        debugHandler.handleMessage("This is a DEBUG message.", LogLevel.DEBUG);
        errorHandler.handleMessage("This is an ERROR message.", LogLevel.ERROR);
    }
}
