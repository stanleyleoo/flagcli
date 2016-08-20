
public class FlagCli {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = " \u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";    
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_YELLOW_FL_BLUE = "\u001B[34;43m";
    
    
    public static void main(String[] args) {
        printTitle();
    }

    private static void printTitle() {
        System.out.println(ANSI_BG_YELLOW_FL_BLUE + "==================================");
        System.out.println(ANSI_BG_YELLOW_FL_BLUE + "==                              ==");
        System.out.println(ANSI_BG_YELLOW_FL_BLUE + "== WELCOME TO GIT COLLABORATION ==");
        System.out.println(ANSI_BG_YELLOW_FL_BLUE + "==         FLAG PROJECT         ==");
        System.out.println(ANSI_BG_YELLOW_FL_BLUE + "==                              ==");
        System.out.println(ANSI_BG_YELLOW_FL_BLUE + "==================================");
        System.out.println("");
        System.out.println("Indonesia");
        printIdFlag();
        System.out.println("");
        System.out.println("Italy");
        printItFlag();
        System.out.println("");
        System.out.println("Netherland");        
        printNrFlag();
        System.out.println("");
    }
    
    private static void printIdFlag() {
        System.out.println(ANSI_BG_RED +   "                ");
        System.out.println(ANSI_BG_RED +   "                ");        
        System.out.println(ANSI_BG_WHITE + "                ");
        System.out.println(ANSI_BG_WHITE + "                ");        
    }
    
    
    
    private static void printItFlag() {        
        
        
        
        
    }

    
    private static void printNrFlag() {
        
        
                
        
    }
}
