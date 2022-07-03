/*
    Author: .GuTeK <wiktor@tntcode.pl>
    Project: TNT-MONEY [https://tntcode.pl/plugins/TNT-MONEY]
    Resources: 2/1600
    Date: 25.06.2022
    Contact Discord: .GuTeK#0001
    Contact e-mail: wiktor@tntcode.pl
    Our Websites: https://tntnetwork.pl / https://tntcode.pl
    ⓒ 2022 by .GuTeK | ALL RIGHTS RESERVED |
*/

package GuTeK.activation.registries;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogSupport {
    private static boolean debug;
    private static Logger logger;
    private static final Level level;

    private LogSupport() {
    }

    public static void log(final String msg) {
        if (LogSupport.debug) {
            System.out.println(msg);
        }
        LogSupport.logger.log(LogSupport.level, msg);
    }

    public static void log(final String msg, final Throwable t) {
        if (LogSupport.debug) {
            System.out.println(msg + "; Exception: " + t);
        }
        LogSupport.logger.log(LogSupport.level, msg, t);
    }

    public static boolean isLoggable() {
        return LogSupport.debug || LogSupport.logger.isLoggable(LogSupport.level);
    }

    static {
        LogSupport.debug = false;
        level = Level.FINE;
        try {
            LogSupport.debug = Boolean.getBoolean(name: "javax.activation.debug");
        }
        catch (Throwable t) {}
        LogSupport.logger = Logger.getLogger(name: "javax.activation");
    }
}
