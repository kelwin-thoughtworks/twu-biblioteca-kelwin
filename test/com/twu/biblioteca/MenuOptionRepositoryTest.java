package com.twu.biblioteca;

import com.twu.biblioteca.model.MenuOption.IMenuOptionRepository;
import com.twu.biblioteca.model.MenuOption.MenuOptionRepository;
import org.junit.Assert;
import org.junit.Test;

public class MenuOptionRepositoryTest {

    @Test
    public void ShouldReturnMenuOptionList() {
        IMenuOptionRepository menuOptionRepository = new MenuOptionRepository();

        var result = menuOptionRepository.getMenuOptions();

        Assert.assertNotNull(result);

    }
}
