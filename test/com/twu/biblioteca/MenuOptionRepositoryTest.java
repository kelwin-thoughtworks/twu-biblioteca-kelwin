package com.twu.biblioteca;

import com.twu.biblioteca.model.MenuOption.IMenuOptionRepository;
import com.twu.biblioteca.model.MenuOption.MenuOptionRepository;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MenuOptionRepositoryTest {

    @Test
    public void ShouldHaveListOfBooksWhenReturnMenuOptionList() {
        IMenuOptionRepository menuOptionRepository = new MenuOptionRepository();

        var result = menuOptionRepository.GetMenuOptions();
        var searchOption = result.stream().filter(menuOption -> menuOption.getDescription().equals("List Of Books")).findFirst().get();

        assertNotNull(searchOption);
    }
}
