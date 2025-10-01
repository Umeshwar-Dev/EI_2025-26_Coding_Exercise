public class Client
{
    public static void main (String[] args)
    {
        Swiggy swiggy = new Swiggy();
        
        ChineseMenu ch = swiggy.getChineseMenu();
        ItalianMenu it = swiggy.getItalianMenu();
        IndianMenu in = swiggy.getIndianMenu();
        ch.showMenu();
        in.showMenu();
        it.showMenu();
    }
}