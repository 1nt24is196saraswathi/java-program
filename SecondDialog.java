import javax.swing.JOptionPane;
public class SecondDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null,"What is your name" , "Surprise....!" ,
         JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Happy Birthday, my dear friend! 🎂🥳 \n Wishing you a day filled with happiness, laughter, and lots of beautiful memories.\n May all your dreams come true and may you always keep smiling! ❤️✨ ");
        System.exit(0);
    }
}