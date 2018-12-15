public class Client {
    public static void main(String[] args) throws Exception {
        //it will produce error
        //new CommandExecuterProxy("parsa", "1234").runCommand("rm fuck.php");
        new CommandExecuterProxy("parsa", "1234").runCommand("touch fuck.php");
    }
}
