import java.util.ArrayList;
import java.util.List;

public class Controls {
    // Variables
    private String name;
    private List<Button> buttons = new ArrayList<Button>();
    private int curColPos;
    private int curRowPos;
    private boolean run;

    // Constructors
    public Controls(List<Button> buttons, String name) {
        this.buttons = buttons;
        this.name = name;
        this.run = false;
        // Will search the list buttons for the button with the value of activate then take the position and save it in the currnt position.
        for(Button b : buttons) {
            if(b.getValue() == "activate") {
                this.curColPos = b.getColPos();
                this.curRowPos = b.getRowPos();
            }
        }

    }
    // Getters
    public String getName() {
        return name;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public int getCurColPos() {
        return curColPos;
    }

    public int getCurRowPos() {
        return curRowPos;
    }

    // Setters
    public void setCurColPos(int curColPos) {
        this.curColPos = curColPos;
    }

    public void setCurRowPos(int curRowPos) {
        this.curRowPos = curRowPos;
    }

    // Methods
    public String goToLocation(String targetLocation) {

        // TODO: figure out how to make it go to activate each time
        // Get Target Location
        int targetColPos = 0;
        int targetRowPos = 0;

        for(Button b : buttons) {
            if(b.getValue() == targetLocation) {
                targetColPos = b.getColPos();
                targetRowPos = b.getRowPos();
            }
        }
        // Start running
        String output = "";
        run = true;

        while(run) {
            if(curColPos != targetColPos) {
                if(curRowPos < targetRowPos) {
                    if(this.name == "userPad")  output = "<";
                    else goToLocation("left");
                }
                else if(curRowPos > targetRowPos) {
                    if(this.name == "userPad") output = ">";
                    else goToLocation("right");
                }
            }
            else {
                if(curRowPos != targetRowPos) {
                    if(curRowPos < targetRowPos) {
                        if(this.name == "userPad")  output = "^";
                        else goToLocation("up");
                    }
                    else if(curRowPos > targetRowPos) {
                        if(this.name == "userPad") output = "^";
                        else goToLocation("down");
                    }
                }
                else {
                    run = false;
                }
            }
        }
        return output;
     }
}
