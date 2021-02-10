package com.twu.biblioteca.model.MenuOption;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuOptionRepository implements IMenuOptionRepository {

    @Override
    public List<MenuOption> GetMenuOptions() {
        List<MenuOption> menuOptions = new ArrayList<MenuOption>();

        menuOptions.add(new MenuOption(1,"List Of Books"));
        menuOptions.add(new MenuOption(2,"Checkout a Book"));
        menuOptions.add(new MenuOption(3,"Return a Book"));

        return menuOptions;
    }
}
