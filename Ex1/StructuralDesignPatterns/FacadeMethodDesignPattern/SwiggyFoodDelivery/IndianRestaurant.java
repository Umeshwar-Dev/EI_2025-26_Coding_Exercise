public class IndianRestaurant implements Hotel {

    public Menus getMenus() {
        IndianMenu in = new IndianMenu();
        return in;
    }
}