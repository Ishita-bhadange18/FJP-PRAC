import java.awt.*;
import java.awt.event.*;

public class MenuExample extends Frame {
    public MenuExample() {
        setTitle("Menu Example");
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create menu bar
        MenuBar menuBar = new MenuBar();

        // Create menu
        Menu fileMenu = new Menu("File");

        // Create menu items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");

        // Add menu items to the menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Create submenu
        Menu editMenu = new Menu("Edit");

        // Create submenu items
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");

        // Add submenu items to the submenu
        editMenu.add(cutItem);
        editMenu.add(copyItem);

        // Add submenu to the menu
        fileMenu.add(editMenu);

        // Add menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        setMenuBar(menuBar);
    }

    public static void main(String[] args) {
        MenuExample menuExample = new MenuExample();
        menuExample.setVisible(true);
    }
}

