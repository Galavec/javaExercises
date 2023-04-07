import java.awt.*;
import javax.swing.*;

/*
 * @description: Coding to display a window with elements.
 * @createdDate: 07/04/2023 04:06 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class ShowWindow extends JFrame {
    // Declaration of global variables
    JPanel mainCanvas;
    JPanel topCanvas;
    JPanel bottomCanvas;

    JButton buttonOk;
    JButton buttonCancel;

    JTextArea textArea;

    JComboBox<String> comboBox;

    public ShowWindow() {
        setTitle("GIT - GALAVEC");
        setSize(400, 200);
        setLocationRelativeTo(null);

        // Initializing objects
        mainCanvas = new JPanel();
        topCanvas = new JPanel();
        bottomCanvas = new JPanel();

        buttonOk = new JButton("OK");
        buttonCancel = new JButton("CANCEL");

        textArea = new JTextArea(5, 10);

        comboBox = new JComboBox<>();

        Container setOfElements = getContentPane();

        // attribute settings for canvases
        mainCanvas.setLayout(new GridLayout(3, 1));
        topCanvas.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomCanvas.setLayout(new FlowLayout(FlowLayout.CENTER));

        // filling the combo-box
        comboBox.addItem("ONE");
        comboBox.addItem("TWO");
        comboBox.addItem("THREE");

        // Adding items to panels
        topCanvas.add(buttonOk);
        topCanvas.add(buttonCancel);

        bottomCanvas.add(comboBox);

        mainCanvas.add(topCanvas);
        mainCanvas.add(textArea);
        mainCanvas.add(bottomCanvas);

        // Add panel to window
        setOfElements.add(mainCanvas);
    }

    public static void main(String[] args) {
        ShowWindow showWindow = new ShowWindow();
        showWindow.setVisible(true);
    }
}