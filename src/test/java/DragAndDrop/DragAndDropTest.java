package DragAndDrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest extends BaseTest{
    private final String URL = "https://the-internet.herokuapp.com/drag_and_drop";

    @Test
    public void dragAndDrop() {
        driver.get(URL);

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        Actions builder = new Actions(driver);

        builder.dragAndDrop(from, to).build().perform();

        Assertions.assertEquals("A", to.getText());
        Assertions.assertEquals("B", from.getText());
    }
}
