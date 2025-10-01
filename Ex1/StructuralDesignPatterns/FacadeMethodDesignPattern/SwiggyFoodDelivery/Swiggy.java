public class Swiggy implements FoodDelivery {

    public IndianMenu getIndianMenu()
    {
        IndianRestaurant in = new IndianRestaurant();
        IndianMenu inMenu = (IndianMenu)in.getMenus();
        return inMenu;
        
    }

    public ItalianMenu getItalianMenu()
    {
        ItalianRestaurant it = new ItalianRestaurant();
        ItalianMenu itMenu = (ItalianMenu)it.getMenus();
        return itMenu;
        
    }

    public ChineseMenu getChineseMenu()
    {
        ChineseRestaurant ch = new ChineseRestaurant();
        ChineseMenu chMenu = (ChineseMenu)ch.getMenus();
        return chMenu;
        
    }
}