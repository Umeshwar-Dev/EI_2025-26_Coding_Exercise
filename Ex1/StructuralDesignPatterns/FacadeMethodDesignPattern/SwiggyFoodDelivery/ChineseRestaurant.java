public class ChineseRestaurant implements Hotel {

    public Menus getMenus() {
        ChineseMenu ch = new ChineseMenu();
        return ch;
    }
}