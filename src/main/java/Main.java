import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Buttons controlsKeyPad
        Button one = new Button("one", 1 , 3);
        Button two = new Button("two", 2 , 3);
        Button three = new Button("three", 3 , 3);
        Button four = new Button("four", 1 , 2);
        Button five = new Button("five", 2, 2);
        Button six = new Button("six", 3 , 2);
        Button seven = new Button("seven", 1 , 1);
        Button eight = new Button("eight", 2 , 1);
        Button nine = new Button("nine", 3 , 1);
        Button zero = new Button("zero", 2 , 4);
        Button activate = new Button("activate", 3 , 4);
        Button empty = new Button("empty", 1 , 4);

        List<Button> buttonsKeyPad = new ArrayList<Button>();
        buttonsKeyPad.add(one);
        buttonsKeyPad.add(two);
        buttonsKeyPad.add(three);
        buttonsKeyPad.add(four);
        buttonsKeyPad.add(five);
        buttonsKeyPad.add(six);
        buttonsKeyPad.add(seven);
        buttonsKeyPad.add(eight);
        buttonsKeyPad.add(nine);
        buttonsKeyPad.add(zero);
        buttonsKeyPad.add(activate);
        buttonsKeyPad.add(empty);


        // Buttons robotMovementPad
        Button emptyRobotButton = new Button("empty", 1 , 1);
        Button up = new Button("up", 2 , 1);
        Button activateRobotPad = new Button("activate", 3 , 1);
        Button left = new Button("left", 1 , 2);
        Button down = new Button("down", 2 , 2);
        Button right = new Button("right", 3 , 2);

        List<Button> buttonsRobotPad = new ArrayList<Button>();

        buttonsRobotPad.add(up);
        buttonsRobotPad.add(left);
        buttonsRobotPad.add(down);
        buttonsRobotPad.add(right);
        buttonsRobotPad.add(activateRobotPad);
        buttonsRobotPad.add(emptyRobotButton);

        // Create Controls
        Controls keyPad = new Controls(buttonsKeyPad, "keyPad");
        Controls robotPadOne = new Controls(buttonsRobotPad, "robotPadOne");
        Controls robotPadTwo = new Controls(buttonsRobotPad, "robotPadTwo");
        Controls robotPadThree = new Controls(buttonsRobotPad, "robotPadThree");
        Controls userPad = new Controls(buttonsRobotPad, "userPad");


    }

    // TODO: Make a console running script with code input and output
    // turn the input into an array
    // Run trough the array running keyPad.goToLocation for each element
    // Add each return value to the output string.
}
