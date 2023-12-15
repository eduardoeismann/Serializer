import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Runner {
    public static void main(String args[]) {
        MenuOptions menuOptions = new MenuOptions();
        
        menuOptions.setId(generateLongNumber());
        menuOptions.setLabel(
            JOptionPane.showInputDialog("Name of the option:")
        );
        menuOptions.setDescription(
            JOptionPane.showInputDialog("Description of the option. (Optional):")
        );
        menuOptions.setCallbacks(
            JOptionPane.showInputDialog("Function of the option:")
        );

        StringBuilder dataToStore = new StringBuilder();
        dataToStore.append("Data to store");
        dataToStore.append("\n");
        dataToStore.append("ID: ");
        dataToStore.append(menuOptions.id);
        dataToStore.append("\n");
        dataToStore.append("Label: ");
        dataToStore.append(menuOptions.label);
        dataToStore.append("\n");
        dataToStore.append("Description: ");
        dataToStore.append(menuOptions.description);
        dataToStore.append("\n");
        dataToStore.append("Callback: ");
        dataToStore.append(menuOptions.callbacks);

        JOptionPane.showMessageDialog(null, dataToStore.toString());

        try {
            FileOutputStream fos = new FileOutputStream("srlzr.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(menuOptions);
            oos.flush();
            oos.close();

            JOptionPane.showMessageDialog(null, "Data serealized!");
        } catch(Exception error) {
            JOptionPane.showMessageDialog(null, "Error trying to serealize!");
            System.out.println(error);
        }

    }

    public static Long generateLongNumber() {
        int mn = 777;
        int mx = 777777;

        StringBuilder s = new StringBuilder();
        s.append(mn + (int)(Math.random() * ((mx - mn) + 1)));
        s.append(mn + (int)(Math.random() * ((mx - mn) + 1)));
        s.append(mn + (int)(Math.random() * ((mx - mn) + 1)));

        return Long.parseLong(s.toString());
    }
}
