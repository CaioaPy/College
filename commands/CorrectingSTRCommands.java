public class CorrectingSTRCommands {
	
    public static void main(String[] args) {
        String name = "   CalLeB     ";
        String finalname = "Mister Calleb";
        System.out.println(name);
        // output =  "   CalLeB      "
        System.out.println(name.trim());
        // output = "CalLeB"
        System.out.println(name.toLowerCase().trim());
        // output = "CALLEB"
        System.out.println(name.toUpperCase().trim());
        // output = "calleb"
        finalname = finalname.replace("Mister", "Mr.");
        System.out.println(finalname);
        // output = "Mr. Calleb"
    }
}
